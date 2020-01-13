/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaonline04;

import java.util.Scanner;

/**
 *
 * @author Semipresencial
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         final int TAM=10;
         
         Usuario[] arrayUsuario= new Usuario[TAM];
         Scanner sc=new Scanner(System.in);
        
        int opcion = 0; //Declarar y asignar valor a la variable del índice
       
        while (opcion != 6) { //Le damos valor 0 para que se muestre el menú en pantalla
            
            System.out.println("             MENÚ                "); 
            
            System.out.println("1.-Añadir usuarios (máx 10)");
                    
            System.out.println("2.-Ver datos de un usuario");

            System.out.println("3.-Ver datos de todos los usuarios");

            System.out.println("4.-Introduce DNI del usuario, del 1 al 10 ");

            System.out.println("5.-Ver DNI de usuario, del 1 al 10");

            System.out.println("6.-Salir");

            System.out.println("Elige una opción (1-6)");
       
            
            
            try { // Código sospechoso de que se pueda producir una entrda de teclado erronea
             
                opcion = Integer.parseInt(sc.nextLine());
        
                }catch (NumberFormatException e){ //Tratamos la posible exception 
            
                    System.err.println("Tienes que introducir un número entero.");
                    opcion=0;
                }

            if (opcion<=0 || opcion>6){ //Condicional para que solo se pueda introducir un nº del indice
        
                System.out.println("Tienes que elegir del 1 al 6");
          
            }else{
        
                switch (opcion) { //Si la variable opcion tiene un valor del indice se ejecutara lo incluido en el case

                    case 1:
                        
                        int alta=0;//variable que almacenara el nº de usuarios a crear
                        
                        System.out.println("¿Cuantos usuarios quiere introducir? máximo 10");
                        
                        try{ // Código sospechoso de que se pueda producir una entrada de teclado erronea
                        alta=Integer.parseInt(sc.nextLine());// entrada de teclado con el nº de usuarios a crear
                            }catch (NumberFormatException e){
                            System.out.println("Tienes que introducir un nº entero");
                            }
                        if (alta<0 || alta>10 ){//solo acepta entre 1 y 10
                            System.out.println("maximo 10");
                        }else{
                            for(int i=0;i<alta;i++){//for para rellenar los usuarios introducidos
             
                            String nombre,apellidos,dni;//Declaracion de las variables de cada objeto Usuario
                            int edad;
             
                            System.out.println("Introduzca nombre");
                            nombre=sc.nextLine();//Almacena el nombre introducido por teclado
                            System.out.println("Apellidos");
                            apellidos=sc.nextLine();//Almacena los apellidos introducido por teclado
                            boolean dniCorrecto=false;//si el dni está repetido esta variable sera false
                            
                            do{
                            boolean enc=false;   //variable que devolvera true si encuentra in dni repetido
                            System.out.println("dni");
                            dni=sc.nextLine();//variable que almacena el dni introducido por teclado
    
                            for (int j=0;j<i && !enc;j++){//for para comparar el dni introducido con los ya almacenados
                                //que nos devuelve metodo getDni,comparamos ambos string 
                            enc= arrayUsuario[j].getDni().equalsIgnoreCase(dni);
                            }
                             
                            if (enc){//si encontrado es true tenemos que pedirlo de nuevo
                            
                                System.out.println("Ese dni pertenece a otro usuario, introduce otro DNI");
                               
                                }else{
                                dniCorrecto=true;//si no esta repetido, dniCorrecto es true
                            }
                            }while(dniCorrecto==false);// y acaba el bucle
             
                            System.out.println("edad");
                            try{// Código sospechoso de que se pueda producir una entrada de teclado erronea
                            edad=Integer.parseInt(sc.nextLine());
                            }catch (NumberFormatException e){
                    
                            System.out.println("Tienes que introducir un nº entero");
                             edad=Integer.parseInt(sc.nextLine());
                             }
                            //una vez sean correcto todos los atributos, se creara un nuevo objeto usuario
                            // en el arrayUsuario[] por cada ciclo del for
                            arrayUsuario[i]= new Usuario(nombre,apellidos,edad,dni);
                            
             
                             }
                            
                        }
                        
                        
                        
                    break; //Volver al inicio
                        
                    case 2: //para mostrar los datos de un usuario, primero lo buscaremos por su nombre
                            System.out.println("Introduce nombre");
                            String nombre=sc.nextLine();
                        
                            boolean enc=false;//variable que devolvera true si encuentra el nombre introducido por teclado
                                //for para comparar ambos String mediante el metodo equals y getNombre
                            for (int i=0;i<arrayUsuario.length && !enc && (arrayUsuario[i]!=null);i++){
                            enc= arrayUsuario[i].getNombre().equalsIgnoreCase(nombre);
                                if (enc) {// si coincide mostramos las caracteristicas mediante el metodo toString
                                     System.out.println(arrayUsuario[i]);
                                }
                            }//for
                            if (enc==false) { //si no coincide
                                System.out.println("No hay ningun usuario con ese nombre");
                        }
                            
                                           

                    break;

                    
                    case 3://para mostrar todos los atributos de cada usuario introducido
                        //for que recorrerá todo el arrayUsuario 
                        for (int i = 0; i <arrayUsuario.length; i++) {
                            if (arrayUsuario[i]==null) {//si hemos introducido menos de 10 usuarios
                                System.out.println("Este registro está vacío");//nos muestra este mensaje
                            }else{
                             //muestra todas las caracteristicas de cada usuario introducido por el metodo toString  
                            System.out.println(arrayUsuario[i]);
                        }
                        }

                    break;

                    case 4:
                        System.out.println("Introduce el nº de usuario");
                        try{// Código sospechoso de que se pueda producir una entrada de teclado erronea
                        int registro=Integer.parseInt(sc.nextLine());//como los registros lo hemos establecido a partir de 1
                        
                        
                        if (arrayUsuario[registro-1] == null) {//para empezar el contador desde el 0 del array, le restamos uno
                            System.out.println("Ese usuario aún no está creado");//si introducimos un nº 
                        }else{
                        
                        String dni;
            
                        System.out.print("Introduce DNI: ");
            
                        dni = sc.nextLine();
            
                        arrayUsuario[registro-1].setDni(dni);//Método que asigna el DNI del usuario
                        }
                        }catch (NumberFormatException e){
                            System.out.println("Tienes que introducir un nº entero");   
                        }
                                   
                    break;

                    case 5:
                        
                        //Método que muestra DNI del usuario
                        System.out.println("Introduce el nº de usuario");
                        
                        int registro=Integer.parseInt(sc.nextLine());
                        
                        
                        if (arrayUsuario[registro-1] == null) {
                            System.out.println("Ese usuario aún no está creado");
                        }else{
                        
                        System.out.println("El DNI es: "+arrayUsuario[registro-1].getDni());
                        }
                    break;

                    default: /*En caso de pulsar 6, como no está definido (ni limitado),
                        continua y acaba el programa.*/
                        System.out.println("Hasta luego");
                        
                } 

            } 
          
        }
        
    }
        
}    
        
