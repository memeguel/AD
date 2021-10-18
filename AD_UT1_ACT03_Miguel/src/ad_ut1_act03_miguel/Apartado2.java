package ad_ut1_act03_miguel;

import java.io.File;

/**
 *
 * @author CFGS
 */
public class Apartado2 {

    public static void main(String[] args) {
        String ruta = "/users/" + System.getProperty("user.name") + "/documents";
        File carpeta = new File(ruta);
        String t = "";
        verContenido(carpeta, t);
    } //Fin del main

    public static void verContenido(File carpeta, String t) {
        System.out.printf("%s%s --> %s%n", t, "Directorio", carpeta.getName());
        int i = 0;
        File[] ficheros = carpeta.listFiles();
        if (ficheros != null) {
            for (File fichero : ficheros) {
                if (fichero.isDirectory()) {
                    t += "    ";
                    verContenido(fichero, t);
                    i = t.length();
                    t = t.substring(0, i - 4);
                } else {
                    t += "    ";
                    System.out.printf("%s%s --> %s%n", t, "Archivo", fichero.getName());
                    i = t.length();
                    t = t.substring(0, i - 4);
                }

            }
        }

    }

} //Fin de la clase Apartado2
