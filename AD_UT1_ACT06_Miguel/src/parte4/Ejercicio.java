package parte4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;


/**
 *
 * @author CFGS
 */

public class Ejercicio {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        File f=new File("src/parte4/fichero.dat");
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream(f));
        System.out.println("Introduzca una frase:");
        char[] frase=sc.nextLine().toCharArray();
        
			osw.write(frase);

        osw.flush();
        InputStreamReader isr=new InputStreamReader(new FileInputStream(f));
        int c;
        while ((c=isr.read())!=-1) {            
            if ((char)c!=' ') {
                System.out.print((char)c);
            }
        }
        isr.close();
        osw.close();
        sc.close();
    } //Fin del main

} //Fin de la clase Ejercicio
