package demos.caracteres.Buffered;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CFGS
 */
public class LeerFichTextoBuff_v2 {

    public static void main(String[] args){
        File f = new File("src/demos/caracteres/Buffered/fichero1.txt");
        BufferedReader leer;
        try {
            leer = new BufferedReader(new FileReader(f));
            String frase;
        
        while ((frase = leer.readLine()) != null) {
            System.out.println(frase);
        }

        leer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeerFichTextoBuff_v2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LeerFichTextoBuff_v2.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    } //Fin del main

} //Fin de la clase LeerFichTexto
