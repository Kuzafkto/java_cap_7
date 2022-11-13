/*
 * Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
primos a las primeras posiciones, desplazando el resto de números (los que no
son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
array resultante.

*
 *@author KuzaFkto
 */

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio11 {
    public static void main(String[] args) {
        int[] n =new int [10];
        Scanner sc=new Scanner (System.in);
        int counter=0;
        boolean prime=true;
        int[] nonprimes =new int[10];
        Arrays.fill(nonprimes, -1);
        for(int i=0; i<n.length;i++){
            System.out.print("Introduce un número entre 0 y 100 para ingresar al array: ");
            n[i]=sc.nextInt();
            while(n[i]<0||n[i]>100){
                    System.out.print("Error, el número debe ser mayor a 0 y menor a 100. Vuelva a ingresarlo:  ");
                    n[i]=sc.nextInt();
            }
        }
        /*First array table*/
        System.out.print("Índice: ");

        System.out.print("   0      1      2      3      4      5      6      7      8      9   \n");

        System.out.print("        ----------------------------------------------------------------------\n");
        System.out.printf("%7s%2s","Valor:","|");
        for (int j : n) {
            if(j<10){
                System.out.printf("  %1d  | ",j);
            }else{
                System.out.printf(" %3d  |",j);
            }
        }
        System.out.print("\n        ----------------------------------------------------------------------\n");
        System.out.printf("%50s","Array inicial\n\n");

        /*First array table*/

        for(int i=0; i<n.length;i++){
            if(n[i]%2==0&&n[i]!=2||n[i]==1||n[i]==0){
                prime=false;
            }else{
                for (int z=3;z<n[i]/2;z+=2){
                    if (n[i] % z == 0) {
                        prime = false;
                        break;
                    }
                }
            }
            if(prime){
                n[counter]=n[i];
                counter++;
            }else{
                nonprimes[i]=n[i];
            }
            prime=true;
        }
        for (int nonprime : nonprimes) {
            if (nonprime != -1) {
                n[counter] = nonprime;
                counter++;
            }
        }
        /*Second array table*/
        System.out.print("Índice: ");

        System.out.print("   0      1      2      3      4      5      6      7      8      9   \n");

        System.out.print("        ----------------------------------------------------------------------\n");
        System.out.printf("%7s%2s","Valor:","|");
        for (int j : n) {
            if(j<10){
                System.out.printf("  %1d  | ",j);
            }else{
                System.out.printf(" %3d  |",j);
            }
        }
        System.out.print("\n        ----------------------------------------------------------------------\n");
        System.out.printf("%48s","Array final");

        /*Second array table*/
    }
}

