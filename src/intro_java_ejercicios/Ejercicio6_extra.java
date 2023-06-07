/*
 * Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */

package intro_java_ejercicios;
import java.util.Scanner;

public class Ejercicio6_extra {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] personsHeights = generateRandomHeights(input.nextInt(), 210, 150);
//        for(int i=0; i<personsHeights.length; i++){
//            System.out.print(personsHeights[i] + " ");
//        }
        calculateAverage(personsHeights);
    }
    
    public static int[] generateRandomHeights(int count, int max, int min){
        int[] personsHeights = new int[count];
        for(int i=0; i<count; i++){
            personsHeights[i] = (int)(Math.random()*(max+1-min) + min);
        }
        return personsHeights;
    }
    
    public static void calculateAverage(int[] persons){
        int sumHigh=0, sumLow=0, cantHigh=0, cantLow=0;
        for(int i=0; i<persons.length; i++){
            if(persons[i]<160){
                sumLow += persons[i];
                cantLow++;
            }else{
                sumHigh += persons[i];
                cantHigh++;
            }
        }
        if(sumLow==0){
            System.out.println("El promedio de los <  1.60m = 0, xq no hay nadie menor a esa altura");
            System.out.println("El promedio de los >= 1.60m = " + (sumHigh / cantHigh));
        }else if(sumHigh==0){
            System.out.println("El promedio de los <  1.60m = " + (sumLow / cantLow));
            System.out.println("El promedio de los >= 1.60m = 0, xq no hay nadie mayor o igual a esa altura");
        }else{
            System.out.println("El promedio de los <  1.60m = " + (sumLow / cantLow));
            System.out.println("El promedio de los >= 1.60m = " + (sumHigh / cantHigh));
        }
        
    }
}
