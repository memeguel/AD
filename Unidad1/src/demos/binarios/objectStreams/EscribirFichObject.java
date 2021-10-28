package demos.binarios.objectStreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


/**
 *
 * @author CFGS
 */

public class EscribirFichObject {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File ruta=new File("src/demos/binarios/objectStreams/fichPersona.dat");
        ObjectOutputStream flujoSalida=new ObjectOutputStream(new FileOutputStream(ruta));
        
        String[] nombres = {"Miguel", "Alejandro", "Paco", "Carabut", "Izan", "Diego"};
        int[] edades = {25, 19, 20, 20, 32, 18};
        
        Persona persona;
        for (int i = 0; i < edades.length; i++) {
            persona=new Persona(nombres[i], edades[i]);
            flujoSalida.writeObject(persona);
            System.out.println("Escritos los datos de la persona "+(i+1));
        }
        flujoSalida.close();
    } //Fin del main

} //Fin de la clase EscribirFichObject
