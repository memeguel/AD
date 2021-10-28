package demos.caracteres.Buffered;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author CFGS
 */

public class EscribirFichTextoBuff_v2 {
    public static void main(String[] args) {
        BufferedWriter escribir=null;
        try {
            File f=new File("src/demos/caracteres/Buffered/fichero1.txt");
            escribir = new BufferedWriter(new FileWriter(f));
            for (int i = 1; i <= 10; i++) {
                escribir.write("Fila número: "+i);
                escribir.newLine();
            }   escribir.close();
        } 
        catch (IOException ex) {
            Logger.getLogger(EscribirFichTextoBuff_v2.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (escribir!=null) {
                    escribir.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(EscribirFichTextoBuff_v2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//Fin del main

} //Fin de la clase EscribirFichTexto
