package demos.caracteres.Buffered;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author CFGS
 */

public class EscribirFichTextoBuff {
    public static void main(String[] args) throws IOException {
        File f=new File("src/demos/caracteres/Buffered/fichero1.txt");
        BufferedWriter escribir=new BufferedWriter(new FileWriter(f));
        
        for (int i = 1; i <= 10; i++) {
            escribir.write("Fila número: "+i);
            escribir.newLine();
        }
        
        escribir.close();
        
    } //Fin del main

} //Fin de la clase EscribirFichTexto
