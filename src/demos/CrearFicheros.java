package demos;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author CFGS
 */

public class CrearFicheros {
    public static void main(String[] args) {
        
        File fichero=new File("C:\\Prueba\\miFichero.txt");
        
        try {
            if (fichero.createNewFile()) {
                System.out.println("Se ha creado correctamente el fichero");
            }
            else{
                System.out.println("No se ha podido crear el fichero");
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }

        String path="C:\\Prueba\\miFichero.txt";
        File ruta=new File(path);
        if (ruta.exists()) {
            ruta.delete();
        }
        //Crear directorios
        String directorio1="C:\\prueba2";
        String directorio2="/carpeta1/carpeta2/carpeta3";
        String directorio3="C:\\prueba3\\C1\\C2\\C3";
        //Crear directorio prueba2
        if (new File(directorio1).mkdir()) {
            System.out.println("Directorio "+directorio1+" creado");
        }
    } //Fin del main

} //Fin de la clase CrearFicheros
