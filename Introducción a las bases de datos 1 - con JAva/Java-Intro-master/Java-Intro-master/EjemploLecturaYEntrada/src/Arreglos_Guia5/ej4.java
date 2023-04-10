/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
A se denota por B y se obtiene cambiando sus filas por columnas (o
viceversa).
 */
package Arreglos_Guia5;

public class ej4 {

    public static void main(String[] args) {
        // TODO code application logic here
    int [][] num= new int [4][4];
    int fila, columna;
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            num[i][j]= (int)(Math.random()*9);
            System.out.print("[" + num[i][j] + "]");
        }  
        System.out.println("");
}
        System.out.println("");
        
    for (int j = 0; j < 4; j++) {
        for (int i = 0; i < 4; i++) {
            System.out.print("[" + num[i][j] + "]");
    }
        System.out.println("");   
}
}
}