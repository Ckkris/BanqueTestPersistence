package TestMemoryManuel;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by christophe on 4/16/2015.
 */
public interface ClientRepository extends CrudRepository<Client, Long> {
    List<Client> findByNom(String nom);
}
