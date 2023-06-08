/*
 * Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */

package intro_java_ejercicios;
import java.util.Scanner;

public class Ejercicio13_extra {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la altura de la escalera de numeros: ");
        int max = input.nextInt();
        for(int i=1; i<=max; i++){
            System.out.println(printLineOfNumbers(i));
        }
    }
    
    public static String printLineOfNumbers(int max){
        String lineOfNumbers = "";
        for(int i=1; i<=max; i++){
            lineOfNumbers += i;
        }
        return lineOfNumbers;
    }
}
