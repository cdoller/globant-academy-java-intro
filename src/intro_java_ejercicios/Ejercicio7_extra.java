/*
 * Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */

package intro_java_ejercicios;
import java.util.Scanner;

public class Ejercicio7_extra {
    public static void main(String[] args){
        int[] nums = loadNumbers(true);
        System.out.println("Maximo: " + findMax(nums));
        System.out.println("Minimo: " + findMin(nums));
        System.out.println("Promedio: " + String.format("%.3f",calculateAverage(nums)));
    }
    
    public static int[] loadNumbers(boolean doWhile){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cant de numeros: ");
        int[] numeros = new int[inputGreaterThanZero()];
        int count = 0;
        if(doWhile){ // doWhile = true ==> usamos un doWhile
            do{
                System.out.print((count+1) + ")");
                numeros[count] = input.nextInt();
                count++;
            }while(count<numeros.length);
        }else{ // doWhile = false ==> usamos un while
            while(count<numeros.length){
                numeros[count] = input.nextInt();
                count++;
            }
        }
        return numeros;
    }
    
    public static int inputGreaterThanZero(){
        int dim = 0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Recuerde que el num > 0: ");
            dim = input.nextInt();
        }while(dim<1);
        return dim;
    }
    
    public static int findMax(int[] nums){
        int max = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
    
    public static int findMin(int[] nums){
    int min = nums[0];
    for(int i=1; i<nums.length; i++){
        if(nums[i] < min){
            min = nums[i];
        }
    }
    return min;
    }
    
    public static double calculateAverage(int[] nums){
        double sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        return sum / nums.length;
    }
}
