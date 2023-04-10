/*
Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa).
 */
package Arreglos_Guia5;

public class ej5 {
    public static void main(String[] args) {
        // TODO code application logic here
    int [][] A= new int [3][3];
    //carga la matriz con aleatorios y la imprime
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            A[i][j]= (int) (Math.random() * (10) - 4);
            System.out.print("[" + A[i][j] + "]");
        }  
        System.out.println("");
}
        System.out.println("");
       //imprime la transpuesta de la matriz 
    for (int j = 0; j < 3; j++) {
        for (int i = 0; i < 3; i++) {
            System.out.print("[" + A[i][j] + "]");
    }
        System.out.println("");   
}
    comprobar(A);
} //comprueba que la matriz sea distintas de su transpuesta
    public static void comprobar(int[][]A){
     boolean log=false;
     for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++){
            if (A[i][j] != -A[j][i]) {
                log=true;  
            } 
        }
 }
        if (log) {
            System.out.println("La matriz no es antisimetrica");
        }else {
            System.out.println("La matriz es antisimetrica");
        }

}
}