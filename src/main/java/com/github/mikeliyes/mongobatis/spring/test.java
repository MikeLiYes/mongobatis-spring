package com.github.mikeliyes.mongobatis.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.github.mikeliyes.mongobatis.spring.annotation.ShellScan;
import com.github.mikeliyes.mongobatis.spring.annotation.ShellScannerRegistrar;

@ShellScan("hello.dao")
public class test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ShellScan.class);
        ctx.refresh();
        printBeans(ctx);
	}
	
	private static void printBeans(AnnotationConfigApplicationContext applicationContext) {
		String[] definitionNames = applicationContext.getBeanDefinitionNames();
		for (String name : definitionNames) {
			System.out.println(name);
		}
	}

}
