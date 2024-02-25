package se.lexicon.jpaworkshopproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.lexicon.jpaworkshopproject.Dao.AppUserDao;
import se.lexicon.jpaworkshopproject.entity.AppUser;

@Component
public class MyCommandLineRunner implements CommandLineRunner {


    @Autowired
    AppUserDao appUserDao;
    @Override
    public void run(String... args) throws Exception {

        AppUser appUser =new AppUser("Monika","kkkkk");
        appUserDao.persist(appUser);


    }
}
