/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarray_1;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class EjercicioArray_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int tam;//tamaño del array
        int[] vector;//Declaracion del vector
        
        Scanner sc=new Scanner(System.in);//Nuevo objeto scanner para entrada del teclado
        try{//Tratamos las posibles entrdas erroneas del teclado
        System.out.println("Introduce un nº entero para el tamaño del array");
        
        tam=sc.nextInt();//El nº introducido ddeterminara el tamaño del array
        
        vector= new int[tam];//Iniciacion del array vector
        int suma=0;//Variable de nº entero que almacena la suma
        float media;//Variable de nº real que almacena la media
        int alto=0;//Variable de nº entero que almacena el valor más alto
        int bajo=10;//Variable de nº entero que almacena el valor más bajo
        
        for(int i=0;i<tam;i++){
            //for para rellenar el array con nºs aleatorios entre 1 y 100
            vector[i]= (int)Math.round(Math.random()*100);
            suma+=vector[i];//acumula los valores en la variable suma
            if (vector[i]>alto){//compara cada valor con el valor más alto
                alto=vector[i];//si es mayor lo sustituye
            }
            if (vector[i]<bajo){//compara cada valor con el valor más bajo
                bajo=vector[i];//si es más bajo lo sustituye
            }
            
        }
            media=suma/tam; // Se obtiene la media
            //Muestra los valores en pantalla
            System.out.println("La media de los valores introducidos es: "+ media);
            System.out.println("El valor más alto introducido es: " + alto);
            System.out.println("El valor más bajo introducido es: " + bajo);
        }catch (Exception e){
            System.out.println("Tienes que introducir un nº entero positivo");
        }
        
        
    }
    
}
