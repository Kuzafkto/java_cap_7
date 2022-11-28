/*
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con
números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
continuación, el programa deberá dar la posición tanto del máximo como del
mínimo.
*
 *@author KuzaFkto
 */
package Bidimensionales;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][]n=new int[6][10];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n.length;i++){
            for(int j=0;j<n[i].length;j++){
                n[i][j]=(int)(Math.random()*1001);
                if(n[i][j]<min){
                    min=n[i][j];
                }
                if(n[i][j]>max){
                    max=n[i][j];
                }
            }
        }
        System.out.print("\nÍndice: ");

        System.out.print("    0     1     2     3     4     5     6     7     8     9\n");
        System.out.printf("%-11s------------------------------------------------------------\n","");
        for (int i=0;i<n.length;i++){
            System.out.printf("%10s","");
            for (int j=0;j<n[i].length;j++){
                System.out.printf(" %3d |",n[i][j]);
            }
            System.out.printf("%8s","Fila "+i);
            System.out.println();
            System.out.printf("%-11s------------------------------------------------------------\n","");

        }
        System.out.printf("%-13s El número mas grande es el %d y el mas pequeño es el %d","",max,min);
        sc.close();
    }
}
