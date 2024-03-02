package com.mandava.springbasics.movierecommendersystem.lesson10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(basePackages={"com.mandava.springbasics.movierecommendersystem.lesson10"})
@ComponentScan(includeFilters = @ComponentScan.Filter (
        type= FilterType.REGEX, 
        pattern="com.mandava.springbasics.movierecommendersystem.lesson9.*"))
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		
		// Check if Beans are found
		System.out.println("CollaborativeFilter bean found: " + appContext.containsBean("collaborativeFilter"));
		System.out.println("ContentBasedFilter bean found: " + appContext.containsBean("contentBasedFilter"));
	}

}
