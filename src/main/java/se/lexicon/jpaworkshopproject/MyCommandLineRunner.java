package se.lexicon.jpaworkshopproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.lexicon.jpaworkshopproject.Dao.AppUserDao;
import se.lexicon.jpaworkshopproject.Dao.DetailsDao;
import se.lexicon.jpaworkshopproject.entity.AppUser;
import se.lexicon.jpaworkshopproject.entity.Details;

@Component
public class MyCommandLineRunner implements CommandLineRunner {


    @Autowired
    AppUserDao appUserDao;

    @Autowired
    DetailsDao detailsDao;

    @Override
    public void run(String... args) throws Exception {

        Details details = new Details("preet98728@gmail.com","Manumit");
        //detailsDao.persist(details);    we will use the cascade type instead of persist in the Appusser one to one relation.
        AppUser appUser =new AppUser("Monika","kkkkk");
        appUser.setDetails(details);
        appUserDao.persist(appUser);


    }
}
