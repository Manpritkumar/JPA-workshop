package se.lexicon.jpaworkshopproject.Dao.Impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import se.lexicon.jpaworkshopproject.Dao.AppUserDao;
import se.lexicon.jpaworkshopproject.entity.AppUser;

import java.util.Collection;

@Repository
public class AppUserDaoImpl implements AppUserDao {

    @PersistenceContext
    private EntityManager entityManager;




    @Override
    @Transactional
    public AppUser persist(AppUser appUser) {
        entityManager.persist(appUser);
        return appUser;
    }
    @Override
    public AppUser findById(int id) {
        return null;
    }
    @Override
    public Collection<AppUser> findAll() {
        return null;
    }

    @Override
    @Transactional
    public AppUser update(AppUser appUser)
    {
        entityManager.merge(appUser);
        return appUser;
    }

    @Override
    @Transactional
    public void delete(AppUser appUser) {
        entityManager.remove(appUser);

    }
}
