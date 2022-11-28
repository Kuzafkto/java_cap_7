/*
 * Modifica el programa anterior de tal forma que las sumas parciales y la suma
total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
que el ordenador se queda “pensando” antes de mostrar los números.

 *@author KuzaFkto
 */
package Bidimensionales;


import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) throws InterruptedException {
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
                Thread.sleep(100+(int)(Math.random()*900));
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
            Thread.sleep((int)(Math.random()*1501));
            System.out.printf("%4d%2s",totalcolumna,"");
        }
        Thread.sleep(1000);
        System.out.print("|total = "+total+"|\n");

        sc.close();
    }
}
