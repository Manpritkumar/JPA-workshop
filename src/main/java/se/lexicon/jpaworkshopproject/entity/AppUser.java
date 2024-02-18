package se.lexicon.jpaworkshopproject.entity;

import lombok.*;

import java.time.LocalDate;
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AppUser {

    private int appUserid;
    @Setter
    private String username;
    @Setter
    private String password;

    private LocalDate regdate;
    @Setter
    private Details details;

}
