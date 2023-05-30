/*
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
 * Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package intro_java_ejercicios;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        float gradosCentigrados, gradosFahrenheit;
        System.out.print("Ingrese los grados centigrados: ");
        gradosCentigrados = leer.nextFloat();
        gradosFahrenheit = 32 + (9 * gradosCentigrados / 5);
        System.out.println(gradosCentigrados + "C = " + gradosFahrenheit + "F");
    }
}
