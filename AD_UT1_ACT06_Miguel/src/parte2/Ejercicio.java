package parte2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author CFGS
 */
public class Ejercicio {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        //Con el append se guarda lo escrito anteriormente
        ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream("src/parte1/fichero.dat"));
        String nombre, dni;
        int edad;

        for (int i = 0; i < 4; i++) {
            System.out.print("Introduzca el nombre:");
            nombre=sc.next();
            System.out.print("Introduzca el DNI:");
            dni=sc.next();
            System.out.print("Introduzca la edad:");
            edad=sc.nextInt();
            escribir.writeObject(new Persona(nombre, dni, edad));
        }

        ObjectInputStream leer = new ObjectInputStream(new FileInputStream("src/parte1/fichero.dat"));

        try {
            
            while (true) {
                Persona p=(Persona) leer.readObject();
                
                System.out.printf("Nombre: %s Edad: %d DNI: %s%n", p.getNombre(), p.getEdad(), p.getDni());
            }
        } catch (EOFException e) {
            System.out.println("Fin del fichero");
        }
        escribir.close();
        leer.close();
    } //Fin del main

} //Fin de la clase Ejercicio
