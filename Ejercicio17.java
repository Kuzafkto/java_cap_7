/*
 * Escribe un programa que muestre por pantalla un array de 10 números enteros
generados al azar entre 0 y 100. A continuación, el programa debe pedir un
número al usuario. Se debe comprobar que el número introducido por teclado
se encuentra dentro del array, en caso contrario se mostrará un mensaje por
pantalla y se volverá a pedir un número; así hasta que el usuario introduzca uno
correctamente. A continuación, el programa rotará el array hacia la derecha
las veces que haga falta hasta que el número introducido quede situado en la
posición 0 del array. Por último, se mostrará el array rotado por pantalla.
*
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []n=new int [10];
        int aux;
        for(int i=0; i<n.length;i++){
            n[i]=(int)(Math.random()*101);
            System.out.print(n[i]+" ");
        }
        System.out.print("\nIngrese un número: ");
        int choice=sc.nextInt();
        while(choice<0||choice>100){
            System.out.print("El número ingresado debe estar entre 0 y 100, vuelva a ingresarlo: ");
            choice=sc.nextInt();
        }
            for(int i=0;i<n.length;i++){
                if(n[i]==choice){
                    choice=n[i-1];
                    for (int x=n.length-1;n[n.length-1]!=choice;x--){
                        aux=n[n.length-1];
                        for(int z=n.length-1;z>0;z--){
                            n[z]=n[z-1];
                        }
                        n[0]=aux;
                    }
                    choice=-1;
                } else if (i==n.length-1&&choice!=-1) {
                    System.out.print("El número ingresado no se encuentra en el array, por favor ingresa otro número: ");
                     choice=sc.nextInt();
                    while(choice<0||choice>100){
                        System.out.print("El número ingresado debe estar entre 0 y 100, vuelva a ingresarlo: ");
                        choice=sc.nextInt();
                    }
                    i=0;
                }
            }
            for(int j: n){
                System.out.print(j+" ");
            }


        sc.close();
    }
}
