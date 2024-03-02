package com.mandava.springbasics.movierecommendersystem.lesson11;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommendationSystemApplication {

	public static void main(String[] args) {
		// ApplicationContext manages the beans and dependencies
		ApplicationContext appContext = SpringApplication.run(MovieRecommendationSystemApplication.class, args);
		
		// Use ApplicationContext to get the recommender object
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);
		
		System.out.println("RecommenderImplementation object: " + recommender);
		
		// Use recommender to find movies
		String[] movies = recommender.getRecommendations("Finding Dory");
		
		System.out.println("Recommended Movies: " + Arrays.toString(movies));

	}

}
