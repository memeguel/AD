package parte3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;


/**
 *
 * @author CFGS
 */

public class Ejercicio {
    public static void main(String[] args) throws IOException {
        String ruta=System.getProperty("user.home");
        File logo=new File(ruta+"/Downloads/logo-java.svg");
        File carpeta=new File(ruta+"/Documents/copia");
        carpeta.mkdir();
        
        carpeta=new File(ruta+"/Documents/copia/logo-java_copia.svg");
        FileInputStream is=new FileInputStream(logo);
        FileOutputStream os=new FileOutputStream(carpeta);
        int c;
        while ((c=is.read())!=-1) {            
            os.write(c);
        }
        is.close();
        os.close();
    } //Fin del main

} //Fin de la clase Ejercicio
