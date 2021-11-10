package ad_ut1_act05_miguel;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author CFGS
 */
public class Parte1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        RandomAccessFile raF = new RandomAccessFile("src/ad_ut1_act05_miguel/fichero1.dat", "rw");
        System.out.println("La longitud actual del fichero es "+raF.length());

        System.out.println("Escribimos los números del 0 al 199 en el fichero...");
        for (int i = 0; i < 200; i++) {
            raF.writeInt(i);
        }
        System.out.println("La longitud actual del fichero es "+raF.length());

        //El tamaño de un int son 4 bytes, para calcular la posicion hacemos el tamaño del dato * la posicion que queremos leer
        int pos = 4;

        raF.seek(pos * 0);
        int num = raF.readInt();
        System.out.println("El primer número es: "+num);

        raF.seek(pos * 1);
        num = raF.readInt();
        System.out.println("El primer número es: "+num);

        raF.seek(pos * 10);
        num = raF.readInt();
        System.out.println("El primer número es: "+num);

        System.out.println("Modificamos el undécimo valor (lo cambiamos por 555)...");
        raF.seek(pos * 11);
        raF.writeInt(555);

        System.out.println("Añadimos 999 al final del fichero...");
        raF.seek(raF.length());
        raF.writeInt(999);

        System.out.println("La nueva longitud del fichero es "+raF.length());

        raF.seek(pos * 11);
        num = raF.readInt();
        System.out.println("El undécimo número es: "+num);

        System.out.println("--------------CONTENIDO FICHERO--------------");
        raF.seek(pos * 0);
        for (int i = 1; raF.getFilePointer() != raF.length(); i++) {
            num = raF.readInt();
            System.out.println("Número "+num);
            raF.seek(pos * i);
        }
        System.out.println("--------------FIN FICHERO--------------");
    } //Fin del main

} //Fin de la clase Parte1
