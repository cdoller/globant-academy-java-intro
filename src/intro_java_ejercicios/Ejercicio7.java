/*
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
 * pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
 * la función equals() en Java.
 */

package intro_java_ejercicios;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args){
        String fraseSecreta = "eureka";
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.print("Ingrese la frase secreta: ");
        frase = leer.nextLine();

        if(frase.equals(fraseSecreta)){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
}
