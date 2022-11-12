/*
 *Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array. El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
necesario.
*
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        int n[]=new int [20];
        int counter=0;
        int oddsarray[]=new int[20];
        for(int i=0; i<n.length;i++){
            n[i]=(int)(Math.random()*101);
            if(n[i]%2==0){
                n[counter]=n[i];
                counter++;
            }else{
                oddsarray[i]=n[i];
            }
        }
        for(int i=0;i<oddsarray.length;i++){
            if(oddsarray[i]!=0){
                n[counter]=oddsarray[i];
                counter++;
            }
        }
        for(int i =0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
    }
}
