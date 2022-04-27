package spring.udemy.spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring.udemy.spring5webapp.domain.Author;
import spring.udemy.spring5webapp.domain.Book;
import spring.udemy.spring5webapp.domain.Publisher;
import spring.udemy.spring5webapp.repositories.AuthorRepository;
import spring.udemy.spring5webapp.repositories.BookRepositoy;
import spring.udemy.spring5webapp.repositories.PublisherRepository;

@Component
public class BootStrapData  implements CommandLineRunner {


    private final AuthorRepository authorRepository;

    private  final BookRepositoy bookRepositoy;
    private final PublisherRepository publisherRepository;

    public  BootStrapData(AuthorRepository authorRepository,BookRepositoy bookRepositoy,PublisherRepository publisherRepository)
    {
        this.authorRepository=authorRepository;
        this.bookRepositoy=bookRepositoy;
        this.publisherRepository=publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
      Author eric=new Author("Pravesh","Kumar");
        Book ddd=new Book("9837271","book1Demo");
//        eric.getBooks().add(ddd);
        Publisher publisher=new Publisher("tnf","bangalore","bangalore","karnatake","400600");
//       publisher.getBook().add(ddd);
//    ddd.setPublisher(publisher);
//       ddd.getAuthors().add(eric);
        authorRepository.save(eric);
        bookRepositoy.save(ddd);
        publisherRepository.save(publisher);

        System.out.println("No of Book");
        System.out.println(bookRepositoy.count());

        System.out.println("No of Publisher");
        System.out.println(publisherRepository.count());
    }
}
