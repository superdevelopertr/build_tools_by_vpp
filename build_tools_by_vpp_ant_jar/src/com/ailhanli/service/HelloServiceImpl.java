package com.ailhanli.service;

import org.springframework.stereotype.Service;

import com.ailhanli.properties.AppProperties;

@Service
public class HelloServiceImpl implements HelloService {

	private final AppProperties properties;

	public HelloServiceImpl(AppProperties properties) {
		super();
		this.properties = properties;
	}

	@Override
	public String getMessage() {
		return properties.getMessage();
	}
}