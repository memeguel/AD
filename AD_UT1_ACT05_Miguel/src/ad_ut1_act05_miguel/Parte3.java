package ad_ut1_act05_miguel;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author CFGS
 */
public class Parte3 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        RandomAccessFile f = new RandomAccessFile("src/ad_ut1_act05_miguel/fichero3.dat", "rw");
        double precio;
        for (int i = 0; i < 50; i++) {
            precio = Math.random() * 200;
            f.writeInt(i+1);
            f.writeDouble(precio);
        }
        
        f.seek(0);
        for (int i = 0; i < 50; i++) {
            System.out.printf("Rferencia: %d, Precio: %.2f%n", f.readInt(), f.readDouble());
        }
        
        f.seek(0);
        long posicion=f.getFilePointer();
        while(posicion<f.length()) {
            f.readInt();
            precio=f.readDouble();
            if (precio<100) {
                f.seek(f.getFilePointer()-8);
                f.writeDouble(precio-(precio/10));
            }else{
                f.seek(f.getFilePointer()-8);
                f.writeDouble(precio+(precio/10));
            }
            posicion=f.getFilePointer();
        }
        System.out.println("-----------------Después de las modificaciones-----------------");
        f.seek(0);
        for (int i = 0; i < 50; i++) {
            System.out.printf("Rferencia: %d, Precio: %.2f%n", f.readInt(), f.readDouble());
        }
    } //Fin del main
}
