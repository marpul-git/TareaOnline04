/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocadenas_5;

/**
 *
 * @author Mario
 */
public class EjercicioCadenas_5 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
       char[] cadena1= {'M','a','ñ','a','n','a',' ','p','o','r',' ','l','a'};
       char[] cadena2= {'t','a','r','d','e'};
       
       char[] cadena3=Cadena.concatenar2(cadena1, cadena2);
       char[] cadena4=Cadena.concatenar(cadena1, cadena2);
       
        System.out.println(cadena3);
        System.out.println(cadena4);
        
        
        String cad5="Mañana por la";
        String cad6="por";
          
       
        char[] cadena5= cad5.toCharArray();
        
        char[] cadena6= cad6.toCharArray();
        
        
        System.out.println(cadena5);
        System.out.println(cadena6);
        
        System.out.println("La cadena "+cad6+ " se encuentra en la posicion "+Cadena.indicePos(cadena5, cadena6)+" de la cadena: " + cad5);
       
        System.out.println("Si comparamos "+Cadena.miString(cadena1)+" con la "+Cadena.miString(cadena2)+" nos sale: "+ Cadena.comparar(cadena1, cadena2));
       
        System.out.println("Si comparamos "+Cadena.miString(cadena1)+" con la "+Cadena.miString(cadena5)+" nos sale: "+ Cadena.comparar(cadena1, cadena5));
       
        System.out.println(Cadena.cambiaValorPos(cadena4,'i',1 ));
        
        System.out.println(Cadena.cambiaValorPos(cadena2,'a',4 ));
       
       
    }
    
}
