package com.mandava.springbasics.movierecommendersystem.lesson11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class RecommenderImplementation {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	private Filter filter;
	
	@Autowired
	public void setFilter(Filter filter) {
		this.filter = filter;
		logger.info("RI: Dependency injection using Setter method");
	}
	
	// use a filter to find movie recommendations
	public String[] getRecommendations(String movie) {
		String[] results = filter.getRecommendations("Finding Dory");
		return results;
	}
	
	@PostConstruct
	public void postLoad() {
		logger.info("RI: PostConstruct method loaded");
	}
	
	@PreDestroy
	public void preDestroy() {
		logger.info("RI: PreDestroy method loaded");
	}

}
