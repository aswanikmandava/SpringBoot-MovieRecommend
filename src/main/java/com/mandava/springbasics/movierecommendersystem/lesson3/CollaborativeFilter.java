package com.mandava.springbasics.movierecommendersystem.lesson3;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;

@Component
@Primary
public class CollaborativeFilter implements Filter {

	@Override
	public String[] getRecommendations(String movie) {
		return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
	}

}
