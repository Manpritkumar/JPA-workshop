package se.lexicon.jpaworkshopproject.Repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;
import se.lexicon.jpaworkshopproject.entity.Author;

@Repository
public interface AuthorRepository extends CrudRepository <Author,Integer> {


}
