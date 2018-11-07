package com.ailhanli.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class AppProperties {

	@Autowired
	private  Environment env;
	
	public String getMessage() {
		return env.getProperty("message");
	}
}