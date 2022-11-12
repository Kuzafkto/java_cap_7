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


import java.util.Arrays;

public class Ejercicio11 {
    public static void main(String[] args) {
        int[] n =new int [10];
        int counter=0;
        boolean prime=true;
        int[] nonprimes =new int[10];
        Arrays.fill(nonprimes, -1);
        for(int i=0; i<n.length;i++){
            n[i]=(int)(Math.random()*101);
        }
        /*First array table*/
        System.out.print("Índice: ");

        for(int i=0;i<n.length;i++){
            System.out.printf("%-3s%d%-3s"," ",i," ");
        }
        System.out.print("\n ");
        System.out.print("       ");
        for(int i=0;i<n.length;i++){
            System.out.print("-------");
        }
        System.out.print("\n ");
        System.out.printf("%6s%2s","Valor:","|");
        for (int j : n) {
            System.out.printf("%2s%d%3s", " ", j, " |");
        }
        System.out.print("\n ");
        System.out.print("       ");
        for(int i=0;i<n.length;i++){
            System.out.print("-------");
        }

        System.out.printf("\n%48s","Array inicial");
        System.out.print("\n \n");

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

        for(int i=0;i<n.length;i++){
            System.out.printf("%-3s%d%-3s"," ",i," ");
        }
        System.out.print("\n ");
        System.out.print("       ");
        for(int i=0;i<n.length;i++){
            System.out.print("-------");
        }
        System.out.print("\n ");
        System.out.printf("%6s%2s","Valor:","|");
        for (int j : n) {
            System.out.printf("%2s%d%3s", " ", j, " |");
        }
        System.out.print("\n ");
        System.out.print("       ");
        for(int i=0;i<n.length;i++){
            System.out.print("-------");
        }

        System.out.printf("\n%48s","Array final");
        System.out.print("\n \n");

        /*Second array table*/
    }
}

