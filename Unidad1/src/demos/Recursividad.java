package demos;


/**
 *
 * @author CFGS
 */

public class Recursividad {
    public static void main(String[] args) {
        countdown(10);
    } //Fin del main

    private static void countdown(int i) {
        if (i==0) {
            System.out.println("¡Tiempo!");
        }else{
            System.out.println(i);
            countdown(--i); 
        }
    }

    
} //Fin de la clase Recursividad
