package se.lexicon.jpaworkshopproject.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity


public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;


    @Setter
    @Column(nullable = false)
    private String isbn;

    @Setter
    @Column(nullable = false)
    private String title;


    @Setter
    @Column(nullable = false)
    private int maxLoanDays =7;

    @Column(nullable = true)
    private boolean available;

    @Setter
    @ManyToMany
    @JoinColumn(name = "author_id")
    private Set<Author> authors;

    public Book(String isbn, String title, int maxLoanDays) {
        this.isbn = isbn;
        this.title = title;
        this.maxLoanDays = maxLoanDays;
    }

    //Convenience methods added

    public void addAuthor(Author author) {
        authors.add(author);
        author.getWrittenBooks().add(this);
    }

    public void removeAuthor(Author author) {
        authors.remove(author);
        author.getWrittenBooks().remove(this);

    }
}
