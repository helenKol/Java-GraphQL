package com.graphql.example.tests.api;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

import com.graphql.example.pojo.Address;
import com.graphql.example.pojo.Info;
import com.graphql.example.pojo.InfoLinks;

public class CompanyTests extends BaseTest {
	@Test
	void testGetCompanyCeo() {
		this.api.getCompanyInfo().body("data.company.ceo", equalTo("Elon Musk"));
	}
	
	@Test
	void testGetCompanyCeoWithPojo() {
		final Info companyInfo = this.api.getCompanyInfo().asPojo(Info.class);
		assertThat(companyInfo.getCeo(), equalTo("Elon Musk"));
	}
	
	@Test
	void testGetCompanyNameWithPojo() {
		final Info companyInfo = this.api.getCompanyInfo().asPojo(Info.class);
		assertThat(companyInfo.getName(), equalTo("SpaceX"));
	}
	
	@Test
	void testGetCompanyLinksWithPojo() {
		final Info companyInfo = this.api.getCompanyInfo().asPojo(Info.class);
		final InfoLinks links = companyInfo.getLinks();
		assertThat(links.getElon_twitter(), equalTo("https://twitter.com/elonmusk"));
		assertThat(links.getFlickr(), equalTo("https://www.flickr.com/photos/spacex/"));
		assertThat(links.getTwitter(), equalTo("https://twitter.com/SpaceX"));
		assertThat(links.getWebsite(), equalTo("https://www.spacex.com/"));
	}
	
	@Test
	void testGetCompanyHeadquarterWithPojo() {
		final Info companyInfo = this.api.getCompanyInfo().asPojo(Info.class);
		final Address headquarters = companyInfo.getHeadquarters();
		assertThat(headquarters.getAddress(), equalTo("Rocket Road"));
		assertThat(headquarters.getCity(), equalTo("Hawthorne"));
		assertThat(headquarters.getState(), equalTo("California"));
	}
}
