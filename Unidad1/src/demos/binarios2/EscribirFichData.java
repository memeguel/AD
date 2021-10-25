package demos.binarios2;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;


/**
 *
 * @author CFGS
 */

public class EscribirFichData {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        File f=new File("./src/demos/binarios2/fichBytes.dat");
        f.createNewFile();
        
        DataOutputStream escribir=new DataOutputStream(new FileOutputStream(f));
        
        boolean op=true;
        while (op) {            
            System.out.println("Introduzca el nombre:");
            String name=sc.nextLine();
            System.out.println("Introduzca la edad:");
            int age=sc.nextInt();
            name="Nombre: "+name+", Edad: "+age;
            escribir.writeUTF(name);
            sc.nextLine();
            System.out.println("Stop? (y/n)");
            name=sc.nextLine();
            if (name.equalsIgnoreCase("y")) {
                op=false;
            }
            
        }
        
    } //Fin del main

} //Fin de la clase EscribirFichData
