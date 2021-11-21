package parte5;

import java.io.BufferedReader;
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
        File f=new File("src/parte5/fichero.dat");
        BufferedWriter bw=new BufferedWriter(new FileWriter(f));
        System.out.println("Introduzca una frase:");
        bw.write(sc.nextLine());
        bw.flush();
        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(f)));
        String frase;
        while ((frase=br.readLine())!=null) {            
            System.out.println(frase.replaceAll(" ", ""));
        }
        br.close();
        bw.close();
        sc.close();
    } //Fin del main

} //Fin de la clase Ejercicio
