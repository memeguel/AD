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
        String frase="";
        
         frase=br.readLine();
        	
        	char[] array1=frase.toCharArray();
        	char[] array2=frase.toUpperCase().toCharArray();
        	for (int i = 0; i < frase.length(); i++) {
        		char c=array1[i];
				if (c==array2[i]) {
					array1[i]=Character.toLowerCase(c);
				}else {
					array1[i]=Character.toUpperCase(c);
				}
			}
        	frase=String.valueOf(array1).replaceAll(" ", "");
            System.out.println(frase);
        
        br.close();
        bw.close();
        sc.close();
    } //Fin del main

} //Fin de la clase Ejercicio
