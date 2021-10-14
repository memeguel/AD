package ad_ut1_act03_miguel;

import java.io.File;
import javax.swing.JOptionPane;


/**
 *
 * @author CFGS
 */

public class Apartado1 {
    public static void main(String[] args) {
        String ruta=JOptionPane.showInputDialog("Introduzca la ruta:");
        File directorio=new File(ruta);
        File[] ficheros=directorio.listFiles();
        ruta="";
        for (File fichero : ficheros) {
            if (fichero.isFile()) {
                ruta=ruta+"Archivo --> "+fichero.getName()+"\n";
            }else{
                ruta=ruta+"Directorio --> "+fichero.getName()+"\n";
            }
        }
        JOptionPane.showMessageDialog(null, ruta);
    } //Fin del main

} //Fin de la clase Apartado1
