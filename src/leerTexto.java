
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
public class leerTexto {
   public static String leer (String nombreArchivo){
       try{
           FileReader r = new FileReader(nombreArchivo);
           BufferedReader buffer = new BufferedReader(r);
           
           String aux = "";
           String aux2 = "";
           while(aux != null){
               aux = buffer.readLine();
               if ( aux != null){
               aux2 += aux;
           }
               if(aux == null){
                   break;
               } 
           }
           return aux2;
       }
       catch (IOException e){
           return "no se encontro el archivo" ;
       }
   }
    public static void main(String[] args) {
        System.out.println(leer("e.txt"));
    }
   
}
