package com.graphql.example.tests.api;

import org.aeonbits.owner.ConfigFactory;

import com.graphql.example.ProjectConfig;
import com.graphql.example.client.GraphQLClient;
import com.graphql.example.service.GraphQLApiService;

public class BaseTest {
	protected final GraphQLApiService api = new GraphQLApiService(
			new GraphQLClient(ConfigFactory.create(ProjectConfig.class, System.getProperties())));
}
