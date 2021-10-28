package demos.binarios.dataStreams;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author CFGS
 */
public class LeerFichData_v2 {

    public static void main(String[] args) throws EOFException, IOException {
        File f = new File("./src/demos/binarios/dataStreams/fichBytes.dat");
        DataInputStream leer = new DataInputStream(new FileInputStream(f));

        try {
            while (true) {
                System.out.println("Nombre: " + leer.readUTF() + " Edad: " + leer.readInt());
            }
        } catch (EOFException e) {
            System.out.println("Fin del fichero");
        }
        leer.close();
    } //Fin del main

} //Fin de la clase LeerFichData
