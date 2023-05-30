/*
 * Crear un programa que dado un numero determine si es par o impar.
 */
package intro_java_ejercicios;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int num;
        
        num = leer.nextInt();
        if(num == 0){
            System.out.println("El numero ingresado es el cero");
        }else if(num%2 == 0){
            System.out.println("El numero ingresado es par");
        }else{
            System.out.println("El numero ingresado es impar");
        }
    }
}
