/*
 * Define un array de números enteros de 3 filas por 6 columnas con nombre num
y asigna los valores según la siguiente tabla. Muestra el contenido de todos
los elementos del array dispuestos en forma de tabla como se muestra en la
figura.

 *@author KuzaFkto
 */
package Bidimensionales;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[][] n =new int[3][6];
        n[0][0]=0;
        n[0][1]=30;
        n[0][2]=2;
        n[0][5]=0;
        n[1][0]=0;
        n[1][4]=0;
        n[2][2]=-2;
        n[2][3]=9;
        n[2][5]=11;
        System.out.print("\nÍndice: ");

        System.out.print("    0    1    2    3    4    5   \n");
        System.out.print("        --------------------------------\n");
        for (int i=0;i<3;i++){
            System.out.printf("%8s%2s","Fila"+i+" :","|",i);
            for (int j=0;j<6;j++){
                System.out.printf(" %2d |",n[i][j]);
            }
            System.out.println();
            System.out.print("        --------------------------------\n");

        }
        System.out.printf("%30s","Array inicial");
    }
}
