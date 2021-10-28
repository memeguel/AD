package demos.binarios.dataStreams;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author CFGS
 */
public class LeerFichData {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("./src/demos/binarios/dataStreams/fichBytes.dat");
        DataInputStream leer = new DataInputStream(new FileInputStream(f));

        try {
            while (true) {
                System.out.println(leer.readUTF());
            }
        } catch (EOFException e) {

        }
        leer.close();
    } //Fin del main

} //Fin de la clase LeerFichData
