/*
 * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */

package intro_java_ejercicios;
import java.util.Scanner;

public class Ejercicio12_extra {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el numero hasta el que desea contar: ");
        int max = input.nextInt(), number = 0;
        while(number <= max){
            System.out.println(printNumber(convertNumberToString(number))) ;
            number++;
        }
    }
    
    public static String convertNumberToString(int number){
        String numberString = "";
        if(number < 10){
            numberString = "00";
        }else if(number >= 10 && number<100){
            numberString = "0";
        }
        return numberString.concat(String.valueOf(number)).replace("3","E").replace("4", "#");
    }
    
    public static String printNumber(String numberString){
        String numberStringFormat = "";
        for(int i=0; i<numberString.length(); i++){
            if(i == numberString.length()-1){
                numberStringFormat += numberString.substring(i, i+1);
            }else{
                numberStringFormat += numberString.substring(i, i+1) + "-";
            }
        }
        return numberStringFormat;
    }
    
}
