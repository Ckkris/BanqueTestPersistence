package TestBddClient;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

/**
 * Created by christophe on 4/16/2015.
 */


public class App {

    // le boot
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Config.class); //Config !!
        ClientRepository repository = context.getBean(ClientRepository.class);
        Iterable<Client> Clients = repository.findAll();
        System.out.println("Clients trouvés avec la méthode findAll():");
        System.out.println("-------------------------------");
        for (Client Cli : Clients) {
            System.out.println(Cli);
        }
        context.close();
    }

}
