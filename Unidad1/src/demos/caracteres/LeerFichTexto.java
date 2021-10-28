package demos.caracteres;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author CFGS
 */

public class LeerFichTexto {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f=new File("src/demos/caracteres/fichero1.txt");
        FileReader leer=new FileReader(f);
        
        int i;
        while ((i=leer.read())!=-1) {            
            System.out.print((char)i);
        }
        leer.close();
    } //Fin del main

} //Fin de la clase LeerFichTexto
