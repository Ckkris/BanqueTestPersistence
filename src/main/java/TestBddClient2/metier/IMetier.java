package TestBddClient2.metier;

import TestBddClient2.Entities.Client;
import TestBddClient2.Entities.Compte;
import TestBddClient2.Entities.Courant;
import TestBddClient2.Entities.PEL;

import java.util.List;

/**
 * Created by christophe on 3/10/2015.
 */
public interface IMetier {

    //Liste des clients
    public List<Client> getAllClients();

    //Liste des comptes
    public List<Compte> getAllComptes();

    //Liste des courant
    public List<Courant> getAllCourant();

    //Liste des PEL
    public List<PEL> getAllPel();

    // trouver un client identifié par son id
    public Client getClientById(long id);
}
