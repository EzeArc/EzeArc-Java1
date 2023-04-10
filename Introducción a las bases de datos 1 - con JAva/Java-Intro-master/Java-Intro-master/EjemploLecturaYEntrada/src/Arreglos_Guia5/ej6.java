/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package Arreglos_Guia5;

import java.util.Scanner;

public class ej6 {

    public static void main(String[] args) {
        int [][] matriz=new int [3][3];       
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz [i][j]= cargar1();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[ "+matriz[i][j]+ " ]");
            }
            System.out.println("");
        }
        System.out.println("");
        sumaFila(matriz);
        System.out.println("");
        sumaColumna(matriz);
        System.out.println("");
        sumaDiago(matriz);
        
        System.out.println("");
        }
    //carga de datos con funcion if-return
  /* public static int cargar(){
       Scanner leer= new Scanner(System.in);
       System.out.println("ingrese un num: ");
       int num=leer.nextInt();
       if (num>=1 && num<=9 ) {
           return num;   
       }else{
           System.out.println("Ingrese un numero entre 1 y 9 ");
           cargar();
       }
        return cargar();
   }
*/
//carga de datos con while
public static int cargar1(){
   int num=0;
    while(num<1 || num>9){
        Scanner leer= new Scanner(System.in);
       System.out.println("ingrese un numero a cargar en la matriz: " );  
       num=leer.nextInt();
   }
        return num;
    
}
//sumar Fila
    public static int sumaFila(int [][] matriz){
        int sumaF=0;
        for (int i = 0; i < 3; i++) {
            sumaF=0;
            for (int j = 0; j < 3; j++) {
                sumaF+= matriz[i][j];
            }
            System.out.print(" Suma fila ["+i+ "] es: "+ sumaF+ " // ");
        } 
        return sumaF;
}
 public static int sumaColumna(int [][] matriz){
        int sumaC=0;
        for (int j = 0; j < 3; j++) {
            sumaC=0;
            for (int i = 0; i < 3; i++) {
                sumaC+= matriz[j][i];
            }
            System.out.print(" Suma columna ["+j+ "] es: "+ sumaC+" // ");
        } 
        System.out.println("");
        return sumaC;
}
 public static int sumaDiago(int [][] matriz){
        int sumaD=0;
        for (int i = 0; i < 3; i++) {
            sumaD+= matriz[i][i];
        } 
        System.out.println(" Suma de la diagonal es: "+ sumaD);
        return sumaD;
}
 public static int esMagico(int sumaDiago, int sumaFila, int sumaColumna){
     int magico = 0;
     if(sumaFila==sumaColumna && sumaDiago==sumaFila && sumaDiago==sumaColumna){
         magico=1;
         System.out.println("¡Es MAGICO!");
     }else {
         System.out.println("NO es magico.");
     }
        return magico;
 }
}