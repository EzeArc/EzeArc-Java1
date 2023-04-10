/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolecturayentrada;

import java.util.Scanner;

public class ej2 {

      public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner Teclado= new Scanner (System.in);
        
        System.out.println ("Ingrese un nombre: ");
       String nombre= Teclado.nextLine();
        System.out.print("Su nombre es: " + nombre );
    }
}