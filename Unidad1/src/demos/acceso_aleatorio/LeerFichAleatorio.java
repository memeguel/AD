package demos.acceso_aleatorio;

import java.io.*;

/**
 *
 * @author CFGS
 */
public class LeerFichAleatorio {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File fichero = new File("src/demos/acceso_aleatorio/fichero1.dat");
        RandomAccessFile file = new RandomAccessFile(fichero, "r");

        int id, dep, puntero = 0;
        double salario;
        char[] arrayApellido = new char[10];

        //char aux;
        while (file.getFilePointer() != file.length()) {
            file.seek(puntero);
            id = file.readInt();
            for (int i = 0; i < arrayApellido.length; i++) {
//                aux=file.readChar();
//                apellido[i]=aux;
                arrayApellido[i] = file.readChar();
            }
            dep = file.readInt();
            salario = file.readDouble();
            String apellido = new String(arrayApellido);
        System.out.printf("ID: %d, Apellido: %s, Departamento: %d, Salario: %.2f%n", id, apellido, dep, salario);
        puntero += 36;
        } //Fin del while
        file.close();
    } //Fin del main

} //Fin de la clase LeerFichAleatorio
