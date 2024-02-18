package se.lexicon.jpaworkshopproject.Dao;

import se.lexicon.jpaworkshopproject.entity.Details;

import java.util.Collection;

public interface DetailsDao {

    Details findById(int id);

    Collection<Details> findAll();

    Details create (Details details);

    Details update (Details details);

    void delete (Details details);


}
