package com.mandava.springbasics.movierecommendersystem.lesson5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation2 {
	private Filter filter;
	
	// Setter injection
	@Autowired
	@Qualifier("collaborativeFilter")
	public void setFilter(Filter filter) {
		this.filter = filter;
		System.out.println("Setter method invoked");
	}

	public String[] recommendMovies(String movie) {
		System.out.println("Filter in use: " + filter);
		String[] results = filter.getRecommendations(movie);
		return results;
	}
}
