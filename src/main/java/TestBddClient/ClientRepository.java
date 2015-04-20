package TestBddClient;

import TestBddClient.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 * Created by christophe on 4/16/2015.
 */

@Service
public interface ClientRepository extends CrudRepository<Client, String> {
}
