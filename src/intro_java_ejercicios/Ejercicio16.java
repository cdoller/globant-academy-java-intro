/*
 * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */

package intro_java_ejercicios;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args){
        int dim = (int)(Math.random()*(100))+1;
        int[] vector = new int[dim];
        
        for(int i=0; i<vector.length; i++){
            vector[i] = (int)(Math.random()*(99-10+1))+10; //entre 10 y 99
        }
        
        printVector(vector);
        
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.print("Ingrese el numero que desea buscar: ");
        int numero = input.nextInt();
        
        for(int i=0; i<vector.length; i++){
            if(vector[i] == numero){
                System.out.println("El numero fue encontrado en la posicion: " + i);
            }
        }
    }
    
    public static void printVector(int[] vector){
        System.out.println("------VECTOR------");
        for (int i=0; i<vector.length; i++){
            System.out.print(vector[i] + "  ");
            if((i+1)%10 == 0){
                System.out.println("");
            }
        }
        System.out.println("");
        System.out.println("------------------");
    }
}
