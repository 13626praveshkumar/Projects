package spring.udemy.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.udemy.spring5webapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
