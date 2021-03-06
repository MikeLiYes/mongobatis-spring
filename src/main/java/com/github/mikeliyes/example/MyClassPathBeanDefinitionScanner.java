package com.github.mikeliyes.example;

import java.util.Set;

import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.filter.AnnotationTypeFilter;

public class MyClassPathBeanDefinitionScanner extends ClassPathBeanDefinitionScanner {
	public MyClassPathBeanDefinitionScanner(BeanDefinitionRegistry registry, boolean useDefaultFilters) {
		super(registry, useDefaultFilters);
	}
	protected void registerFilters() {
		addIncludeFilter(new AnnotationTypeFilter(MyMapper.class));
	}
	@Override
	protected Set<BeanDefinitionHolder> doScan(String... basePackages) {
		return super.doScan(basePackages);
	}
}
