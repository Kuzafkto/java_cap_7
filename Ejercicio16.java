/*
 *Escribe un programa que rellene un array de 20 elementos con números enteros
aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el
programa mostrará el array y preguntará si el usuario quiere resaltar los
múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el array
escribiendo los números que se quieren resaltar entre corchetes.
Ejemplo:
159 204 20 250 178 90 353 32 229 357 224 54 260 310 140 249 335 326 223 13
¿Qué números quiere resaltar? (1 – los múltiplos de 5, 2 – los múltiplos de 7): 1
159 204 [20] [250] 178 [90] 353 32 229 357 224 54 [260] [310] [140] 249 [335] 326 223 13

 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n= new int [20];
        for(int i=0; i<n.length;i++){
            n[i]=(int)(Math.random()*401);
            System.out.print(n[i]+" ");
        }
        System.out.print("\n¿Que números quiere resaltar? (1- los múltiplos de 5, 2- los múltiplos de 7): ");
        int choice=sc.nextInt();
        while(choice!=1&&choice!=2){
            System.out.print("La opción elegida es incorrecta, por favor, vuelva a ingresar la opción: ");
            choice=sc.nextInt();
        }
        if(choice==1){
            for (int j : n) {
                if (j % 5 == 0)
                    System.out.print("[" + j + "] ");
                else
                    System.out.print(j + " ");
            }
        }else{
            for (int j : n) {
                if (j % 7 == 0)
                    System.out.print("[" + j + "] ");
                else
                    System.out.print(j + " ");
            }
        }

        sc.close();
    }
}
