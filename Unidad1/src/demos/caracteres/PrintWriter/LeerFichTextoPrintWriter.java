package demos.caracteres.PrintWriter;

import java.io.BufferedReader;
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
public class LeerFichTextoPrintWriter {

    public static void main(String[] args){
        File f = new File("src/demos/caracteres/PrintWriter/fichero.txt");
        BufferedReader leer=null;
        try {
            leer = new BufferedReader(new FileReader(f));
            String frase;
        
        while ((frase = leer.readLine()) != null) {
            System.out.println(frase);
        }

        leer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeerFichTextoPrintWriter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LeerFichTextoPrintWriter.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            try {
                if (leer != null) {
                    leer.close();
                }
            } catch (IOException ex) {


            }
        }

        
    } //Fin del main

} //Fin de la clase LeerFichTexto
