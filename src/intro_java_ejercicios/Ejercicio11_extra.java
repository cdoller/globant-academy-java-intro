/*
 * Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
 */

package intro_java_ejercicios;
import java.util.Scanner;

public class Ejercicio11_extra {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("El numero ingresado tiene: " + calculateDigits(num) + " digitos");
    }
    
    public static int calculateDigits(int num){
        int digits=1;
        while(num>=10){
            num /= 10;
            digits++;
        }
        return digits;
    }
}
