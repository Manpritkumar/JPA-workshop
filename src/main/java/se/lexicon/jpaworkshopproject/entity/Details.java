package se.lexicon.jpaworkshopproject.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "appUser")
@Entity

public class Details {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   //add this mean autoincrement the id
    private int detailsId;

    @Setter
    @Column(unique = true)  // unique mean email always be unique
    private String email;

    @Setter
    private String name;

    @Setter
    private LocalDate birthdate;

    @OneToOne(mappedBy = "details")    // mapped by using to make the owner to app user to show the detail id in the appuser database
    private AppUser appUser;

    public Details( String email, String name) {

        this.email = email;
        this.name = name;

    }
}
