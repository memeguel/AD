package demos.binarios.objectStreams;

import java.io.Serializable;


/**
 *
 * @author CFGS
 */

public class Persona implements Serializable{
    String nombre;
    int edad;
    public Persona(){
        
    }//Fin constructor vacio
    
    public Persona(String nombre,int edad){
        this.edad=edad;
        this.nombre=nombre;
    }//Fin constructor con todos los parametros
    
    public int getEdad(){
        return edad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
}//Fin class
