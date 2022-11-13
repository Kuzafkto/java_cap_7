/*
 *Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
“inicial” y “final”. Se debe comprobar que inicial es menor que final y que ambos
números están entre 0 y 9. El programa deberá colocar el número de la posición
inicial en la posición final, rotando el resto de números para que no se pierda
ninguno. Al final se debe mostrar el array resultante.
Por ejemplo, para inicial = 3 y final = 7:
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]n=new int[10];
        int aux=0;
        for(int i=0;i<n.length;i++){
            System.out.print("Ingrese un número dentro del array: ");
            n[i]=sc.nextInt();
        }
        /*First array table*/
        System.out.print("\nÍndice: ");

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

        System.out.print("\nElija la posición inicial: ");
        int inicial=sc.nextInt();
        System.out.print("Elija la posición final: ");
        int finalp=sc.nextInt();
        while(inicial>finalp){
            System.out.print("Inicial debe ser menor que final, por favor vuelva a ingresar inicial y final: ");
            System.out.print("Inicial: ");
            inicial=sc.nextInt();
            System.out.print("Final: ");
            finalp=sc.nextInt();
        }

        aux=n[inicial];

        for(int i=inicial;i>0;i--){
            n[i]=n[i-1];
        }
        n[0]=n[n.length-1];
        for(int i=n.length-1;i>finalp;i--){
            n[i]=n[i-1];
        }
        n[finalp]=aux;

        /*Second array table*/
        System.out.print("\nÍndice: ");

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
        System.out.printf("%50s","Array final\n");

        /*Second array table*/



        sc.close();
    }
}
