/*
 * Escribe un programa que rellene un array de 15 elementos con números enteros
comprendidos entre 0 y 500 (ambos incluidos). A continuación, se mostrará el
array “cincuerizado”, según el siguiente criterio: si el número que hay en una
posición del array es múltiplo de 5, se deja igual, y si no, se cambia por el
siguiente múltiplo de 5 que exista a partir de él.
*
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n=new int[15];
        for(int i=0; i<n.length;i++){
            n[i]=(int)(Math.random()*501);
        }
        System.out.print("\nÍndice: ");

        System.out.print("   0      1      2      3      4      5      6      7      8      9     10     11     12     13     14   \n");

        System.out.print("        ----------------------------------------------------------------------------------------------------------\n");
        System.out.printf("%7s%2s","Valor:","|");
        for (int j : n) {
            System.out.printf(" %3d  |",j);
        }
        System.out.print("\n        ----------------------------------------------------------------------------------------------------------\n");
        System.out.printf("%50s","Array inicial\n\n");

        for(int i=0;i<n.length;i++){
            if(n[i]%5!=0||n[i]==0){
                int counter=1;
                while((n[i]+counter)%5!=0){
                    counter++;
                }
                n[i]+=counter;
            }
        }
        System.out.print("\nÍndice: ");

        System.out.print("   0      1      2      3      4      5      6      7      8      9     10     11     12     13     14   \n");

        System.out.print("        ----------------------------------------------------------------------------------------------------------\n");
        System.out.printf("%7s%2s","Valor:","|");
        for (int j : n) {
            System.out.printf(" %3d  |",j);
        }
        System.out.print("\n        ----------------------------------------------------------------------------------------------------------\n");
        System.out.printf("%50s","Array final\n");

        sc.close();
    }
}
