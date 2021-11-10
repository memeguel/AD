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
        for (float i = 0; i < 2; i++) {
            f.writeFloat(i);
        }
        
        boolean opSalir = true;
        int op;
        float num1,num2;
        while (opSalir) {
            System.out.println("Introduzca el número de la opción a elegir:"
                    + "1. Añadir número de tipo float al final del fichero."
                    + "2. Buscar en el fichero un número que se pedirá por consola."
                    + "3. Sustituir el número de la posición indicada."
                    + "4. Mostrar el fichero creado."
                    + "5. Salir");
            op=sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Introduzca el número que desea añadir: ");
                    num1=sc.nextFloat();
                    anadirNumero(f,num1);
                    break;
                case 2:
                    System.out.print("Introduzca el número que desea buscar: ");
                    num1=sc.nextFloat();
                    System.out.print("Introduzca el número que lo sustituirá: ");
                    num2=sc.nextFloat();
                    buscarNumero(f,num1,num2);
                    break;
                case 3:
                    sustituirNumeroPosIndicada(f);
                    break;
                case 4:
                    mostrarFichero(f);
                    break;
                case 5:
                    opSalir=false;
                    break;
                default:
                    System.out.println("Ninguna opción asociada a ese número, intentelo de nuevo.");
                    break;
            }
        }

    } //Fin del main
    private static void anadirNumero(RandomAccessFile f,float num) throws IOException, InterruptedException{
        f.seek(f.length());
        f.writeFloat(num);
        System.out.println("Número "+num+" introducido...");
        Thread.sleep(3000);
    }
    private static void buscarNumero(RandomAccessFile f,float num1,float num2) throws IOException, InterruptedException{
        float numBuscado;
        long pos=4;
        f.seek(pos*0);
        
        for (int i = 1; f.getFilePointer() != f.length(); i++) {
            
            f.seek(pos*i);
        }
        
    }
    private static void sustituirNumeroPosIndicada(RandomAccessFile f){
        
    }
    private static void mostrarFichero(RandomAccessFile f){
        
    }
} //Fin de la clase Parte2
