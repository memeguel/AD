package demos.acceso_aleatorio;

import java.io.*;

/**
 *
 * @author CFGS
 */
public class LeerFichAleatorio_v2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File fichero = new File("src/demos/acceso_aleatorio/fichero2.dat");
        RandomAccessFile file = new RandomAccessFile(fichero, "r");

        int id, dep;
        long puntero = 0L;
        double salario;
        String apellido;

        while (file.getFilePointer() != file.length()) {
            file.seek(puntero);
            id = file.readInt();
            apellido = file.readUTF();
            dep = file.readInt();
            salario = file.readDouble();

            System.out.printf("ID: %d, Apellido: %s, Departamento: %d, Salario: %.2f%n", id, apellido, dep, salario);
            puntero =file.getFilePointer();
        } //Fin del while
        file.close();
    } //Fin del main

} //Fin de la clase LeerFichAleatorio
