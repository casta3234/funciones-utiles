/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args) {
        Banque a = new Banque("primero");
        Compte b = new Compte(1,100.0,"maria");
        Compte c = new Compte(2,200.0,"jose");
        
        b.createMouvement("consinacion", 50);
        b.createMouvement("retiro", 25);    
        
        c.createMouvement("consinacion", 50);
        c.createMouvement("retiro", 25);
        
        b.performMouvement(0);
        b.performMouvement(1);
        
        c.performMouvement(0);
        c.performMouvement(1);
        
        a.addCompte(b);
        a.addCompte(c);
        
        System.out.println(a.toString());
    }
}
