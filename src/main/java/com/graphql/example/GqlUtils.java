package com.graphql.example;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.Objects;

import com.graphql.example.client.GraphQLQuery;

public class GqlUtils {
	public static GraphQLQuery gql(final String queryString) {
		return new GraphQLQuery(queryString);
	}
	
	public static GraphQLQuery gql(final String queryString, final Object variables) {
		return new GraphQLQuery(queryString, variables);
	}
	
	private static String readFile(final String name) {
		final URL url = GqlUtils.class.getClassLoader().getResource(name);
		final File file = new File(Objects.requireNonNull(url).getFile());
		try {
			return new String(Files.readAllBytes(file.toPath()));
		}
		catch (final IOException ex) {
			throw new RuntimeException("Unable to read " + name);
		}
	}
	
	public static GraphQLQuery readGql(final String name) {
		return gql(readFile(name));
	}
	
	public static GraphQLQuery readGql(final String name, final Object variable) {
		return gql(readFile(name), variable);
	}
}
