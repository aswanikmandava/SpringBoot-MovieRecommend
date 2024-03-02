package com.mandava.springbasics.movierecommendersystem.lesson10;

import org.springframework.stereotype.Component;

@Component
public class CollaborativeFilter implements Filter {
	
	public CollaborativeFilter() {
		super();
	}

	@Override
	public String[] getRecommendations(String movie) {
		return new String[] { "Finding Nemo", "Toy Story", "Gladiator" };
	}

}
