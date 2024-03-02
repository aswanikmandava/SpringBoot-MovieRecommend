package com.mandava.springbasics.movierecommendersystem.lesson9;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {
	public static int instances=0;
	@Autowired
	private Movie movie;
	
	public ContentBasedFilter() {
		instances++;
		System.out.println("ContentBaseFilter constructor called");
	}
	
	public Movie getMovie() {
		return movie;
	}
	
	public static int getInstances() {
		return ContentBasedFilter.instances;
	}
	
	public String[] getRecommendations(String movie) {
		return new String[] { "Happy Feet", "Ice Age", "Shark Tale" };
	}

}
