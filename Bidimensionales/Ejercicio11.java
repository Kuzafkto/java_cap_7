/*
 * Realiza un programa que muestre por pantalla un array de 10 filas por 10
columnas relleno con números aleatorios entre 200 y 300. A continuación, el
programa debe mostrar los números de la diagonal que va desde la esquina
superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo
y la media de los números que hay en esa diagonal.
*
 *@author KuzaFkto
 */
package Bidimensionales;

public class Ejercicio11 {
    public static void main(String[] args) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int total=0;
        int[][] n=new int[10][10];
        for (int i=0; i<n.length;i++){
            for(int j=0;j<n[i].length;j++){
                n[i][j]=200+(int)(Math.random()*101);
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("\n");
        for (int i = 0; i<n.length;i++){
            for (int j=0;j<n[i].length;j++){
                if (j == i) {
                    System.out.print(n[i][j]+" \n");
                    total+=n[i][j];
                    if(n[i][j]<min){
                        min=n[i][j];
                    }
                    if(n[i][j]>max){
                        max=n[i][j];
                    }
                }
            }
        }
        System.out.printf("El número mas grande es el %d , el mas grande es el %d y la media es %.2f",max,min,(float)total/n.length);
    }
}
