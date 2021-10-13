package ad_ut1_act01;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author CFGS
 */

public class AD_UT1_Act01 {
    public static void main(String[] args) {
        String ruta="/users/cfgs/documents/prueba";
        File carpeta=new File(ruta);
        carpeta.mkdir();
        
        File ficheros=new File(ruta+"/fichero1.txt");
        
        try {
        ficheros.createNewFile();
        ficheros=new File(ruta+"/fichero2.txt");
        ficheros.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(AD_UT1_Act01.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        carpeta=new File(ruta+"/subcarpeta1/subcarpeta2");  
        carpeta.mkdirs();
        
        ficheros=new File(ruta+"/subcarpeta1/subcarpeta2/fichero1.txt");
        try {
            ficheros.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(AD_UT1_Act01.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        carpeta=new File(ruta);
        
    } //Fin del main

} //Fin de la clase AD_UT1_Act01
