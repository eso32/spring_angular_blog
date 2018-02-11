package pl.epersonalny.pl.epersonalny;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import pl.epersonalny.pl.epersonalny.domain.Post;
import pl.epersonalny.pl.epersonalny.repository.PostRepository;
import pl.epersonalny.pl.epersonalny.services.DataLoader;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EntityScan("pl.epersonalny.pl.epersonalny")
public class Application {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);

	@Autowired
	PostRepository postRepository;

	@Autowired
	DataLoader dataLoader;

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

	@PostConstruct
	void seePosts(){
		logger.info("seePosts method called...");
		for(Post post : postRepository.findAll()){
			logger.info(post.toString());
		}
	}
}
