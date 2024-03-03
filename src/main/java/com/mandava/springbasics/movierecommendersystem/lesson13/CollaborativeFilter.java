package com.mandava.springbasics.movierecommendersystem.lesson13;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;

@Named
@Qualifier("CF")
public class CollaborativeFilter implements Filter {

	@Override
	public String[] getRecommendations(String movie) {
		return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
	}

}
