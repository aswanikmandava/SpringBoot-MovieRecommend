package com.mandava.springbasics.movierecommendersystem.lesson2;

public class ContentBaseFilter implements Filter {

	@Override
	public String[] getRecommendations(String movie) {

		return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
	}

}
