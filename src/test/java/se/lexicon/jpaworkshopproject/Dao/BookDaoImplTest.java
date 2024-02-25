package se.lexicon.jpaworkshopproject.Dao;


import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import se.lexicon.jpaworkshopproject.entity.Book;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@Transactional
@Rollback

 class BookDaoImplTest {

    @Autowired
    BookDao bookDao;


    @Test

    public void testPersistBook(){

        Book book = new Book("xxa","Book1",7);
        Book persistedBook = bookDao.persist(book);
        assertNotNull(persistedBook);
    }

}
