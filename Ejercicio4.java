/*
 * Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado
y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array
cuadrado se deben almacenar los cuadrados de los valores que hay en el array
numero. En el array cubo se deben almacenar los cubos de los valores que hay en
numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres
columnas.
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero[]=new int[20];
        int cuadrado[]=new int[20];
        int cubo[]=new int [20];
        int generated;
        for(int i=0;i<numero.length;i++){
            generated=(int)(Math.random()*101);
            numero[i]=generated;
            cuadrado[i]=(int)Math.pow(generated,2);
            cubo[i]=(int)Math.pow(generated,3);
        }
        System.out.printf("%-5s %-6s %-10s %-7s %-10s %-4s"," ","numero"," ","cuadrado"," ","cubo");
        System.out.print("\n------------------------------------------------------------\n");
        for(int i=0;i<numero.length;i++){
            System.out.printf("%-5s %d %-15s %d %-15s %d\n"," ",numero[i]," ",cuadrado[i]," ", cubo[i]);
        }
    }



}
