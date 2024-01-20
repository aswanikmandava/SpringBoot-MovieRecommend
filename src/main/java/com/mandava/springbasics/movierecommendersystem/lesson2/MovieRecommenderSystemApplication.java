package com.mandava.springbasics.movierecommendersystem.lesson2;

import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		// SpringApplication.run(MovieRecommenderSystemApplication.class, args)
		
		// Passing name of the filter as a constructor argument
		RecommenderImplementation recommender = new RecommenderImplementation(new ContentBaseFilter());
		
		// get movie recommendations
		String[] result = recommender.recommendMovies("Finding Dory");

		System.out.println("Movie recommendations: " + Arrays.toString(result));
	}

}
