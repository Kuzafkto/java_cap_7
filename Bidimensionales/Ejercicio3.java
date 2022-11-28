/*
 * Modifica el programa anterior de tal forma que los números que se introducen
en el array se generen de forma aleatoria (valores entre 100 y 999).

 *@author KuzaFkto
 */
package Bidimensionales;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas=4;
        int columnas=5;
        int [][] n=new int[filas][columnas];
        int total=0;
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                n[i][j]=100+(int)(Math.random()*900);
                total+=n[i][j];
            }
        }
        System.out.print("\nÍndice: ");

        System.out.print("    0     1     2     3     4   \n");
        System.out.print("           -----------------------------\n");
        for (int i=0;i<filas;i++){
            System.out.printf("%10s","");
            for (int j=0;j<columnas;j++){
                System.out.printf(" %3d |",n[i][j]);
            }
            System.out.printf("%8s","Fila "+i);
            System.out.println();
            System.out.print("           -----------------------------\n");

        }
        System.out.printf("%10s","");
        for(int j=0;j<columnas;j++){
            int totalcolumna=0;
            for(int i=0;i<filas;i++){
                totalcolumna+=n[i][j];
            }
            System.out.printf("%4d%2s",totalcolumna,"");
        }
        System.out.print("|total = "+total+"|\n");

        sc.close();
    }
}
