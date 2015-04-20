package TestBddClient2.metier;

import TestBddClient2.Entities.Client;
import TestBddClient2.Entities.Compte;
import TestBddClient2.Entities.Courant;
import TestBddClient2.Entities.PEL;
import TestBddClient2.repositories.ClientRepository;
import TestBddClient2.repositories.CompteRepository;
import TestBddClient2.repositories.CourantRepository;
import TestBddClient2.repositories.PelRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by christophe on 3/10/2015.
 */
@Service("métier")
public class Metier implements IMetier  {

    // répositories
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private CourantRepository courantRepository;
    @Autowired
    private PelRepository pelRepository;
    @Autowired
    private CompteRepository compteRepository;

    // implémentation interface
    @Override
     public List<Client> getAllClients() { return Lists.newArrayList(clientRepository.findAll());   }

    @Override
    public List<Compte> getAllComptes() {
        return Lists.newArrayList(compteRepository.findAll());
    }

    @Override
    public List<Courant> getAllCourant() {
        return Lists.newArrayList(courantRepository.findAll());
    }

    @Override
    public List<PEL> getAllPel() {
        return Lists.newArrayList(pelRepository.findAll());
    }

    @Override
    public Client getClientById(long id){
        return clientRepository.findOne(id);
    }

    //Autre méthode pour les débit et crédit et transfère.



}
