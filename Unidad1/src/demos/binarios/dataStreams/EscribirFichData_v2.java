package demos.binarios.dataStreams;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author CFGS
 */
public class EscribirFichData_v2 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File f = new File("./src/demos/binarios/dataStreams/fichBytes.dat");

        DataOutputStream escribir = new DataOutputStream(new FileOutputStream(f));

        String[] nombres = {"Miguel", "Alejandro", "Paco", "Carabut", "Izan", "Diego"};
        int[] edades = {25, 19, 20, 20, 32, 18};

        for (int i = 0; i < edades.length; i++) {
            escribir.writeUTF(nombres[i]);
            escribir.writeInt(edades[i]);
        }
        escribir.close();

    } //Fin del main

} //Fin de la clase EscribirFichData
