/*
. Recorrer un vector de N enteros contabilizando cuántos números son 
de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Arreglos_Guia5;

public class ej3 {

    public static void main(String[] args) {
   int [] num= new int [100000];
   int totalDigitos=0;
   int auxiliar=0;
   int contador1=0, contador2=0, contador3=0,contador4=0,contador5=0,  c= 0;
        
   for (int i = 0; i <= 99999; i++) {
       num[i]= (int)(Math.random()*99999);
       System.out.println(num[i]);
       auxiliar = num[i];
       totalDigitos=0;
     while(auxiliar != 0)  
        {              // removing the last digit of the number n  
            auxiliar = auxiliar / 10;  
            // increasing count by 1  
            totalDigitos= totalDigitos+1;  
        }  
       switch (totalDigitos) {
           case 1: 
                   contador1++;
                   break;
           case 2: 
                    contador2++;
                     break;
           case 3: 
                    contador3++;
                     break;
           case 4: 
                    contador4++;
                     break;
           case 5:
                   contador5++;  
                    break;
           default:
               c++;
       }
        }
        System.out.println("Encontramos " + contador1 + " numero/s de un digito");
        System.out.println("Encontramos " + contador2 + " numeros de dos digito");
        System.out.println("Encontramos " + contador3 + " numeros de tres digito");
        System.out.println("Encontramos " + contador4 + " numeros de cuatro digito");
        System.out.println("Encontramos " + contador5 + " numeros de cinco digito");
        System.out.println(contador1 + contador2 + contador3+ contador4+ contador5);
        System.out.println(c);
    }
}
