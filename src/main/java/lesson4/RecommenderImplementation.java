package lesson4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
	// Autowiring by name
	@Autowired
	private Filter contentBasedFilter;
	
	public String[] recommendMovies(String movie) {
		String[] result = contentBasedFilter.getRecommendations(movie);
		return result;
	}

}