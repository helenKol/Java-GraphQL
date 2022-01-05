package com.graphql.example.service;

import java.util.Map;

import com.graphql.example.client.GraphQLClient;
import com.graphql.example.response.AssertableGraphQLResponse;
import io.qameta.allure.Step;

public class GraphQLApiService {
	private GraphQLClient graphQLClient;
	
	public GraphQLApiService(final GraphQLClient graphQLClient) {
		this.graphQLClient = graphQLClient;
	}
	
	@Step
	public AssertableGraphQLResponse getCompanyInfo() {
		return this.graphQLClient.executeGql("queries/company.gql").then();
	}
	
	@Step
	public AssertableGraphQLResponse getAllUsers() {
		return this.graphQLClient.executeGql("queries/users.gql").then();
	}
	
	@Step
	public AssertableGraphQLResponse getUsers(Map<?, ?> number) {
		return this.graphQLClient.executeGql("queries/users.gql", number).then();
	}
	
	@Step
	public AssertableGraphQLResponse getUserByCondition(Map<?, ?> condition) {
		return this.graphQLClient.executeGql("queries/user_by_condition.gql", condition).then();
	}
	
	@Step
	public AssertableGraphQLResponse getNextLaunch() {
		return this.graphQLClient.executeGql("queries/launch_next.gql").then();
	}
}
