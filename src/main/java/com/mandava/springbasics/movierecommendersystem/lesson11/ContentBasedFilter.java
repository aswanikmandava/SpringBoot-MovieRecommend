package com.mandava.springbasics.movierecommendersystem.lesson11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class ContentBasedFilter implements Filter {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public ContentBasedFilter() {
		super();
		logger.info("ContentBasedFilter constructor called");
	}
	
	@PostConstruct
	private void cachePostCreation() {
		// load movies into cache post bean creation
		logger.info("CBF: PostConstruct method called");
	}

	@PreDestroy
	private void clearCachePreDestroy() {
		// remove movies from cache prior bean destroy
		logger.info("CBF: PreDestroy method called");
		
	}
	@Override
	public String[] getRecommendations(String movie) {
		return new String[] {"Happy Days", "Iron Man", "Super Man"};
	}

}
