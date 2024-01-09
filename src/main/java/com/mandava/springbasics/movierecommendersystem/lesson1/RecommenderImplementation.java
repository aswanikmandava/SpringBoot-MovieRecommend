package com.mandava.springbasics.movierecommendersystem.lesson1;

public class RecommenderImplementation {
	public String[] recommendMovies(String movie) {
		// use the content based filter to find similar movies
		ContentBaseFilter filter = new ContentBaseFilter();
		String[] results = filter.getRecommendations(movie);
		return results;
		
	}

}
