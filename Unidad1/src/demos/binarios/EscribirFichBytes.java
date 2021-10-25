package demos.binarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 *
 * @author CFGS
 */

public class EscribirFichBytes {
    public static void main(String[] args) throws IOException {
        File fdat=new File("./src/demos/binarios/fichBytes.dat");
        fdat.createNewFile();
        
        FileOutputStream num=new FileOutputStream(fdat);
        for (int i = 1; i <= 100; i++) {
            num.write(i);
        }
        num.close();
        FileInputStream leer=new FileInputStream(fdat);
        while (leer.read()!=-1) {            
            System.out.println(leer.read());
        }
    } //Fin del main

} //Fin de la clase EscribirFichBytes
