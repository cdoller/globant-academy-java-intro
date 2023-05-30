/*
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
 * doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package intro_java_ejercicios;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        float num, doble, triple;
        double raizCuadrada;
        num = leer.nextFloat();
        doble = 2 * num;
        triple = 3 * num;
        raizCuadrada = Math.sqrt(num);
        System.out.println("El doble: " + doble);
        System.out.println("El triple: " + triple);
        System.out.println("La raiz cuadrada: " + raizCuadrada);
    }
}
