package se.lexicon.jpaworkshopproject.Dao;

import se.lexicon.jpaworkshopproject.entity.Book;
import se.lexicon.jpaworkshopproject.entity.BookLoan;

import java.util.Collection;

public interface BookLoanDao {
    BookLoan persist(BookLoan bookLoan);
    BookLoan findById(int id);

    Collection<BookLoan> findAll();



    BookLoan update(BookLoan bookLoan);

    void delete(BookLoan bookLoan);
}
