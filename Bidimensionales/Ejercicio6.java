/*
 * Modifica el programa anterior de tal forma que no se repita ningún número en
el array.

 *@author KuzaFkto
 */
package Bidimensionales;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repeated=false;
        int filas=6;
        int columnas=10;
        int value;
        int[][]n=new int[filas][columnas];
        int max=-1;
        int min=1001;
        for(int i=0;i<n.length;i++){
            for(int j=0;j<n[i].length;j++){
                int posAct=i*columnas+j;
                do {
                    repeated=false;
                    value=((int)(Math.random()*1001)); //checkea y cambia el valor pero no admite ceros, checkea todos los números?
                     for(int k=0;k<posAct;k++){
                        if(n[k/columnas][k%columnas]==value){
                            repeated=true;
                            break;
                        }
                    }
                }while (repeated);
                n[i][j]=value;
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
