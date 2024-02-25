package se.lexicon.jpaworkshopproject.Dao.Impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;
import se.lexicon.jpaworkshopproject.Dao.BookDao;
import se.lexicon.jpaworkshopproject.entity.Book;

import java.util.Collection;

@Component
public class BookDaoImpl implements BookDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public Book persist(Book book) {
        entityManager.persist(book);
        return book;
    }

    @Override
    public Book findById(int id) {
        return null;
    }

    @Override
    public Collection<Book> findAll() {
        return null;
    }

    @Override
    public Book update(Book book) {
        return null;
    }

    @Override
    public void delete(Book book) {

    }
}
