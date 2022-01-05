package com.graphql.example.response;

import java.util.List;
import java.util.Locale;

import org.hamcrest.Matcher;

import com.fasterxml.jackson.annotation.JsonRootName;
import io.restassured.response.Response;

public class AssertableGraphQLResponse {
	private final Response response;
	
	public AssertableGraphQLResponse(final Response response) {
		this.response = response;
	}
	
	public AssertableGraphQLResponse body(final String jsonPath, final Matcher<?> matcher) {
		this.response.then().body(jsonPath, matcher);
		return this;
	}
	
	public <T> T asPojo(final Class<T> tClass) {
		final T object = this.response.then().extract().jsonPath().getObject(this.getJsonPath(tClass), tClass);
		if (object == null) {
			throw new RuntimeException("Can't deserialize pojo from response");
		}
		return object;
	}
	
	private String getJsonPath(final Class<?> tClass) {
		final JsonRootName rootName = tClass.getAnnotation(JsonRootName.class);
		String name  = "data";
		if (rootName != null) {
			name += "." + rootName.value();
		} else  {
			name += "." + tClass.getSimpleName().toLowerCase(Locale.ENGLISH);
		}
		return name;
	}
	
	public <T> List<T> asList(final Class<T> tClass) {
		return this.response.then().extract().jsonPath().getList(this.getJsonPath(tClass), tClass);
	}
}
