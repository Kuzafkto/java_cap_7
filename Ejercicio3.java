/*
 *Escribe un programa que lea 10 números por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el último en mostrarse
y viceversa.

 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[]=new int[10];
        for(int i=9;i>=0;i--){
            System.out.print("Ingrese un número dentro del array: ");
            n[i]=sc.nextInt();
        }for(int i=0 ; i<n.length;i++){
            System.out.print(n[i]+" ");
        }
        sc.close();
    }
}
