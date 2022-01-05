package com.graphql.example.tests.api;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.graphql.example.pojo.Users;

public class UsersTests extends BaseTest{
	@Test
	void testGetAllUsersNumber() {
		final List<?> users = this.api.getAllUsers().asList(Users.class);
		assertThat(users.size(), equalTo(10));
	}

	@Test
	void testGetNumberOfUsers() {
		final Map<String, Integer> variables = Map.of("limit", 2);
		final List<?> users = this.api.getUsers(variables).asList(Users.class);
		assertThat(users.size(), equalTo(variables.values().stream().findFirst().get()));
	}

	@Test
	void testGetUserByName() {
		final Map<?, ?> condition = Map.of("where", Map.of("name", Map.of("_like", "User%")));
		final List<Users> users = this.api.getUserByCondition(condition).asList(Users.class);
		assertThat(users.size(), equalTo(1));
		assertThat(users.get(0).getName(), equalTo("User_12690680"));
	}
	
	@Test
	void testGetAllUserDataById() {
		final String id = "12c96f50-d8f2-4e01-9c51-162a9020a42e";
		final Map<?, ?> condition = Map.of("where", Map.of("id", Map.of("_eq", id)));
		final List<Users> users = this.api.getUserByCondition(condition).asList(Users.class);
		assertThat(users.size(), equalTo(1));
		assertThat(users.get(0).getId(), equalTo(id));
		assertThat(users.get(0).getName(), equalTo("New user"));
		assertThat(users.get(0).getRocket(), equalTo("Falcon"));
		assertThat(users.get(0).getTimestamp(), equalTo("2021-09-01T18:24:56.796435+00:00"));
		assertThat(users.get(0).getTwitter(), equalTo(""));
	}
	
	@Test
	void testGetUserDataByNameAndRocket() {
		final String id = "12c96f50-d8f2-4e01-9c51-162a9020a42e";
		final Map<?, ?> condition = Map.of("where", Map.of("id", Map.of("_eq", id)));
		final List<Users> users = this.api.getUserByCondition(condition).asList(Users.class);
		assertThat(users.size(), equalTo(1));
		assertThat(users.get(0).getId(), equalTo(id));
		assertThat(users.get(0).getName(), equalTo("New user"));
		assertThat(users.get(0).getRocket(), equalTo("Falcon"));
		assertThat(users.get(0).getTimestamp(), equalTo("2021-09-01T18:24:56.796435+00:00"));
		assertThat(users.get(0).getTwitter(), equalTo(""));
	}
}
