package spring.udemy.spring5webapp.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String isbn;
    private String title;

//    @ManyToOne
//    private Publisher publisher;

//  @JoinTable(name = "author_book", joinColumns = @JoinColumn(name="book_id"),
//          inverseJoinColumns = @JoinColumn(name = "author_id"))
//    private Set<Author> authors=new HashSet<>();

    public  Book() {
    }

    public  Book(String isbn,String title)
    {
        this.isbn=isbn;
        this.title=title;
    }

//    public Publisher getPublisher() {
//        return publisher;
//    }
//
//    public void setPublisher(Publisher publisher) {
//        this.publisher = publisher;
//    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    public Set<Author> getAuthors() {
//        return authors;
//    }
//
//    public void setAuthors(Set<Author> authors) {
//        this.authors = authors;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
//               ", authors=" + authors +
                '}';
    }
}
