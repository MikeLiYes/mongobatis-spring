package com.github.mikeliyes.mongobatis.spring.annotation;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class ShellScannerRegistrar implements ImportBeanDefinitionRegistrar{

	  @Override
	  public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
	    System.out.println("registerBeanDefinitions");
	  }

}
