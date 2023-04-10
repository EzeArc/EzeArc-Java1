package ejemplolecturayentrada;


import java.util.Scanner;
/**
 Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma*/

public class ejclase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
 
  Scanner Leer= new Scanner (System.in);
  
  System.out.println ("Ingrese el 1er numero: ");
  int num1=Leer.nextInt() ;
           
  System.out.println ("Ingrese el 1er numero: ");
   int num2=Leer.nextInt();
           
   int suma= num1 + num2;        
   System.out.println ("La suma es: "+ suma) ;
    }
    
}
