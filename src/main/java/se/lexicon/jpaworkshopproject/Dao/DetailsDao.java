package se.lexicon.jpaworkshopproject.Dao;

import se.lexicon.jpaworkshopproject.entity.Details;

import java.util.Collection;

public interface DetailsDao {

    Details persist(Details details);
    Details findById(int id);

    Collection<Details> findAll();



    Details update(Details details);

    void delete(Details details);


}
