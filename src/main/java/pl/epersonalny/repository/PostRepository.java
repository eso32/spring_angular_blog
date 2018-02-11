package pl.epersonalny.repository;

import org.springframework.data.repository.CrudRepository;
import pl.epersonalny.domain.Post;

public interface PostRepository extends CrudRepository<Post, Long>{
}
