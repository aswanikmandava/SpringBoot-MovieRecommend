package com.mandava.springbasics.movierecommendersystem.lesson5;

import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {

	@Override
	public String[] getRecommendations(String movie) {
		return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
	}

}
