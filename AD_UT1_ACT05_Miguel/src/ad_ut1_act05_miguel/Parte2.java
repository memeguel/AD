package ad_ut1_act05_miguel;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 *
 * @author CFGS
 */
public class Parte2 {

    public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        RandomAccessFile f = new RandomAccessFile("src/ad_ut1_act05_miguel/fichero2.dat", "rw");
        f.setLength(0);
        for (float i = 0; i < 100; i++) {
            f.writeFloat(i);
        }

        boolean opSalir = true;
        int op;
        float num1, num2;
        while (opSalir) {

            System.out.println("Introduzca el número de la opción a elegir:\n"
                    + "1. Añadir número de tipo float al final del fichero.\n"
                    + "2. Buscar en el fichero un número que se pedirá por consola.\n"
                    + "3. Sustituir el número de la posición indicada.\n"
                    + "4. Mostrar el fichero creado.\n"
                    + "5. Salir");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Introduzca el número que desea añadir: ");
                    num1 = sc.nextFloat();
                    anadirNumero(f, num1);
                    break;
                case 2:
                    System.out.print("Introduzca el número que desea buscar: ");
                    num1 = sc.nextFloat();
                    System.out.print("Introduzca el número que lo sustituirá: ");
                    num2 = sc.nextFloat();
                    buscarNumero(f, num1, num2);
                    break;
                case 3:
                    System.out.print("Introduzca la posición que desea buscar: ");
                    int pos = sc.nextInt();
                    System.out.print("Introduzca el número que lo sustituirá: ");
                    num2 = sc.nextFloat();
                    sustituirNumeroPosIndicada(f, pos, num2);
                    break;
                case 4:
                    mostrarFichero(f);
                    break;
                case 5:
                    opSalir = false;
                    break;
                default:
                    System.out.println("Ninguna opción asociada a ese número, intentelo de nuevo.");
                    break;
            }
        }

    } //Fin del main

    private static void anadirNumero(RandomAccessFile f, float num) throws IOException, InterruptedException {
        f.seek(f.length());
        f.writeFloat(num);
        System.out.println("Número " + num + " introducido...");
        Thread.sleep(3000);
    }

    private static void buscarNumero(RandomAccessFile f, float num1, float num2) throws IOException, InterruptedException {
        float numBuscado = 0;
        long tamañoDato = 4;
        f.seek(tamañoDato * 0);

        for (int i = 1; f.getFilePointer() != f.length(); i++) {
            numBuscado = f.readFloat();
            if (numBuscado == num1) {
                f.seek(f.getFilePointer() - 4);
                f.writeFloat(num2);
                break;
            }
            f.seek(tamañoDato * i);
        }
        if (f.getFilePointer() == f.length() && numBuscado != num1) {
            System.out.println("El número " + num1 + " no se encuentra en el fichero.");
        } else {
            System.out.println("Se sustituirá el número " + num1 + " por el número " + num2 + "...");
        }

        Thread.sleep(3000);
    }

    private static void sustituirNumeroPosIndicada(RandomAccessFile f, int pos, float num2) throws IOException, InterruptedException {
        int i;
        long tamañoDato = 4;
        f.seek(tamañoDato * 0);

        for (i = 0; f.getFilePointer() != f.length(); i++) {
            f.seek(tamañoDato * i);
            if ((pos - 1) == i) {
                f.writeFloat(num2);
                break;
            }

        }
        if (f.getFilePointer() == f.length() && (pos - 1) != i) {
            System.out.println("La posición " + pos + " no se encuentra en el fichero.");
        } else {
            System.out.println("Se sustituirá el número de la posición " + pos + " por el número " + num2 + "...");
        }
        Thread.sleep(3000);
    }

    private static void mostrarFichero(RandomAccessFile f) throws IOException, InterruptedException {
        float num;
        long tamañoDato = 4;
        f.seek(tamañoDato * 0);

        System.out.println("--------------CONTENIDO FICHERO--------------");
        f.seek(tamañoDato * 0);
        for (int i = 1; f.getFilePointer() != f.length(); i++) {
            num = f.readFloat();
            System.out.println("Número " + num);
            f.seek(tamañoDato * i);
        }
        System.out.println("--------------FIN FICHERO--------------");
        Thread.sleep(3000);
    }
} //Fin de la clase Parte2
