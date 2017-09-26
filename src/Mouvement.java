
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
public class Mouvement {
    private Date date;
    private double solderPrecend;
    private double montant;
    private Type type;
    
    public Mouvement (double solderPrecend,double montant){
        this.date = new Date();
        this.type = new Type();
        this.solderPrecend = solderPrecend;
        this.montant = montant;
    }

    public void setType(String type) {
        this.type.setCode(type);
    }
    public double perform(){
        double solderNew;
        if(this.type.getCode().equals("consinacion")){
             solderNew = solderPrecend+montant; 
             return solderNew;
        }
        if(this.type.getCode().equals("retiro")){
             solderNew = solderPrecend+montant;  
             return solderNew;
        }
       
        return 0;
          
    }

    @Override
    public String toString() {
        return "Mouvement{" + "date=" + date + ", solderPrecend=" + solderPrecend + ", montant=" + montant + ", type=" + type + '}';
    }
    
}
