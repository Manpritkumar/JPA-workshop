package se.lexicon.jpaworkshopproject.entity;

import jakarta.persistence.*;
import lombok.*;


import java.util.Set;



@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity

public class Author {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer authorId;

    @Setter
    @Column(nullable = false)
    private String firstName;

    @Setter
    @Column(nullable = false)
    private String lastName;

    @Setter
    @ManyToMany
    @JoinTable(name = "author_books_rel",
            joinColumns = @JoinColumn(name = "author_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id"))
    private Set<Book> writtenBooks;

    //Convenience methods added

    public void addWrittenBooks(Book book){
        writtenBooks.add(book);
        book.getAuthors().add(this);

    }

    public void removeWrittenBooks(Book book){
        writtenBooks.remove(book);
    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }



}
