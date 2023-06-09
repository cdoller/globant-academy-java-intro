/*
 * Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
 */

package intro_java_ejercicios;
import java.util.Scanner;

public class Ejercicio14_extra {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Cuantas familias son? ");
        int[] families = new int[input.nextInt()];
        for(int i=0; i<families.length; i++){
            System.out.println("Ingrese la cantidad de hijos de la familia nro: " + (i+1));
            families[i] = input.nextInt();
            int sum = 0;
            for(int j=0; j<families[i]; j++){
                System.out.print("Ingrese la edad de su hijo nro " + (j+1) + ": ");
                sum += input.nextInt();
            }
            System.out.print("El promedio de edad de los hijos de la familia [" + (i+1) + "]: " + ((double)sum/families[i]));
            System.out.println("\n\n");
        }
    }
}
