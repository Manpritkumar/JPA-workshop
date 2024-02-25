package se.lexicon.jpaworkshopproject.Dao;


import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import se.lexicon.jpaworkshopproject.entity.AppUser;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@Transactional
@Rollback


class AppUserDaoImplTest {

    @Autowired
    AppUserDao appUserDao;

    @Test
    public void testPersistAppUser(){

        AppUser appUser =new AppUser("Manprit","test");
        AppUser persistedAppUser = appUserDao.persist(appUser);

        assertNotNull(persistedAppUser);

    }




}