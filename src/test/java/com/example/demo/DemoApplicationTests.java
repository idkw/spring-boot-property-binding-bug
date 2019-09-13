package com.example.demo;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Value("${kebab-case.property.value}")
	String kebabCasePropertyValue;

	@Value("${kebab-andCamelCase.property.value}")
	String kebabAndCamelCasePropertyValue;

	@Test
	public void testPropertyBinding() {
		assertThat("kebabCasePropertyValue not bound correctly", kebabCasePropertyValue, is("changed"));
		assertThat("kebabAndCamelCasePropertyValue not bound correctly", kebabAndCamelCasePropertyValue, is("changed"));
	}

}
