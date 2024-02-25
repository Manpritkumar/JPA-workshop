package se.lexicon.jpaworkshopproject.Dao;


import se.lexicon.jpaworkshopproject.entity.Book;

import java.util.Collection;

public interface BookDao {

    Book persist(Book book);
    Book findById(int id);

    Collection<Book> findAll();



    Book update(Book book);

    void delete(Book book);

}
