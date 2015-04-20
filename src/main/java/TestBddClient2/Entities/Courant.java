package TestBddClient2.Entities;

import org.hibernate.annotations.Entity;

import javax.persistence.Table;
import java.util.Date;

/**
 * Created by christophe on 4/20/2015.
 */
@Entity
@Table( name ="CompteCourant")
public class Courant extends Compte {

    //private static final long serialVersionUID = 1L;

    //constructeur par défaut
    public Courant(){

    }

    //constructeur avec paramètres
    public Courant(Long id, Date date, Long mont, Long plaf, Client client)
    {
        super(id , mont , plaf, date, client);
    }

    public String toString(){
        return String.format("Courant[%s]",super.toString());
    }
}