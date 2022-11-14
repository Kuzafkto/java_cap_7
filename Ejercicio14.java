/*
 * Escribe un programa que pida 8 palabras y las almacene en un array. A
continuación, las palabras correspondientes a colores se deben almacenar al
comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
auxiliares como quieras. Los colores que conoce el programa deben estar en
otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
blanco y morado.
*
 *@author KuzaFkto
 */
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String [] palabras = new String [8];
        String [] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
        String [] aux = new String[colores.length];
        int auxPos=0;
        int secPos=0;
        String [] aux2 = new String[colores.length];

        for(int i = 0; i<8 ;i++){
            System.out.print("Dime una palabra: ");
            palabras [i] = sc.next();
            for (int b = 0;b<8;b++){
                if(palabras[i].equals(colores[b])){
                    aux [auxPos] = colores[b];
                    auxPos++;
                    b=8;
                }else if(b==7 ){
                    aux2[secPos]=palabras[i];
                    secPos++;
                }
        }
        }
        System.out.printf("%50s","Array original:\n\n");

        System.out.print("      0         1         2         3         4         5         6         7\n");

        System.out.print("---------------------------------------------------------------------------------\n|");
        for (String j : palabras) {
            if(j.length()<10){
                System.out.printf(" %-7s |",j);
            }else{
                System.out.printf("%13s|",j);
            }
        }
        System.out.print("\n---------------------------------------------------------------------------------\n");

        for(int i=0;i<palabras.length;i++){
            palabras[i]=null;
        }
        for(int i = 0;i<palabras.length;i++){
            if (aux[i]!=null){
                palabras[i]=aux[i];
            }
        }
        int counter=0;
        for(int i = 0;i<8;i++){
            if (aux2[i]!=null){
                while(palabras[counter]!=null){
                    counter++;
                }
                palabras[counter]=aux2[i];
            }
        }
        System.out.printf("%50s","Array resultado:\n\n");

        System.out.print("      0         1         2         3         4         5         6         7\n");

        System.out.print("---------------------------------------------------------------------------------\n|");
        for (String j : palabras) {
            if(j.length()<10){
                System.out.printf(" %-7s |",j);
            }else{
                System.out.printf("%13s|",j);
            }
        }
        System.out.print("\n---------------------------------------------------------------------------------\n");

        sc.close();
        }
}