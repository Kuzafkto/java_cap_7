/*
 *Realiza un programa que pida 8 números enteros y que luego muestre esos
números junto con la palabra “par” o “impar” según proceda.

 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[]=new int [8];
        for(int i =0; i<n.length;i++){
            System.out.print("Ingrese un número en el array: ");
            n[i]=sc.nextInt();
        }
        for(int i =0; i<n.length;i++){
            if(n[i]%2==0){
                System.out.print(n[i]+" par ");
            }else{
                System.out.print(n[i]+" impar ");
            }
        }

        sc.close();
    }
}
