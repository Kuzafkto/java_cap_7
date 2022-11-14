/*
 *Un restaurante nos ha encargado una aplicación para colocar a los clientes en
sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
(mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
el programa no está preparado para colocar a grupos mayores a 4, por tanto, si
un cliente dice por ejemplo que son un grupo de 6, el programa dará el mensaje
“Lo siento, no admitimos grupos de 6, haga grupos de 4 personas
como máximo e intente de nuevo”. Para el grupo que llega, se busca
siempre la primera mesa libre (con 0 personas). Si no quedan mesas libres, se
busca donde haya un hueco para todo el grupo, por ejemplo si el grupo es de
dos personas, se podrá colocar donde haya una o dos personas. Inicialmente,
las mesas se cargan con valores aleatorios entre 0 y 4. Cada vez que se sientan
nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se
pueden romper aunque haya huecos sueltos suficientes. El funcionamiento del
programa se ilustra a continuación:

*Ejemplo:
┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐
│Mesa nº │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │ 10 │
├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤
│Ocupación│ 3 │ 2 │ 0 │ 2 │ 4 │ 1 │ 0 │ 2 │ 1 │ 1 │
└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘
¿Cuántos son? (Introduzca -1 para salir del programa): 2
Por favor, siéntense en la mesa número 3.
┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐
│Mesa nº │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │ 10 │
├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤
│Ocupación│ 3 │ 2 │ 2 │ 2 │ 4 │ 1 │ 0 │ 2 │ 1 │ 1 │
└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘
¿Cuántos son? (Introduzca -1 para salir del programa): 4
Por favor, siéntense en la mesa número 7.
┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐
│Mesa nº │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │ 10 │
├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤
│Ocupación│ 3 │ 2 │ 2 │ 2 │ 4 │ 1 │ 4 │ 2 │ 1 │ 1 │
└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘
¿Cuántos son? (Introduzca -1 para salir del programa): 3
Tendrán que compartir mesa. Por favor, siéntense en la mesa número 6.
┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐
│Mesa nº │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │ 10 │
├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤
│Ocupación│ 3 │ 2 │ 2 │ 2 │ 4 │ 4 │ 4 │ 2 │ 1 │ 1 │
└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘
¿Cuántos son? (Introduzca -1 para salir del programa): 4
Lo siento, en estos momentos no queda sitio.
┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐
│Mesa nº │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │ 10 │
├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤
│Ocupación│ 3 │ 2 │ 2 │ 2 │ 4 │ 4 │ 4 │ 2 │ 1 │ 1 │
└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘
¿Cuántos son? (Introduzca -1 para salir del programa): -1
Gracias. Hasta pronto.
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice=0;
        int [] tables=new int [10];
        for(int i=0;i<tables.length;i++){
            tables[i]=(int)(Math.random()*5);
        }
        while (choice>=0){
                            /*Showing tables*/
            System.out.print("\n           ----------------------------------------------------------------------");

            System.out.printf("\n%12s%6s%7s%7s%7s%7s%7s%7s%7s%7s%7s\n","Mesa Nº: |","0  |","1  |","2  |","3  |","4  |","5  |","6  |","7  |","8  |","9  |");
            System.out.print("           ----------------------------------------------------------------------\n");
            System.out.printf("%-10s%2s","Ocupación:","|");
            for (int j : tables) {
                if(j<10){
                    System.out.printf("  %1d  | ",j);
                }
            }
            System.out.print("\n           ----------------------------------------------------------------------\n\n");
                            /*Showing tables*/
            System.out.print("\n¿Cuántos son? (Introduzca -1 para salir del programa): ");
            choice=sc.nextInt();
            if(choice==-1){
                System.out.print("\nGracias. Hasta pronto\n");
                break;
            }
            while(choice>4||choice<-1){
                System.out.printf("Lo siento, no admitimos grupos de %d, haga grupos de 4 personas" +
                        "como máximo e intente de nuevo: ",choice);
                choice=sc.nextInt();
            }
            for(int i=0;i<tables.length;i++){
                if(tables[i]==0){
                    System.out.printf("Por favor, siéntense en la mesa número %d\n\n",i);
                    tables[i]=choice;
                    break;
                }if(i==tables.length-1){
                    for(int x=0;x<tables.length;x++){
                        if(tables[x]+choice<=4){
                            System.out.printf("Tendrán que compartir mesa. Por favor, siéntense en la mesa número %d\n\n",x);
                            tables[x]+=choice;
                            break;
                        }else if(x==tables.length-1){
                            System.out.print("Lo siento, en estos momentos no queda sitio.\n\n");
                        }
                    }
                }
            }

        }
        sc.close();
    }
}
