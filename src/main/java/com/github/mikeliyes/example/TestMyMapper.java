package com.github.mikeliyes.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMyMapper {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(MyMapperConfig.class);
		context.refresh();

		MyService myService = (MyService)context.getBean("myService");
		System.out.println(myService);
	}
}
