/*
 *
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el número total de nombres de reyes: ");
        int amount=sc.nextInt();
        String[] kings = new String[amount];
        System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO.");
        int counter;
        for(int i=0;i<kings.length;i++){
            kings[i]=sc.next();
            counter=0;
            for (int j=0; j<=i;j++){
                if(kings[j].equals(kings[i])|| kings[j].equals(kings[i]+" "+(counter+1))){
                    counter++;
                }
            }
            if (counter!=0)
                kings[i]+=" "+counter;
        }
        for(String k:kings){
            System.out.println(k+"º");
        }
        sc.close();
    }
}
