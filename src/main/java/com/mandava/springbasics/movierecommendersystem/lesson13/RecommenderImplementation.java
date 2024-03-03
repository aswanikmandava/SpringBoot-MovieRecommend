package com.mandava.springbasics.movierecommendersystem.lesson13;

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
	
	public String[] recommendMovies(String movie) {
		System.out.println("Filter in use: " + filter);
		String[] results = filter.getRecommendations("Finding Dory");
		return results;
	}
}
