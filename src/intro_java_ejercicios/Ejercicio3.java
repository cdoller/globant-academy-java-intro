/*
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
 * en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package intro_java_ejercicios;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        String frase;
        frase = leer.nextLine();
        
        System.out.println("Frase en MAYUSCULAS:");
        System.out.println(frase.toUpperCase());
        System.out.println("");
        System.out.println("Frase en minusculas:");
        System.out.println(frase.toLowerCase());
    }
}
