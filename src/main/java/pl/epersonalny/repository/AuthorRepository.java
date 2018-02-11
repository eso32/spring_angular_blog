package pl.epersonalny.repository;

import org.springframework.data.repository.CrudRepository;
import pl.epersonalny.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}