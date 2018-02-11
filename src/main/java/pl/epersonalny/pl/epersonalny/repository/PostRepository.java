package pl.epersonalny.pl.epersonalny.repository;

import org.springframework.data.repository.CrudRepository;
import pl.epersonalny.pl.epersonalny.domain.Post;

public interface PostRepository extends CrudRepository<Post, Long>{
}
