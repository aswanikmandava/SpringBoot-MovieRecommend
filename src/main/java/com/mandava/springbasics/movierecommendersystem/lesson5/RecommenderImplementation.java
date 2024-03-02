package com.mandava.springbasics.movierecommendersystem.lesson5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
	private Filter filter;
	
	// Constructor injection
	@Autowired
	public RecommenderImplementation(@Qualifier("contentBasedFilter") Filter filter) {
		super();
		this.filter = filter;
		System.out.println("Constructor invoked");
	}
	
	// use the injected filter to find the movie recommendations
	public String[] recommendMovies(String movie) {
		System.out.println("Filter in use: " + filter);
		String[] results = filter.getRecommendations(movie);
		return results;
	}
}
