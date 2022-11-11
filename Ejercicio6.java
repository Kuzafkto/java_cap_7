/*
 *Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array.
*
*
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese 15 números en el array: ");
        int n[]=new int[15];
        int aux;
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
        }
        aux=n[14];
        for(int i=n.length-2;i>=0;i--){
            n[i+1]=n[i];
        }
        n[0]=aux;
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");;
        }
        sc.close();
    }
}
/*
* Second way:
*
*
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese 15 números en el array: ");
        int n[]=new int[15];
        int aux;
            for(int i=0;i<n.length;i++){
                if(i==n.length-1){
                    n[0]=sc.nextInt();
                }else{
                    n[i+1]=sc.nextInt();
                }

            }
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");;
        }
        sc.close();
    }
}
*
* ---------------------------------------------
* Third way by Javier Miguel Martin Gallardo:
*
* import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] num = new int [15];

        for(int i = 0; i <15 ; i++){
            System.out.print("Dime un número para el array: ");
            num [i] = sc.nextInt();
        }

        System.out.println(num[14]);
        for(int i = 0; i <14 ; i++){ //Para leer los números siguientes y hacer que salgan en ese orden
            System.out.println(num[i]);
        }
        sc.close();
    }
}
* */
