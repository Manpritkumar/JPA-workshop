package se.lexicon.jpaworkshopproject.Dao;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import se.lexicon.jpaworkshopproject.entity.AppUser;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Rollback
class AppUserDaoImplTest {

    @Autowired
    AppUserDao appUserDao;

    @Test
    public void create (){

        AppUser user =new AppUser();

        user.setUsername("User123");;

        appUserDao.create(user);

        assertNotNull(user);
    }


}