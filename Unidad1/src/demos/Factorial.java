package demos;

import java.util.Scanner;


/**
 *
 * @author CFGS
 */

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el numero: ");
        int num=sc.nextInt();
        System.out.println(factorial(num));
    } //Fin del main

    private static int factorial(int num) {
        if (num>1) {
            num=num*factorial(num-1);
        }
        else{
            num=1;
        }
        return num;
    }

} //Fin de la clase Factorial
