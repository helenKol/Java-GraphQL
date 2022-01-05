package com.graphql.example.tests.client;

import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

import com.graphql.example.GqlUtils;
import com.graphql.example.client.GraphQLClient;
import com.graphql.example.client.GraphQLQuery;

public class FirstGraphQLTestWithClient {
	private final GraphQLClient graphQLClient = new GraphQLClient("https://api.spacex.land/graphql/", false);
	
	@Test
	void testCanGetCeo() {
		final String query = "{\"query\": \"{ company { employees name ceo coo }}\"}";
		this.graphQLClient.execute(query).then().body("data.company.ceo", equalTo("Elon Musk"));
	}
	
	@Test
	void testCanGetCeoWithCeo() {
		final GraphQLQuery query = GqlUtils.readGql("queries/company.gql");
		this.graphQLClient.execute(query).then().body("data.company.ceo", equalTo("Elon Musk"));
	}
	
	@Test
	void testCanGetCeoWithCeoClean() {
		this.graphQLClient.executeGql("queries/company.gql").then()
				.body("data.company.ceo", equalTo("Elon Musk"));
	}
}
