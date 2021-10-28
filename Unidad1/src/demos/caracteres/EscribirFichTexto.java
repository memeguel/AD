package demos.caracteres;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author CFGS
 */

public class EscribirFichTexto {
    public static void main(String[] args) throws IOException {
        File f=new File("src/demos/caracteres/fichero1.txt");
        FileWriter escribir=new FileWriter(f);
        
        //Caracter a caracter
        String cadena="Esto es una prueba de FileWriter\n";
        char[] array=cadena.toCharArray();
        for (int i = 0; i < array.length; i++) {
            escribir.write(array[i]);
        }
        
        escribir.append("*");
        
        //Escribir String
        String cadena2="Esto es una prueba de FileWriter frase2";
        escribir.write(cadena2);
        
        String[] provincias={"Albacete","Ávila","Badajoz"};
        escribir.append("\n");
        
        for (int i = 0; i < provincias.length; i++) {
            escribir.write(provincias[i]);
        }
        
        escribir.close();
        
    } //Fin del main

} //Fin de la clase EscribirFichTexto
