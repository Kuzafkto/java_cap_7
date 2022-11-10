/*
 * Escribe un programa que pida 10 números por teclado y que luego muestre los
números introducidos junto con las palabras “máximo” y “mínimo” al lado del
máximo y del mínimo respectivamente.
*
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minNum=Integer.MAX_VALUE;
        int maxNum=Integer.MIN_VALUE;
        int n[]=new int[10];
        for(int i=0; i<n.length;i++){
            System.out.print("Ingrese un número: ");
            n[i]=sc.nextInt();
            if(n[i]<minNum){
                minNum=n[i];
            }
            if(n[i]>maxNum){
                maxNum=n[i];
            }
        }

        for (int i=0;i<n.length;i++){
            if(n[i]==minNum){
                System.out.print(n[i]+" mínimo ");
            }else if(n[i]==maxNum){
                System.out.print(n[i]+" máximo ");
            }else{
                System.out.print(n[i]+" ");
            }
        }

        sc.close();
    }
}
