/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaonline04;

/**
 *
 * @author Semipresencial
 */
public class Usuario {
    //Atributos de instancias
    
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    
    // Constructor
    
    public Usuario (String nombre, String apellidos, int edad, String dni){
    
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
    
    }
    //Método para mostrar el nombre 
    
    public String getNombre (){
        return this.nombre;
    }
    //Método para mostrar los apellidos
    
    public String getApellidos() {
        return this.apellidos;
    }
    //Método para mostrar la edad
    
    public int getEdad() {
        return this.edad;
    }
    //Método para mostrar el DNI
    
    public String getDni() {
        return this.dni;
    }
    //Método para asignar el nombre
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Método para asignar los apellidos
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    //Método para asignar la edad
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    //Método para asignar el DNI
    public void setDni(String dni) {
        this.dni = dni;
    }
    //Método para mostrar una cadena de caracteres 
    
    public String toString() {
        String vDevuelto ;
        
        vDevuelto = "Nombre: "+ nombre ;
        vDevuelto += "\nApellidos: "+ apellidos ;
        vDevuelto += "\nEdad : "+ edad+" años" ;
        vDevuelto += "\nDNI : "+ dni ;
        return vDevuelto;
    }

}
