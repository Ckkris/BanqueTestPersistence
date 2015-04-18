package TestBddClient;

import TestBddClient.Client;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by christophe on 4/16/2015.
 */
public interface ClientRepository extends CrudRepository<Client, Long> {
}
