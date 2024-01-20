package com.mandava.springbasics.movierecommendersystem.lesson2;

public class RecommenderImplementation {
	private Filter filter;
	
	public RecommenderImplementation(Filter filter) {
		super();
		this.filter = filter;
	}

	
	// use a filter to find recommendations
	public String[] recommendMovies(String movie) {
		System.out.println("Filter in use: " + filter);
		String[] results = filter.getRecommendations("Finding Dory");
		return results;
	}
}
