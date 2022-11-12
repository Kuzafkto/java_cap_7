/*
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes
de un determinado año y que muestre a continuación un diagrama de barras
horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
de asteriscos o cualquier otro carácter.
*
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int degrees[]=new int[12];
        for (int i=0;i<degrees.length;i++){
            switch (i+1){
                case 1:
                    System.out.print("Ingrese la temperatura de Enero: ");
                    break;
                case 2:
                    System.out.print("Ingrese la temperatura de Febrero: ");
                    break;
                case 3:
                    System.out.print("Ingrese la temperatura de Marzo: ");
                    break;
                case 4 :
                    System.out.print("Ingrese la temperatura de Abril: ");
                    break;
                case 5:
                    System.out.print("Ingrese la temperatura de Mayo: ");
                    break;
                case 6:
                    System.out.print("Ingrese la temperatura de Junio: ");
                    break;
                case 7:
                    System.out.print("Ingrese la temperatura de Julio: ");
                    break;
                case 8:
                    System.out.print("Ingrese la temperatura de Agosto: ");
                    break;
                case 9 :
                    System.out.print("Ingrese la temperatura de Septiembre: ");
                    break;
                case 10:
                    System.out.print("Ingrese la temperatura de Octubre: ");
                break;
                case 11:
                    System.out.print("Ingrese la temperatura de Noviembre: ");
                    break;
                case 12:
                    System.out.print("Ingrese la temperatura de Diciembre: ");
                    break;
            }
            degrees[i]=sc.nextInt();
        }
        System.out.println("");
        for (int i=1; i<=degrees.length; i++){
            switch (i){
                case 1:
                    System.out.print("Enero: ");
                    break;
                case 2:
                    System.out.print("Febrero: ");
                    break;
                case 3:
                    System.out.print("Marzo: ");
                    break;
                case 4 :
                    System.out.print("Abril: ");
                    break;
                case 5:
                    System.out.print("Mayo: ");
                    break;
                case 6:
                    System.out.print("Junio: ");
                    break;
                case 7:
                    System.out.print("Julio: ");
                    break;
                case 8:
                    System.out.print("Agosto: ");
                    break;
                case 9 :
                    System.out.print("Septiembre: ");
                    break;
                case 10:
                    System.out.print("Octubre: ");
                    break;
                case 11:
                    System.out.print("Noviembre: ");
                    break;
                case 12:
                    System.out.print("Diciembre: ");
                    break;
            }
            for(int x=0;x<degrees[i-1];x++){
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}
