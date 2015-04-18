package TestBddClient;

import javax.persistence.*;

/**
 * Created by christophe on 4/16/2015.
 */

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "login")
    private String login;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;

    protected Client() {
    }

    public Client( String nom, String prenom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    @Override
    public String toString() {
        return String.format("Client[login=%d, nom='%s', prenom='%s']", login, nom, prenom);
    }

}
