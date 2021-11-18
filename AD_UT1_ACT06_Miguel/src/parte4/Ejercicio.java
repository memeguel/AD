package parte4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 *
 * @author CFGS
 */

public class Ejercicio {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        File f=new File("src/parte4/fichero.dat");
        BufferedWriter bw=new BufferedWriter(new FileWriter(f));
        System.out.println("Introduzca una frase:");
        bw.write(sc.nextLine());
        bw.flush();
        InputStreamReader isr=new InputStreamReader(new FileInputStream(f));
        int c;
        while ((c=isr.read())!=-1) {            
            if ((char)c!=' ') {
                System.out.print((char)c);
            }
        }
        isr.close();
        bw.close();
        sc.close();
    } //Fin del main

} //Fin de la clase Ejercicio
