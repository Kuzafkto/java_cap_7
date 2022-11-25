/*
 * Modifica el programa anterior de tal forma que las sumas parciales y la suma
total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
que el ordenador se queda “pensando” antes de mostrar los números.

 *@author KuzaFkto
 */
package Bidimensionales;


public class Ejercicio4 {
    public static void main(String[] args) throws InterruptedException {
        int [][] n=new int[4][5];
        int total=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                n[i][j]=100+(int)(Math.random()*(1000-100));
                total+=n[i][j];
            }
        }
        System.out.print("\nÍndice: ");

        System.out.print("    0     1     2     3     4   \n");
        System.out.print("           -----------------------------\n");
        for (int i=0;i<4;i++){
            System.out.printf("%10s","");
            for (int j=0;j<5;j++){
                Thread.sleep(100+(int)(Math.random()*901));
                System.out.printf(" %3d |",n[i][j]);
            }
            Thread.sleep((int)(Math.random()*1501));

            System.out.printf("%8s","Fila "+i);
            System.out.println();
            System.out.print("           -----------------------------\n");

        }
        Thread.sleep(1000);
        System.out.print("           col0  col1  col2  col3  col4 |total = "+total+"|\n");


    }
}
