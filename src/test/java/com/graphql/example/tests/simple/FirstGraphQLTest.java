package com.graphql.example.tests.simple;

import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;

public class FirstGraphQLTest {
	
	@Test
	void testCanGetCeo() {
		final String query = "{\"query\": \"{ company { employees name ceo coo }}\"}";
		
		RestAssured.given()
				.contentType(ContentType.JSON)
				.filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
				.body(query)
				.when()
				.post("https://api.spacex.land/graphql/")
				.then()
				.assertThat()
				.body("data.company.ceo", equalTo("Elon Musk"));
	}
}
