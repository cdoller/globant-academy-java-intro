/*
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */

package intro_java_ejercicios;
import java.util.Scanner;
import static intro_java_ejercicios.Ejercicio18.printMatrix;

public class Ejercicio20 {
    public static void main(String[] args){
        int matrix[][] = loadMatrix(3);
        printMatrix(matrix);
        System.out.println("La matriz es Magica?: " + isMagic(calculateSums(matrix)));
    }
    
    public static boolean isNumberValid(int numero){
        if(numero>=1 && numero<=9){
            return true;
        }else{
            System.out.println("El numero ingresado NO esta entre 1 y 9, ingrese nuevamente.");
            return false;
        }
    }
    
    public static int[][] loadMatrix(int dim){
        int matriz[][] = new int[dim][dim], numero = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Recuerde ingresar numeros entre 1 y 9:");
        for(int i=0; i<dim; i++){
            for(int j=0; j<dim; j++){
                do{
                    System.out.print("Posicion[" + i + "-" + j + "]: ");
                    numero = input.nextInt();
                }while (!isNumberValid(numero));
                matriz[i][j] = numero;
            }
        }
        return matriz;
    }
    
    public static int[] calculateSums(int[][] matriz){
        int[] sumas = new int[(matriz.length*2) + 2];
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                sumas[i] += matriz[i][j];
                sumas[i+matriz.length] += matriz[j][i];
            }
            sumas[sumas.length-2] += matriz[i][i];
            sumas[sumas.length-1] += matriz[i][matriz.length-1-i];
        }
        return sumas;
    }
    
    public static boolean isMagic(int[] vectorSumas){     
        for(int i=1; i<vectorSumas.length; i++){
            if(vectorSumas[0] != vectorSumas[i]){
                return false;
            }
        }
        return true;
    }
    
}
