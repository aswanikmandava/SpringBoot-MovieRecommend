package com.mandava.springbasics.movierecommendersystem.lesson13;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@ComponentScan
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		//ApplicationContext manages the beans and dependencies
		//ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(MovieRecommenderSystemApplication.class);
		
		// Use ApplicationContext to find which filter is being used
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);
		
		// Call method to get movie recommendations
		String[] results = recommender.recommendMovies("Finding Dory");
		
		// Display results
		System.out.println("Movie results: " + Arrays.toString(results));
		
		appContext.close();
	}

}
