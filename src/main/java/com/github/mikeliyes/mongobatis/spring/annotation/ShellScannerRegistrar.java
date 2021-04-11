package com.github.mikeliyes.mongobatis.spring.annotation;

import java.util.Map;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

public class ShellScannerRegistrar implements ImportBeanDefinitionRegistrar{

	  @Override
	  public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
	    System.out.println("registerBeanDefinitions");
	    Map<String, Object>  shellMap = importingClassMetadata.getAnnotationAttributes(ShellScan.class.getName());
	    AnnotationAttributes mapperScanAttrs = AnnotationAttributes
	            .fromMap(shellMap);
	        if (mapperScanAttrs != null) {
	          registerBeanDefinitions(mapperScanAttrs, registry, generateBaseBeanName(importingClassMetadata, 0));
	    }
	  }
	  
	  private static String generateBaseBeanName(AnnotationMetadata importingClassMetadata, int index) {
		    return importingClassMetadata.getClassName() + "#" + ShellScannerRegistrar.class.getSimpleName() + "#" + index;
	  }
	  
	  void registerBeanDefinitions(AnnotationAttributes annoAttrs, BeanDefinitionRegistry registry, String beanName) {
		  BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(ShellScannerConfigurer.class);
		  registry.registerBeanDefinition(beanName, builder.getBeanDefinition());
	  }

}
