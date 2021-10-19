package ad_ut1_act04_miguel;

import java.io.File;
import java.util.Iterator;

/**
 *
 * @author CFGS
 */

public class Ejercicio {
    public static void main(String[] args) throws Exception{
        String ruta="/ad_ut1_act04";
        
        //Crear carpeta
        File carpeta=new File(ruta);
        carpeta.mkdir();
        
        //Crear subcarpetas y archivos
        File fichero=new File(ruta+"/fich_binario.dat");
        fichero.createNewFile();
        fichero=new File(ruta+"/fichero.txt");
        fichero.createNewFile();
        
        carpeta=new File(ruta+"/dir1");
        carpeta.mkdir();
        carpeta=new File(ruta+"/dir2");
        carpeta.mkdir();
        
        //Comprobar subcarpetas y archivos creados
        carpeta=new File(ruta);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Apartado 4.2 Mostrando contenido del directorio de la Actividad 4");
        for (File f : carpeta.listFiles()) {
			System.out.println(f.getName());
		}
        
        //Recorrer contenido del directorio
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Apartado 4.3 Mostrando si son ficheros o directorios y sus permisos");
        String caracteristicas="";
        for (File f : carpeta.listFiles()) {
        	if (f.isDirectory()) {
				caracteristicas=" es un directorio.";
			}
        	else {
        		caracteristicas=" es un fichero.";
			}
			System.out.println(f.getName()+caracteristicas+" Su ruta absoluta es: "+f.getAbsolutePath());
			caracteristicas="";
			if (fichero.canRead()) {
				caracteristicas="read, ";
			}
			else {
				caracteristicas="not readable, ";
			}
			if (fichero.canWrite()) {
				caracteristicas+="write, ";
			}
			else {
				caracteristicas+="not writable, ";
			}
			if (fichero.canExecute()) {
				caracteristicas+="execute";
			}
			else {
				caracteristicas+="not executeable";
			}
			System.out.println("Permisos de "+f.getAbsolutePath()+": "+caracteristicas);
		}
        //Mostrar directorio padre de fich_binario.dat
        fichero=new File(ruta+"/fich_binario.dat");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Apartado 4.4 Mostrando el directorio padre de "+fichero.getName());
        System.out.println("El directorio padre de "+fichero.getName()+" es "+fichero.getParentFile().getAbsolutePath());
        
        //Modificar atributos de fich_binario.dat y mostrar
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Apartado 4.5 Modificando y mostrando los atributos de "+fichero.getName());
        caracteristicas="";
        
        fichero.setWritable(false,true);
        fichero.setExecutable(false,true);
        fichero.setReadable(false,true);
        
		if (fichero.canRead()) {
			caracteristicas="read ";
		}
		else {
			caracteristicas="not readable ";
		}
		if (fichero.canWrite()) {
			caracteristicas+="write ";
		}
		else {
			caracteristicas+="not writable ";
		}
		if (fichero.canExecute()) {
			caracteristicas+="execute";
		}
		else {
			caracteristicas+="not executeable";
		}
		System.out.println("Permisos de "+fichero.getAbsolutePath()+": "+caracteristicas);
    } //Fin del main

} //Fin de la clase Ejercicio
