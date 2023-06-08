/*
 * Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */

package intro_java_ejercicios;
import java.util.Scanner;

public class Ejercicio10_extra {
    public static void main(String[] args){
        int secretNumber = calculateMultiplication(),chosenNumber = 0, intentos=0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Adivine el num secreto: ");
            chosenNumber = input.nextInt();
            intentos++;
        }while(!guessNumber(secretNumber, chosenNumber));
        System.out.println("Adivinaste en " + intentos + " intentos");
    }
    
    public static int calculateMultiplication(){
        return ((int)(Math.random()*(10-1+1)+1))*((int)(Math.random()*(10-1+1)+1));
    }
    
    public static boolean guessNumber(int secretNumber, int chosenNumber){
        if(secretNumber == chosenNumber){
            System.out.println("Adivinaste el numero ! el numero era: " + secretNumber);
            return true;
        }else{
            if(secretNumber < chosenNumber){
                System.out.println("El num secreto es mas pequenio");
                return false;
            }else{
                System.out.println("El num secreto es mas alto");
                return false;
            }
        }
    }
}
