package com.graphql.example.client;

import lombok.Getter;

@Getter
public class GraphQLQuery {
	private final String query;
	private Object variables;
	
	public GraphQLQuery(final String query) {
		this.query = query;
	}
	
	public GraphQLQuery(final String query, final Object variables) {
		this.query = query;
		this.variables = variables;
	}
}
