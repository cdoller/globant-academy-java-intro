/*
 * Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */

package intro_java_ejercicios;
import java.util.Scanner;

public class Ejercicio8_extra {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num, cantPares=0, cantImpares=0, cant=0;
        
        do{
            System.out.print("Ingrese un numero: ");
            num = input.nextInt();
            cant++;
            if(num>0){
                if(num%2 == 0){
                    cantPares++;
                }else{
                    cantImpares++;
                }
            }
        }while (num%5 != 0);
        
        System.out.println("Cant pares: " + cantPares);
        System.out.println("Cant impares: " + cantImpares);
        System.out.println("Cant numeros ingresados: " + cant);
    }
}
