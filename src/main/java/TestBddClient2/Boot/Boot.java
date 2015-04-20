package TestBddClient2.Boot;

import TestBddClient2.Config.DomainAndPersistenceConfig;
import TestBddClient2.Entities.Client;
import TestBddClient2.metier.IMetier;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

/**
 * Created by christophe on 4/2/2015.
 */
public class Boot {

    // le boot
    public static void main(String[] args) {
    // on prépare la configuration
    SpringApplication app = new SpringApplication(DomainAndPersistenceConfig.class);
    //app.setLogStartupInfo(false);
    // on la lance
    ConfigurableApplicationContext context = app.run(args);
        IMetier métier = context.getBean(IMetier.class);
                List<Client> clients = métier.getAllClients();
                display("Liste des clients :", clients);
        context.close();
        }

private static void display(String message, Iterable<?> elements) {
        System.out.println(message);
        for (Object element : elements) {
        System.out.println(element);
        }
}

}

