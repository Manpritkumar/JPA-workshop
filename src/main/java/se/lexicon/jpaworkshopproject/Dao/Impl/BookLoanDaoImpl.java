package se.lexicon.jpaworkshopproject.Dao.Impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;
import se.lexicon.jpaworkshopproject.Dao.BookLoanDao;
import se.lexicon.jpaworkshopproject.entity.BookLoan;

import java.util.Collection;

@Component
public class BookLoanDaoImpl implements BookLoanDao {

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    @Transactional
    public BookLoan persist(BookLoan bookLoan) {
        entityManager.persist(bookLoan);
        return bookLoan;
    }

    @Override
    public BookLoan findById(int id) {
        return null;
    }

    @Override
    public Collection<BookLoan> findAll() {
        return null;
    }

    @Override
    public BookLoan update(BookLoan bookLoan) {
        return null;
    }

    @Override
    public void delete(BookLoan bookLoan) {

    }
}
