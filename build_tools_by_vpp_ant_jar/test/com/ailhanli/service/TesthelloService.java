package com.ailhanli.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static  org.mockito.Mockito.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ailhanli.AppConfig;
import com.ailhanli.properties.AppProperties;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AppConfig.class)
public class TesthelloService {

	private HelloService service;
	
	
	@Before
	public void setup() {
		AppProperties properties = mock(AppProperties.class);
		
		when(properties.getMessage()).thenReturn("Abdullah");
		
		service = new HelloServiceImpl(properties);
	}
	
	
	@Test
	public void test_getCorrectMessage() {
		
		String expected="Abdullah";
		
		String actual = service.getMessage();
		
		assertEquals(expected, actual);
	}
	
}