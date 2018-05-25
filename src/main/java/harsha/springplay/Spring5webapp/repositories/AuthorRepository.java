package harsha.springplay.Spring5webapp.repositories;

import harsha.springplay.Spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;
;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
