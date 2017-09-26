
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Compte {
    private int numeroCompte;
    private double soldeCourant;
    private Date dateCreation;
    private String nomClient;
    private  ArrayList<Mouvement> mouvements;

    public Compte(int numeroCompte, double soldeCourant, String nomClient) {
        this.numeroCompte = numeroCompte;
        this.soldeCourant = soldeCourant;
        this.nomClient = nomClient;
        this.dateCreation = new Date();
        this.mouvements = new ArrayList<>();
    }
    public void createMouvement(String type,double montant){
        Mouvement m = new Mouvement(this.soldeCourant,montant);
        m.setType(type);
        this.mouvements.add(m);       
    }
    public void performMouvement(int i){
       this.soldeCourant = this.mouvements.get(i).perform();
        
    }

    @Override
    public String toString() {
           for (Mouvement m : this.mouvements) {
           m.toString();
        }
        return "Compte{" + "numeroCompte=" + numeroCompte + ", soldeCourant=" + soldeCourant + ", dateCreation=" + dateCreation + ", nomClient=" + nomClient + ", mouvements=" + mouvements + '}';
    }
    
}
