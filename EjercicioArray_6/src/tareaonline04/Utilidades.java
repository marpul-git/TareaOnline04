/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaonline04;

import java.util.regex.Matcher; //Clases importadas de la libreria
import java.util.regex.Pattern;

/**
 *
 * @author Semipresencial
 */
public class Utilidades {
    
    public static boolean comprobarNIF (String nif){ //devuelve true o false al String introducido
                                                     //si se ajusta o no al patron           
        boolean valido=false; //variable que devolvera el metodo, la iniciamos en false
        
        // Mediante la clase Pattern creamos el patron en la variable p
        Pattern p=Pattern.compile("([0-9]{8}[a-zA-Z])|([MmXxYyZz][0-9]{7}[a-zA-Z])"); //Determinamos la expresion regular
        Matcher m=p.matcher(nif); // //comparamos el patron mediante la clase Matcher
        if (m.matches()) { // si el  resultado de la comparacion es true
            
            valido =true; //el metodo devuelve true
        }
        else { //si no se ajusta muestra el mensaje
            System.out.println("Formato nó valido");
        }
        return valido;
        
        
       
       }
    public static boolean comprobarReferenciaProducto (String referencia){//devuelve true o false al String introducido
                                                     //si se ajusta o no al patron           
        boolean refCorrecta=false; //variable que devolvera el metodo, la iniciamos en false
        Pattern p=Pattern.compile("([A-Z&&[^IO]]{3}[0-9]{2})");//Determinamos la expresion regular
        Matcher m=p.matcher(referencia);//comparamos el patron mediante la clase Matcher
        if (m.matches()) {// si el  resultado de la comparacion es true
            
            refCorrecta =true;//el metodo devuelve true
            
        }
        else {
            System.out.println("Incorrecta, introduce 3 letras MAYUSCULAS (ni O ni I) más 2 digitos");
            
        }
        
        return refCorrecta;
    }
    
}
