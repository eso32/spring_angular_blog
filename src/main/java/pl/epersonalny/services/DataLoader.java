package pl.epersonalny.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.epersonalny.domain.Author;
import pl.epersonalny.domain.Post;
import pl.epersonalny.repository.AuthorRepository;
import pl.epersonalny.repository.PostRepository;

import javax.annotation.PostConstruct;
import java.util.Date;

@Service
public class DataLoader {

    private PostRepository postRepository;
    private AuthorRepository authorRepository;

    @Autowired
    public DataLoader(PostRepository postRepository, AuthorRepository authorRepository){
        this.postRepository = postRepository;
        this.authorRepository = authorRepository;
    }

    @PostConstruct
    private void loadData(){
        Author dv = new Author("Tomek", "Szlapa");

        authorRepository.save(dv);

        Post post = new Post("Java nad JS goes well");
        post.setBody("Some content in article");
        post.setPostedOn(new Date());
        post.setAuthor(dv);

        postRepository.save(post);
    }

}
