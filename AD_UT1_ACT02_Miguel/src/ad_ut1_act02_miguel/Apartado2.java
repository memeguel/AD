package ad_ut1_act02_miguel;

import java.io.File;


/**
 *
 * @author CFGS
 */

public class Apartado2 {
    public static void main(String[] args) {
        File directorioActual=new File(".");
        File[] ficheros=directorioActual.listFiles();
        for (File fichero : ficheros) {
            if (fichero.isFile()) {
                System.out.println("Archivo --> "+fichero.getName());
            }else{
                System.out.println("Directorio --> "+fichero.getName());
            }
        }
    } //Fin del main

} //Fin de la clase Apartado2
