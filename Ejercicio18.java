/*
 *Realiza un programa que genere 10 números enteros aleatorios entre 0 y 200
ambos incluidos y que los almacene en un array. A continuación, el programa
debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el
programa debe colocar de forma alterna y en orden los menores o iguales de
100 y los mayores de 100: primero menor, luego mayor, luego menor, luego
mayor… Cuando se acaben los menores o los mayores, se completará con los
números que queden.
*
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n= new int [10];
        int[]aux=new int[10];
        for (int i=0;i<n.length;i++){
            n[i]=(int)(Math.random()*201);
        }
        System.out.print("\nÍndice: ");

        System.out.print("   0      1      2      3      4      5      6      7      8      9   \n");

        System.out.print("        ----------------------------------------------------------------------\n");
        System.out.printf("%7s%2s","Valor:","|");
        for (int j : n) {
            System.out.printf(" %3d  |",j);
        }
        System.out.print("\n        ----------------------------------------------------------------------\n");
        System.out.printf("%50s","Array inicial\n\n");


        for(int i=0;i<n.length;i++){
            if(n[i]>100){
                aux[0]=n[i];
                n[i]=-1;
                break;
            }
        }
        for (int i=1; i<aux.length;i++){
            if (aux[i-1]>100){
                for(int x=0;x<n.length;x++){
                    if(n[x]<=100&&n[x]!=-1){
                        aux[i]=n[x];
                        n[x]=-1;
                        break;
                    }if(x==n.length-1){
                        for(int z=0; z<n.length;z++){
                            if (n[z]!=-1){
                                aux[i]=n[z];
                                n[z]=-1;
                                break;
                            }
                        }
                    }
                }
            } else if (aux[i-1]<100) {
                for(int x=0;x<n.length;x++){
                    if(n[x]>100){
                        aux[i]=n[x];
                        n[x]=-1;
                        break;
                    }if(x==n.length-1){
                        for(int z=0; z<n.length;z++){
                            if (n[z]!=-1){
                                aux[i]=n[z];
                                n[z]=-1;
                                break;
                            }
                        }
                    }
                }
            }
        }


        System.out.print("\nÍndice: ");

        System.out.print("   0      1      2      3      4      5      6      7      8      9   \n");

        System.out.print("        ----------------------------------------------------------------------\n");
        System.out.printf("%7s%2s","Valor:","|");
        for (int j : aux) {
            System.out.printf(" %3d  |",j);
        }
        System.out.print("\n        ----------------------------------------------------------------------\n");
        System.out.printf("%50s","Array final\n");

        sc.close();
    }

}
