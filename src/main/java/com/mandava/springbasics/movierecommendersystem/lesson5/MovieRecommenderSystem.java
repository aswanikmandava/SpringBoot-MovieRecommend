package com.mandava.springbasics.movierecommendersystem.lesson5;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommenderSystem {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystem.class, args);
		
		// RecommenderImplementation injects dependency using Constructor
		System.out.println("Dependency Injection using Constructor");
		System.out.println("**************************************");
		RecommenderImplementation ri = appContext.getBean(RecommenderImplementation.class);
		String[] results = ri.recommendMovies("Finding Dory");
		System.out.println("Results: " + Arrays.toString(results));
		
		// RecommenderImplementation injects dependency using Setter method
		System.out.println("Dependency Injection using Setter method");
		System.out.println("****************************************");
		RecommenderImplementation2 ri2 = appContext.getBean(RecommenderImplementation2.class);
		results = ri2.recommendMovies("Finding Dory");
		System.out.println("Results: " + Arrays.toString(results));

	}

}
