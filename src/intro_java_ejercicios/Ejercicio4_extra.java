/*
 * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */

package intro_java_ejercicios;
import java.util.Scanner;

public class Ejercicio4_extra {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num=0;
        do{
            System.out.println("Ingrese un numero entre 1 y 10");
            num = input.nextInt();
        }while(num<1 || num>10);
        
        System.out.println("Equivalente en romano: " + toRomanEquivalent(num));
        System.out.println("Equivalente en romano: " + toRomanEquivalent_v2(994));
    }
    
    public static String toRomanEquivalent(int num){
        switch(num){
            case 1 : return "I";
            case 2 : return "II";
            case 3 : return "III";
            case 4 : return "IV";
            case 5 : return "V";
            case 6 : return "VI";
            case 7 : return "VII";
            case 8 : return "VIII";
            case 9 : return "IX";
            case 10: return "X";
            default: return "Error";  
        }
    }
    
    public static String toRomanEquivalent_v2(int num){
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] decimalValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
        StringBuilder romanNumber = new StringBuilder();
        
        for (int i = 0; i < romanSymbols.length; i++) {
            while (num >= decimalValues[i]) {
                romanNumber.append(romanSymbols[i]);
                num -= decimalValues[i];
            }
        }
        
        return romanNumber.toString();
     }
}
