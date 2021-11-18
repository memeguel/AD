package parte1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author CFGS
 */
public class Ejercicio {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        //Con el append se guarda lo escrito anteriormente
        DataOutputStream escribir = new DataOutputStream(new FileOutputStream("src/parte1/fichero.dat",true));
        String nombre, dni;
        int edad;

        for (int i = 0; i < 4; i++) {
            System.out.print("Introduzca el nombre:");
            escribir.writeUTF(sc.nextLine());
            System.out.print("Introduzca el DNI:");
            escribir.writeUTF(sc.nextLine());
            System.out.print("Introduzca la edad:");
            escribir.writeInt(sc.nextInt());
            sc.nextLine();
        }

        DataInputStream leer = new DataInputStream(new FileInputStream("src/parte1/fichero.dat"));

        try {
            while (true) {
                nombre = leer.readUTF();
                dni = leer.readUTF();
                edad = leer.readInt();
                System.out.printf("Nombre: %s Edad: %d DNI: %s%n", nombre, edad, dni);
            }
        } catch (EOFException e) {
            System.out.println("Fin del fichero");
        }
        escribir.close();
        leer.close();
    } //Fin del main

} //Fin de la clase Ejercicio
