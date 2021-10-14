package ad_ut1_act03_miguel;

import java.io.File;


/**
 *
 * @author CFGS
 */

public class Apartado2 {
    public static void main(String[] args) {
        File ruta=new File("/users/cfgs/documents/pruebas");
        verContenido(ruta);
    } //Fin del main
    public static void verContenido(File carpeta) {
        String t="";
        File[] ficheros=carpeta.listFiles();
            for (File fichero : ficheros) {
                if (fichero.isDirectory()) {
                    System.out.printf("%s%s --> %s",tabulaciones(t),"Directorio",fichero.getName());
                    verContenido(fichero);
		}else{
                    System.out.printf("%s%s --> %s",tabulaciones(t),"Archivo",fichero.getName());
                }
		
            }
    }
    public static String tabulaciones(String t){
        t+="    ";
        return t;
    }
} //Fin de la clase Apartado2
