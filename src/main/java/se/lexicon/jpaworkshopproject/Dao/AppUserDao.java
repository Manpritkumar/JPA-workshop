package se.lexicon.jpaworkshopproject.Dao;

import se.lexicon.jpaworkshopproject.entity.AppUser;

import java.util.Collection;

public interface AppUserDao {


    AppUser persist(AppUser appUser);
    AppUser findById(int id);

    Collection<AppUser> findAll();



    AppUser update(AppUser appUser);

    void delete(AppUser appUser);



}
