
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Banque {
    private String code;
    private ArrayList<Compte> comptes;
    private ArrayList<Type> types;

    public Banque(String code) {
        this.code = code;
        this.comptes = new ArrayList<>();
        this.types = new ArrayList<>();
    }
    public void addCompte(Compte c){
        this.comptes.add(c);
    }
    public void addType(){
        
    }

    @Override
    public String toString() {
           for (Compte c : this.comptes) {
               c.toString();
        }
        return "Banque{" + "code=" + code + ", comptes=" + comptes + ", types=" + types + '}';
    }
    
}
