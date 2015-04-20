package TestBddClient2.repositories;

import TestBddClient2.Entities.Compte;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by christophe on 3/11/2015.
 */
public interface CompteRepository extends CrudRepository<Compte, String> {
}
