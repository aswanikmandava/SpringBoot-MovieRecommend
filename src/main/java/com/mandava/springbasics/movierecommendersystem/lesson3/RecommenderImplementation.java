package com.mandava.springbasics.movierecommendersystem.lesson3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
	private Filter filter;
	
	public RecommenderImplementation(Filter filter) {
		super();
		this.filter = filter;
	}
	
	// use a filter to find recommendations
	public String[] getRecommendations(String movie) {
		System.out.println("Filter in use: " + filter);
		String[] results = filter.getRecommendations(movie);
		return results;
	}

}
