/*
 * Escribe un programa que pida 20 números enteros. Estos números se deben
introducir en un array de 4 filas por 5 columnas. El programa mostrará las
sumas parciales de filas y columnas igual que si de una hoja de cálculo se
tratara. La suma total debe aparecer en la esquina inferior derecha.

 *@author KuzaFkto
 */
package Bidimensionales;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca 20 números en el array pulsando INTRO. ");
        int [][] n=new int[4][5];
        int total=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                n[i][j]=sc.nextInt();
                total+=n[i][j];
            }
        }
        System.out.print("\nÍndice: ");

        System.out.print("    0     1     2     3     4   \n");
        System.out.print("           -----------------------------\n");
        for (int i=0;i<4;i++){
            System.out.printf("%10s","");
            for (int j=0;j<5;j++){
                System.out.printf(" %3d |",n[i][j]);
            }
            System.out.printf("%8s","Fila "+i);
            System.out.println();
            System.out.print("           -----------------------------\n");

        }
        System.out.print("           col0  col1  col2  col3  col4 |total = "+total+"|\n");

        sc.close();
    }
}
