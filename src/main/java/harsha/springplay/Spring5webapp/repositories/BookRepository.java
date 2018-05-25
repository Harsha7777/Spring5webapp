package harsha.springplay.Spring5webapp.repositories;

import harsha.springplay.Spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
