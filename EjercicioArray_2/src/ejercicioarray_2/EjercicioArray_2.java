/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarray_2;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class EjercicioArray_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tam;//tamaño del array
        int[] vector;//Declaracion del vector
        
        Scanner sc=new Scanner(System.in);//Nuevo objeto scanner para entrada del teclado
        try{//Tratamos las posibles entrdas erroneas del teclado
        System.out.println("Introduce un nº entero para el tamaño del array");
        
        tam=sc.nextInt();//El nº introducido ddeterminara el tamaño del array
        
        vector= new int[tam];//Iniciacion del array vector
        int pares=0;//Variable de nº entero que almacena los numeros pares
        int impares=0;//Variable de nº entero que almacena los numeros impares
                
        for(int i=0;i<tam;i++){
            //for para rellenar el array con nºs aleatorios entre 1 y 10
            vector[i]= (int)Math.round(Math.random()*10);
            if (vector[i]%2==0){//compara cada valor es par
                pares++;//si es par, aumenta el contador pares en 1
            }else{//si no es par, es impar
                impares++;//si es impar, aumenta el contador impares en 1
            }
            
            
        }
            //Muestra los valores en pantalla
            System.out.println("Hay "+pares+" nº pares");
            System.out.println("Hay "+impares+" nº impares");
            
        }catch (Exception e){
            System.out.println("Tienes que introducir un nº entero positivo");
        }
        
        
    }
    
}
