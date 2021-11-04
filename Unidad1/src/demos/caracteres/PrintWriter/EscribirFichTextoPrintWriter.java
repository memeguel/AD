package demos.caracteres.PrintWriter;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


/**
 *
 * @author CFGS
 */
public class EscribirFichTextoPrintWriter {

    public static void main(String[] args) {
        PrintWriter pw = null;
        try {
            File ruta = new File("src/demos/caracteres/PrintWriter/fichero.txt");
            pw = new PrintWriter(ruta);
            for (int i = 1; i <= 10; i++) {
                //pw.write("Fila número: " + i);
                //pw.newLine();
                pw.println("Fila número: " + i);
            }
            pw.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("Mensaje de error: " + fnfe.getMessage());

        } finally {

            if (pw != null) {
                pw.close();
            }
        }
    }//Fin del main

} //Fin de la clase EscribirFichTexto
