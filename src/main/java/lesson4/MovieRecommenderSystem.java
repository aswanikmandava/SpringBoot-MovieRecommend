package lesson4;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommenderSystem {
	public static void main(String[] args) {
		// Application Context manages beans and dependencies
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystem.class, args);
		
		// Use Application Context to find which filter is being used
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);
		
		// call method to get movie recommendations
		String[] result = recommender.recommendMovies("Finding Dory");
		
		System.out.println("Movies: " + Arrays.toString(result));
	}
}
