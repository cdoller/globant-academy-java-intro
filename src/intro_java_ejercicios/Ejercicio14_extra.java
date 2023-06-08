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
        int[] families = new int[input.nextInt()];
        for(int i=0; i<families.length; i++){
            System.out.println("Ingrese la cantidad de hijos de la familia nro: " + (i+1));
            families[i] = input.nextInt();
        }
    }
    
}
