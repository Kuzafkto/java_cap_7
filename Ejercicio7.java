/*
 *Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces por
teclado dos valores y a continuación cambiará todas las ocurrencias del primer
valor por el segundo en la lista generada anteriormente. Los números que se
han cambiado deben aparecer entrecomillados.
*
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[]=new int[100];

        for (int i=0;i<n.length;i++){
            n[i]=(int)(Math.random()*21);
            System.out.print(n[i]+" ");
        }
        System.out.println("");
        System.out.print("Ingrese el primer valor: ");
        int value1=sc.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        int value2=sc.nextInt();
        for (int i=0; i<n.length; i++){
            if (n[i]==value1) {
                System.out.print("\"" + value2 + "\" ");
            }else{
                System.out.print(n[i]+" ");
            }
        }
        sc.close();
    }
}
