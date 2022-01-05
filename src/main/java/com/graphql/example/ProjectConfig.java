package com.graphql.example;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({"classpath:config.properties"})
public interface ProjectConfig extends Config {
	@DefaultValue("dev")
	String env();
	
	@Key("${env}.apiUrl")
	String apiUrl();
	
	@Key("logEnabled")
	boolean logger();
}
