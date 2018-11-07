package com.ailhanli;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ailhanli.service.HelloService;

public class SpringClient {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);

		HelloService hs = container.getBean(HelloService.class);

		System.out.println(hs.getMessage());
		
		container.close();
	}
}