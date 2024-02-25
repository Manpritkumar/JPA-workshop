package se.lexicon.jpaworkshopproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Details {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int detailsId;

    @Setter
    @Column(unique = true)
    private String email;

    @Setter
    private String name;

    @Setter
    private LocalDate birthdate;

    @OneToOne(mappedBy = "details")
    private AppUser appUser;

    public Details(int detailsId, String email, String name) {
        this.detailsId = detailsId;
        this.email = email;
        this.name = name;

    }
}
