package com.graphql.example.tests.api;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

import com.graphql.example.pojo.Distance;
import com.graphql.example.pojo.Launch;
import com.graphql.example.pojo.Rocket;
import com.graphql.example.pojo.RocketEngines;

public class LaunchNextTests extends BaseTest {
	@Test
	void testGetLaunchNextDataWithPojo() {
		final Launch launch = this.api.getNextLaunch().asPojo(Launch.class);
		assertThat(launch.getLaunch_year(), equalTo("2020"));
		assertThat(launch.getMission_name(), equalTo("CRS-21"));
		assertThat(launch.getMission_id().get(0), equalTo("EE86F74"));
	}
	
	@Test
	void testGetLaunchNextRocketSizeWithPojo() {
		final Launch launch = this.api.getNextLaunch().asPojo(Launch.class);
		final Rocket rocket = launch.getRocket().getRocket();
		assertThat(rocket.getId(), equalTo("falcon9"));
		final Distance height = rocket.getHeight();
		assertThat(height.getFeet(), equalTo(229.6));
		assertThat(height.getMeters(), equalTo(70.0));
	}
	
	@Test
	void testGetLaunchNextRocketInfoWithPojo() {
		final Launch launch = this.api.getNextLaunch().asPojo(Launch.class);
		final Rocket rocket = launch.getRocket().getRocket();
		assertThat(rocket.getCompany(), equalTo("SpaceX"));
		final RocketEngines engines = rocket.getEngines();
		assertThat(engines.getPropellant_1(), equalTo("liquid oxygen"));
		assertThat(engines.getType(), equalTo("merlin"));
	}
}
