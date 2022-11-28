/*
 * Realiza un programa que calcule la estatura media, mínima y máxima en
centímetros de personas de diferentes países. El array que contiene los
nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”,
“Australia”}. Los datos sobre las estaturas se deben simular mediante un
array de 4 filas por 10 columnas con números aleatorios generados al azar entre
140 y 210. Los decimales de la media se pueden despreciar. Los nombres de
los países se deben mostrar utilizando el array de países (no se pueden escribir
directamente).
*
 *@author KuzaFkto
 */
package Bidimensionales;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] countries= {"España","Rusia","Japón","Australia"};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int total=0;
        System.out.printf("%-55sMED MIN MAX\n","");
        int [][] n =new int [4][10];
        for (int i=0;i<n.length;i++){
            min=Integer.MAX_VALUE;
            max=Integer.MIN_VALUE;
            total=0;
            System.out.printf("%11s: ",countries[i]);
            for(int j=0;j<n[i].length;j++){
                n[i][j]=140+(int)(Math.random()*71);
                total+=n[i][j];
                if(n[i][j]<min){
                    min=n[i][j];
                }
                if(n[i][j]>max){
                    max=n[i][j];
                }
                System.out.print(n[i][j]+" ");
            }
            total/=10;
            System.out.printf("| %d %d %d\n",total,min,max);
        }
        sc.close();
    }
}
