/*
 Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido
 */
package Arreglos_Guia5;

import java.util.Scanner;

/**
 *
 * @author ezequ
 */
public class ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] num = new int[5];
      int aleatorio= 0, contador=0;
       Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese un numero a buscar: ");
      int numABuscar=teclado.nextInt();
            for (int i = 0; i < num.length; i++) {
                num[i]=(int)(Math.random()*5);
                System.out.println("[" + num[i] + "]");
                aleatorio= i;
                if (numABuscar== num[i]){
                    contador++;
                }
        }
      if (contador>=1){
                System.out.println("El numero a buscar " + numABuscar + " se encuentra en la posición: " + "[" + aleatorio + "]");
            }else{
               System.out.println("El numero a buscar " + numABuscar + " no se encuentra en el vector"); 
            }
      
        }
    }
