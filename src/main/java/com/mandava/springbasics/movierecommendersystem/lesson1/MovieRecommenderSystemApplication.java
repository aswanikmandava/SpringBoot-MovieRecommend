package com.mandava.springbasics.movierecommendersystem.lesson1;

import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
public class MovieRecommenderSystemApplication {
	public static void main(String[] args) {
		// create object of RecommenderImplementation class
		RecommenderImplementation recommender = new RecommenderImplementation();
		
		// get movie recommendations
		String[] result = recommender.recommendMovies("Finding Dory");
		
		// display results
		System.out.println(Arrays.toString(result));
	}

}
