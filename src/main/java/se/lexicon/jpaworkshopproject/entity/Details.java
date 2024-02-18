package se.lexicon.jpaworkshopproject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Details {

    private Int detailsId;

    @Setter
    private String email;

    @Setter
    private String name;

    @Setter
    private LocalDate birthdate;

}
