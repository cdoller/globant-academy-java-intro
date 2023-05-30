/*
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
 * pantalla.
 */
package intro_java_ejercicios;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        String nombre;
        
        nombre = leer.nextLine();
        System.out.println("El nombre ingresado es: " + nombre);
    }
}
