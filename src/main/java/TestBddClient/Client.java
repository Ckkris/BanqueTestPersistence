package TestBddClient;

import javax.persistence.*;

/**
 * Created by christophe on 4/16/2015.
 */

@Entity
@Table(name = "client")
public class Client {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)   Optionnel
    @Column(name = "login")
    private String Login;
    @Column(name = "nom")
    private String Nom;
    @Column(name = "prenom")
    private String Prenom;

    protected Client() {
    }

    public Client( String nom, String prenom) {
        this.Prenom = prenom;
        this.Nom = nom;
    }

    @Override
    public String toString() {
        return String.format("Client[login='%s', nom='%s', prenom='%s']", Login, Nom, Prenom); //Indispensable pour utiliser la méthode finAll()
    }

}
