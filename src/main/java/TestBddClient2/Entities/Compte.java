package TestBddClient2.Entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by christophe on 4/20/2015.
 */
@MappedSuperclass
public class Compte {
    //private static final Long serialVersionUID = 1L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "login")
    private Client client;

    //clé primaire
    //@Column(name = "id_compte", unique=true, insertable = true, updatable= true)
    @Id
    @Column(name = "id")
    private Long id_compte;
    @Column(length = 5)
    private Long plafond;
    @Column(length = 5)
    private Long montant;
    @Column(length = 8)
    private Date dateCreation;

    //constructeur par defaut
    public Compte(){
    }
    //constructeur par paramètre
    public Compte(Long id, Long plaf, Long mont, Date date, Client client){
        this.id_compte=id;
        this.plafond=plaf;
        this.montant=mont;
        this.dateCreation=date;
        this.client=client;
    }

    public String toString() {
        return String.format("Compte[%s, %s, %s, %s, %s]", id_compte, plafond, montant, dateCreation, client);
    }
    //getters et setters
}
