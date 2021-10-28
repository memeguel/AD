package demos.binarios.objectStreams;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


/**
 *
 * @author CFGS
 */

public class LeerFichObject {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        File ruta=new File("src/demos/binarios/objectStreams/fichPersona.dat");
        ObjectInputStream flujoEntrada=new ObjectInputStream(new FileInputStream(ruta));
        Persona p;
        
        try {
            while (true) {                
                p=(Persona) flujoEntrada.readObject();
                System.out.printf("Nombre: %s Edad: %d%n",p.getNombre(),p.getEdad());
            }
        } catch (EOFException e) {
            System.out.println("Alcanzado el final del fichero");
        }
    } //Fin del main

} //Fin de la clase LeerFichObject
