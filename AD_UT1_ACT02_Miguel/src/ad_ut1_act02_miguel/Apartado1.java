package ad_ut1_act02_miguel;

import java.io.File;
import java.io.IOException;


/**
 *
 * @author CFGS
 */

public class Apartado1 {
    public static void main(String[] args) {
        String rutaa="c:\\ficheros";
        File ruta=new File(rutaa);
        File f=new File(rutaa+"\\datos.txt");
        
        if (ruta.exists()) {
            if (f.exists()) {
                System.out.println(f.length());
            }
            else{
                try {
                    f.createNewFile();
                } catch (IOException ex) {
                    
                }
            }
        }
        else{
            ruta.mkdir();
            try {
                    f.createNewFile();
                } catch (IOException ex) {
                    
                }
        }
    } //Fin del main

} //Fin de la clase Apartado1
