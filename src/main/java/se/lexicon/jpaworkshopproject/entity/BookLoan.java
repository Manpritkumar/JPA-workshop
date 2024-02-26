package se.lexicon.jpaworkshopproject.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity

public class BookLoan {

    @Id
    @GeneratedValue (strategy= GenerationType.IDENTITY)
    private int loanId;

    @Setter
    @Column(nullable = false)
    private LocalDate loanDate;

    @Setter
    @Column(nullable = false)
    private LocalDate dueDate;


    private boolean returned;

    @Setter
    @ManyToOne
    @JoinColumn(name = "app_user_id")
    private AppUser borrower;

    @Setter
    @ManyToOne
    @JoinColumn(name="book_id")
    private Book book;
}
