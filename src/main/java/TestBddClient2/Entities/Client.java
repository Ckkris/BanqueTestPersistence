package TestBddClient2.Entities;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by christophe on 4/20/2015.
 */

@Entity
@Table(name = "client")
public class Client {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)   Optionnel
    @Column(name = "login")
    private String Login;

    /* l'attribut "name" pour l'annotation
    @Table existe pour le package javax.persistence, pas pour l'annotation du package d'hibernate.
    Donc dans un premier temps, pense à cliquer sur la popup en haut à droite de ton screenshot
    "Enable Auto Import" pour maven (ça te ramènera les dépendences maven automatiquement sans avoir à refaire un
    click droit sur ton projet > Maven > Reimport)
    Dans un deuxième temps, enlève ton import sur org.hibernate.annotations.Table et import plutôt
    "javax.persistence.Table", l'attribut name sera détecté (si tu fais F3 avec la keymap eclipse sur cette annotation,
    tu trouveras l'attribut "name" dans l'implementation, si tu n'arrives pas à récupérer les sources, voilà la preuve via
    la source de cette annotation*/

    @Column(name = "nom")
    private String Nom;
    @Column(name = "prenom")
    private String Prenom;
    @Column(name = "adresse")
    private String Adresse;
    @Column(name = "mail")
    private String Mail;

        @OneToMany(mappedBy="client")
        //@JoinColumn(name="id_compte")
        private Set<Compte> comptes;

        //constructeur par défaut
        public Client() {
        }

        // constructeur avec paramètres
        public Client(String nom, String prenom, String login, String adresse, String mail) {
            this.Nom=nom;
            this.Prenom=prenom;
            this.Adresse=adresse;
            this.Mail=mail;
            this.Login=login;
        }

    @Override
    public String toString() {
        return String.format("Client[login='%s', nom='%s', prenom='%s', mail='%s', adresse='%s']", Login, Nom, Prenom, Mail, Adresse); //Indispensable pour utiliser la méthode finAll()
    }

        //getters et setters
}
