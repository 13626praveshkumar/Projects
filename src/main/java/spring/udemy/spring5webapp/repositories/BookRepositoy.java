package spring.udemy.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spring.udemy.spring5webapp.domain.Book;

//@Repository
public interface BookRepositoy extends CrudRepository<Book,Long> {
}
