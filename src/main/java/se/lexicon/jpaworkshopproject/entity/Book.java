package se.lexicon.jpaworkshopproject.entity;


import jakarta.persistence.*;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity


public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int bookId;


    @Setter
    @Column(nullable = false)
    private String isbn;

    @Setter
    @Column(nullable = false)
    private String title;


    @Setter
    @Column(nullable = false)
    private int maxLoanDays;


    public Book(String isbn, String title, int maxLoanDays) {
        this.isbn = isbn;
        this.title = title;
        this.maxLoanDays = maxLoanDays;
    }
}
