package se.lexicon.jpaworkshopproject.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int appUserid;

    @Setter
    @Column(nullable = false,length = 100,unique = true)
    private String username;

    @Setter
    @Column(nullable = false,length = 100)
    private String password;

    @Column(nullable = false)
    private LocalDate regdate;

    @Setter
    @OneToOne(cascade =CascadeType.PERSIST) // using a casecade here first add the detail data then fetch with appuser.
    @JoinColumn(name="details_id")
    private Details details;

    @OneToMany(mappedBy ="borrower")
    private List<BookLoan> loans;
    

    public AppUser( String username, String password ) {

        this.username = username;
        this.password = password;
        this.regdate=LocalDate.now();

    }
}
