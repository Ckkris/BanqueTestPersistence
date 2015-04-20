package TestBddClient2.repositories;

import TestBddClient2.Entities.Client;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by christophe on 3/9/2015.
 */
public interface ClientRepository extends CrudRepository<Client, String> {
}
