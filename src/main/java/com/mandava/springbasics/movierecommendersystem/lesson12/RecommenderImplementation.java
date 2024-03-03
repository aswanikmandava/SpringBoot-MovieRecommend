package com.mandava.springbasics.movierecommendersystem.lesson12;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;

@Named
public class RecommenderImplementation {
	@Inject
	@Qualifier("CBF")
	private Filter filter;
	
	public Filter getFilter() {
		return this.filter;
	}
	
	// use a filter to find movie recommendations
	public String[] recommendMovies(String movie) {
		// print the name of the interface implementation in use
		System.out.println("Filter in use: " + filter);
		String[] results = filter.getRecommendations("Finding Dory");
		return results;
	}

}
