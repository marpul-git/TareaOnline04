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
public class Cadena {
    
    
    
    public Cadena(){
    
    }
    // He realizado 2 versiones del método  concatenar
    // Esta 1ª concatena las cadenas separads por un espacio
    public  static char[] concatenar(char[] cad1,char[] cad2){
        int d1=cad1.length; //variable que almacenara la longitud del primer array char[] introducido por parametros
        int d2=cad2.length; //variable que almacenara la longitud del primer array char[] introducido por parametros
        
        int dt=d1+d2;
        char[] newCad= new char[dt+1];
        for(int i=0;i<d1;i++){ 
            newCad[i]=cad1[i];
            
        }
        newCad[d1]=' ';
        for(int j=0;j<d2;j++){
            
            newCad[j+1+d1]=cad2[j];
        }
        return newCad;
    }
        // la 2ª concatena las cadenas sin espacios
    
      public  static char[] concatenar2(char[] cad1,char[] cad2){

        int d1=cad1.length;

        int d2=cad2.length;

        

        int dt=d1+d2;

        char[] newCad= new char[dt];

        for(int i=0;i<d1;i++){

            newCad[i]=cad1[i];

        }

        for(int j=0;j<d2;j++){

            newCad[j+d1]=cad2[j];

        }

        return newCad;

    }

    public static String miString (char[] nombre)  {
        
        String miString="";
        
        for (int i = 0; i < nombre.length; i++) {
            
            miString+=nombre[i];
            
        }
        return miString;
        
    }
    
    public static int indicePos(char[] cad1,char[] cad2){
        
        int indice=-1;
        boolean enc=false;
        
        for(int i=0;i<cad1.length && !enc;i++){
            if (cad2[0]==cad1[i]){
                enc=true;
                
            int subindice=i+1;
            for (int j=1;j<cad2.length;j++){
                if (cad2[j]!=cad1[subindice]){
                        enc=false;
                    }
            subindice++;
            }
            if(enc){
                   indice=i;
               }
            }
        
         
        }
        return indice;
    }
    public static boolean comparar (char[] cad1,char[] cad2){
        
        boolean idem=true;
        if (cad1.length==cad2.length){
            for (int i=0;i<cad1.length && idem;i++){
                if(cad1[i]!=cad2[i]){
                    idem=false;
                }
            }  
        }else{
            idem=false;
        }
    return idem;
    }
    
    public static char[] cambiaValorPos(char[] cad,char caracter, int posicion){
        
        char[] new_cad= new char[cad.length];
        
        for (int i=0;i< cad.length;i++){
                                   
            if (i==posicion){
                new_cad[i]= caracter;
            }else{
            new_cad[i]=cad[i];
            }
        }
             
       return new_cad; 
       
        
        
    }
}
