package se.lexicon.jpaworkshopproject.Dao.Impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;
import se.lexicon.jpaworkshopproject.Dao.DetailsDao;
import se.lexicon.jpaworkshopproject.entity.Details;

import java.util.Collection;

@Component
public class DetailDaoImpl implements DetailsDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public Details persist(Details details) {
        entityManager.persist(details);
        return details;
    }

    @Override
    public Details findById(int id) {return null;}

    @Override
    public Collection<Details> findAll() {return null;}



    @Override
    @Transactional
    public Details update(Details details) {
        entityManager.merge(details);
        return details;}

    @Override
    @Transactional
    public void delete(Details details) {
        entityManager.remove(details);
            }
}
