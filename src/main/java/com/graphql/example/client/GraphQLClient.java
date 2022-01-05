package com.graphql.example.client;

import com.graphql.example.GqlUtils;
import com.graphql.example.ProjectConfig;
import com.graphql.example.response.GraphQLResponse;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class GraphQLClient {
	private final String url;
	final RequestSpecification requestSpecification = RestAssured.given()
			.contentType(ContentType.JSON);
	
	public GraphQLClient(final String url, final boolean logEnabled) {
		this.url = url;
		if (logEnabled) {
			this.requestSpecification.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
		}
	}
	
	public GraphQLClient(final ProjectConfig config) {
		this.url = config.apiUrl();
		if (config.logger()) {
			this.requestSpecification.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
		}
	}
	
	public GraphQLResponse execute(final String query) {
		return new GraphQLResponse(this.requestSpecification.body(query).when().post(this.url));
	}
	
	public GraphQLResponse execute(final GraphQLQuery query) {
		return new GraphQLResponse(this.requestSpecification.body(query).when().post(this.url));
	}
	
	public GraphQLResponse executeGql(final String fileName) {
		return this.execute(GqlUtils.readGql(fileName));
	}
	
	public GraphQLResponse executeGql(final String fileName, final Object variable) {
		return this.execute(GqlUtils.readGql(fileName, variable));
	}
}
