
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
public class leer texto {
   public Stirng leer (String nombreArchivo){
       try{
           FileReader r = new FileReader(nombreArchivo);
           BufferedReader buffer = new BufferedReader(r);
           
           String aux = "";
           while(aux != null){
               aux += buffer.readLine();
               if(aux == null){
                   break;
               } 
           }
           return aux;
       }
       catch (Exception e){
           return "no se encontro el archivo" ;
       }
   }
       
}
