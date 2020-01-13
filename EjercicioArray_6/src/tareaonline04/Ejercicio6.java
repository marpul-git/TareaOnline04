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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         final int TAM=10;
         
         Usuario[] arrayUsuario= new Usuario[TAM];
         Producto[] arrayProducto= new Producto[TAM];
         Scanner sc=new Scanner(System.in);
        
        int opcion = 0; //Declarar y asignar valor a la variable del índice
       
        while (opcion != 10) { //Le damos valor 0 para que se muestre el menú en pantalla
            
            System.out.println("             MENÚ                "); 
            
            System.out.println("1.-Añadir usuarios (máx 10)");
                    
            System.out.println("2.-Ver datos de un usuario");

            System.out.println("3.-Ver datos de todos los usuarios");

            System.out.println("4.-Introduce DNI del usuario, del 1 al 10");

            System.out.println("5.-Ver DNI de usuario, del 1 al 10");

            System.out.println("6.-Añadir productos (máx 10)");
            
            System.out.println("7.-Ver datos de un producto");
            
            System.out.println("8.-Ver datos de todos los productos");
            
            System.out.println("9.-Ver referencia del producto, del 1 al 10");
            
            System.out.println("10.-Salir");

            System.out.println("Elige una opción (1-10)");
       
            
            
            try { // Código sospechoso de que se pueda producir una entrda de teclado erronea
             
                opcion = Integer.parseInt(sc.nextLine());
        
                }catch (NumberFormatException e){ //Tratamos la posible exception 
            
                    System.err.println("Tienes que introducir un número entero.");
                    opcion=0;
                }

            if (opcion<=0 || opcion>10){ //Condicional para que solo se pueda introducir un nº del indice
        
                System.out.println("Tienes que elegir del 1 al 10");
          
            }else{
        
                switch (opcion) { //Si la variable opcion tiene un valor del indice se ejecutara lo incluido en el case

                    case 1:     //menu modificado del ejercicio 3
                        
                        int alta=0;
                        
                        System.out.println("¿Cuantos usuarios quiere introducir? máximo 10");
                        
                        try{
                        alta=Integer.parseInt(sc.nextLine());
                            }catch (NumberFormatException e){
                            System.out.println("Tienes que introducir un nº entero");
                            }
                        if (alta<0 || alta>10 ){
                            System.out.println("maximo 10");
                        }else{
                            for(int i=0;i<alta;i++){
             
                            String nombre,apellidos,dni;
                            int edad;
             
                            System.out.println("Introduzca nombre");
                            nombre=sc.nextLine();
                            System.out.println("Apellidos");
                            apellidos=sc.nextLine();
                            boolean dniCorrecto=false;
                            do{
                            boolean enc=false;
                            
                            System.out.println("dni");   
                            dni=sc.nextLine(); 
                            //Añadimos la comprobacion del que dni introducido se ajusta al patrón
                            // establecido en el metodo estatico comprobarNIF que hemos creado en la clase Utilidades.
                            
                            if (Utilidades.comprobarNIF(dni)){ //si cumple el patron
                     
                            for (int j=0;j<i && !enc;j++){//comprueba que no esté repetido
                            enc= arrayUsuario[j].getDni().equalsIgnoreCase(dni);
                            }
                             
                            if (enc){//si encontrado es true tenemos que pedirlo de nuevo
                                
                                
                                System.out.println("Ese dni pertenece a otro usuario, introduce otro DNI");
                                
                                
                               
                            }else{
                                dniCorrecto=true;  // si ha cumplido el patron y no esta repetido el dni es correcto
                            }
                            }else{// si no cumple el patron mostramos 
                                System.out.println("00000000X ó [MXYZ]0000000X");
                                
                            }
                            }while (dniCorrecto==false); //mientras no cumpla los 2 requisitos tendremos que repetir la entrada
                           
                            
                            System.out.println("edad");
                            try{
                            edad=Integer.parseInt(sc.nextLine());
                            }catch (NumberFormatException e){
                    
                            System.out.println("Tienes que introducir un nº entero");
                             edad=Integer.parseInt(sc.nextLine());
                             }
            
                            arrayUsuario[i]= new Usuario(nombre,apellidos,edad,dni);
                            
             
                             }
                            
                        }
                        
                        
                        
                    break; //Volver al inicio
                        
                    case 2:
                            System.out.println("Introduce nombre");
                            String nombre=sc.nextLine();
                        
                            boolean enc=false;
            
                            for (int i=0;i<arrayUsuario.length && !enc && (arrayUsuario[i]!=null);i++){
                            enc= arrayUsuario[i].getNombre().equalsIgnoreCase(nombre);
                                if (enc) {
                                     System.out.println(arrayUsuario[i]);
                                }
                            }//for
                            if (enc==false) {
                                System.out.println("No hay ningun usuario con ese nombre");
                        }
                  
                    break;

                    case 3:
                         
                        for (int i = 0; i <arrayUsuario.length; i++) {
                            if (arrayUsuario[i]==null) {
                                System.out.println("Este registro está vacío");
                            }else{
 
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
                    
                    case 6:
                        
                        int altaProducto=0;
                        
                        System.out.println("¿Cuantos productos quiere introducir? máximo 10");
                        
                        try{// Código sospechoso de que se pueda producir una entrada de teclado erronea
                        altaProducto=Integer.parseInt(sc.nextLine());//variable que determina el nº de productos que queremos crear
                            }catch (NumberFormatException e){
                            System.out.println("Tienes que introducir un nº entero");
                            }
                        if (altaProducto<0 || altaProducto>10 ){//entre 1 y 10
                            System.out.println("maximo 10");
                        }else{
                            for(int p=0;p<altaProducto;p++){
                                                                     
                            String nombreProducto,referencia;
                            int unidades;
                            boolean refCorrecta=false;
                            do{                          
                            System.out.println("Nuevo producto, introduce la referencia\n 3 letras mayusculas más 2 digitos");   
                            referencia=sc.nextLine(); 
                            if (Utilidades.comprobarReferenciaProducto(referencia)){
                                    refCorrecta=true;
                            }
                            }while (refCorrecta==false);
                           
                            System.out.println("Introduce nombre producto");
                            nombreProducto=sc.nextLine();
                            
                            System.out.println("cantidad");
                            
                            try{ //evitamos que se puedan introducir letras o numeros reales
                            unidades=Integer.parseInt(sc.nextLine());
                            }catch (Exception e){//evitamos que se puedan introducir letras o numeros reales
                    
                            System.out.println("Tienes que introducir un nº entero");
                            
                             unidades=Integer.parseInt(sc.nextLine());
                             }
                            // por cada ciclo del for (depende de altaProducto) vamos rellenando el arrayProducto
                            //con los objetos productos creados con la clase Producto, cada uno con sus caracteristicas
                            arrayProducto[p]= new Producto (referencia,nombreProducto,unidades);
                            
             
                             }
                            
                        }
                        
                        
                        break;
                        
                    case 7:
                        
                        System.out.println("Introduce nombre del producto");
                            String nombreProducto=sc.nextLine();
                        
                            boolean coincide=false;
                                //for para buscar si el nombre introducido coincide con algun producto ya creado
                                //se parara si lo encuentra o el registro está vacio
                            for (int n=0;n<arrayProducto.length && !coincide && (arrayProducto[n]!=null);n++){
                            coincide= arrayProducto[n].getNombre().equalsIgnoreCase(nombreProducto);
                                if (coincide) {
                                     System.out.println(arrayProducto[n]);//si coincide nos muestra los datos del objeto producto encontrado
                                }
                            }//for
                            if (coincide==false) {
                                System.out.println("No hay ningun usuario con ese nombre");
                        }
                        
                        break;
                        
                    case 8: //for que recorrera el array y nos mostrara todos los productos creados
                        for (int n=0;n<arrayProducto.length &&(arrayProducto[n]!=null);n++){
                            
                                System.out.println(arrayProducto[n]);
                                }
                        break;
                        
                    case 9: 
                        System.out.println("Introduce el nº de orden del producto");
                        
                        int orden=Integer.parseInt(sc.nextLine());
                        
                        
                        if (arrayProducto[orden-1] == null) { //si es producto del indice introducido no ha sido creado
                            System.out.println("Ese producto aún no está creado");
                        }else{ // si existe
                        // Nos muestra la referencia del producto mediante el metodo getReferencia
                        System.out.println("La referencia es: "+arrayProducto[orden-1].getReferencia());
                        }
                        break;

                    default: /*En caso de pulsar 10, como no está definido (ni limitado),
                        continua y acaba el programa.*/
                        System.out.println("Hasta luego");
                        
                } 

            } 
          
        }
        
    }
        
}    
        
