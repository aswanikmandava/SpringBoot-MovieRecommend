package com.mandava.springbasics.movierecommendersystem.lesson2;

public class CollaborativeFilter implements Filter {

	@Override
	public String[] getRecommendations(String movie) {
		// TODO Auto-generated method stub
		return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
	}

}
