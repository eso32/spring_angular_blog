package pl.epersonalny.pl.epersonalny.repository;

import org.springframework.data.repository.CrudRepository;
import pl.epersonalny.pl.epersonalny.domain.Author;
import pl.epersonalny.pl.epersonalny.domain.Post;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}