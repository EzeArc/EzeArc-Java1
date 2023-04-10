/*
 *Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
Nota: invesCase()tigar la función toUpper y toLowerCase() en Java
 */

package ejemplolecturayentrada;
import java.util.Scanner;

public class ej3 {
 public static void main(String[] args) {
        // TODO code application logic here

    Scanner Teclado= new Scanner (System.in);     
    System.out.println ("Ingrese un frase: ");       
   String frase= Teclado.nextLine();        
    System.out.println(frase.toLowerCase());
    System.out.println(frase.toUpperCase());
 }
    
}


