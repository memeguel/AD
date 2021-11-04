package demos.acceso_aleatorio;

import java.io.*;


/**
 *
 * @author CFGS
 */

public class EsccribirFichAleatorio_v2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File fichero=new File("src/demos/acceso_aleatorio/fichero2.dat");
        RandomAccessFile file=new RandomAccessFile(fichero, "rw");
        
        String[] apellidos={"PEREZ","SANCHEZ","MARTINEZ","GIL","LOPEZ","RAMOS","CASILLA"};
        int[] dep={10,20,30,40,50,60,70};
        Double[] salario={800.00,900.00,1000.00,1100.00,1200.00,1300.00,1400.00};
        
        file.setLength(0);
        
        StringBuilder sb=null; //Aqui almacenamos el apellido
        
        for (int i = 0; i < apellidos.length; i++) {
            file.writeInt(i+1);
            //sb=new StringBuilder(apellidos[i]);
            //sb.setLength(10);
            file.writeUTF(apellidos[i]);
            //file.writeChars(sb.toString());
            file.writeInt(dep[i]);
            file.writeDouble(salario[i]);
        }
        file.close();
        
    } //Fin del main

} //Fin de la clase EsccribirFichAleatorio
