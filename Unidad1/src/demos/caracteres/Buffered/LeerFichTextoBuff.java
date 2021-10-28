package demos.caracteres.Buffered;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author CFGS
 */
public class LeerFichTextoBuff {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("src/demos/caracteres/Buffered/fichero1.txt");
        BufferedReader leer = new BufferedReader(new FileReader(f));

        String frase;
        
        while ((frase = leer.readLine()) != null) {
            System.out.println(frase);
        }

        leer.close();
    } //Fin del main

} //Fin de la clase LeerFichTexto
