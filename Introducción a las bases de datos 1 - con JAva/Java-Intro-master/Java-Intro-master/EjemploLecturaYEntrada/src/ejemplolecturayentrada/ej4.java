package ejemplolecturayentrada;


import java.util.Scanner;

/*
Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
 */

public class ej4 {
    public static void main(String[] args) {
        // TODO code application logic here  = 32 + (9 * C / 5)
    Scanner teclado= new Scanner(System.in);
    System.out.println("Ingrese la temperatura del día: ");
    double grados=teclado.nextDouble();
    double farenheit= 32 + (9 * grados / 5);
     System.out.println("La conversión de grados " + grados + " a farenheit es: " + farenheit)  ;    
    
    }
    
}