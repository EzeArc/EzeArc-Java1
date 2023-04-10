/*
Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().
 */
package ejemplolecturayentrada;

import java.util.Scanner;

/**
 *
 * @author ezequ
 */
public class ej5 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
     Scanner teclado=new Scanner(System.in);
     System.out.println("Ingrese un número");
     int num= teclado.nextInt();
     int doble= num * 2;
     System.out.println("El doble de su numero es: " + doble);
     int triple= num* 3;
      System.out.println("El doble de su numero es: " + triple);
     double raiz= Math.sqrt(num); 
     System.out.println("La razi caudrada de su numero es: " + raiz);
    }
    
}