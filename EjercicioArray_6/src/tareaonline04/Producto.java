/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaonline04;

/**
 *
 * @author Mario
 */
public class Producto {
    
     //Atributos de instancias
    
    private String referencia;
    private String nombre;
    private int unidades;
    
    // Constructor
    
    public Producto(String referencia, String nombre, int unidades){
    
        this.referencia = referencia;
        this.nombre = nombre;
        this.unidades = unidades;
       
    }
    //Método para mostrar el nombre 
    
    public String getNombre (){
        return this.nombre;
    }
    //Método para mostrar la referencia
    
    public String getReferencia() {
        return this.referencia;
    }
    //Método para mostrar las unidades
    
    public int getUnidades() {
        return this.unidades;
    }
    
    //Método para asignar el nombre
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Método para asignar la referencia
    
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    //Método para asignar las unidades
    
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
        
    //Método para mostrar una cadena de caracteres 
    
    public String toString() {
        String vDevuelto ;
        
        vDevuelto = "Referencia: "+ referencia ;
        vDevuelto += "\nNombre: "+ nombre ;
        vDevuelto += "\nUnidades: "+ unidades ;
       
        return vDevuelto;
    }

    
}
