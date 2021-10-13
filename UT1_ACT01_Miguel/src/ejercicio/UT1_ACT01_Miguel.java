package ejercicio;

import java.io.File;
import java.io.IOException;

public class UT1_ACT01_Miguel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta="/users/Tanque Autista/documents/prueba";
		File carpetas=new File(ruta);
		carpetas.mkdir();
		carpetas=new File(ruta+"/subcarpeta1/subcarpeta2");
		carpetas.mkdirs();
		File ficheros=new File(ruta+"/fichero1.txt");
		try {
			ficheros.createNewFile();
			ficheros=new File(ruta+"/fichero2.txt");
			ficheros.createNewFile();
			ficheros=new File(ruta+"/subcarpeta1/subcarpeta2/fichero3.txt");
			ficheros.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		carpetas=new File(ruta);
		borrarContenido(carpetas);
	}
	public static void borrarContenido(File carpeta) {
		File[] ficheros=carpeta.listFiles();
		for (int i = 0; i < ficheros.length; i++) {
			if (ficheros[i].isDirectory()) {
				borrarContenido(ficheros[i]);
			}
			ficheros[i].delete();
		}
		carpeta.delete();
	}
}
