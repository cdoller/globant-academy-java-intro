/*
 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */

package intro_java_ejercicios;
import java.util.Scanner;

public class Ejercicio3_extra {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una letra y se verificara si es una vocal:");
        if(isVowel(input.nextLine())){
            System.out.println("Es una vocal.");
        }else{
            System.out.println("NO es una vocal.");
        }
    }
    
    public static boolean isVowel(String letra){
        return letra.matches("[AaEeIiOoUu]");
    }
}
