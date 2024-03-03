package com.mandava.springbasics.movierecommendersystem.lesson13;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;

@Named
@Qualifier("CBF")
public class ContentBasedFilter implements Filter {

	@Override
	public String[] getRecommendations(String movie) {
		return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
	}

}
