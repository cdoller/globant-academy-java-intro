/*
 * Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */

package intro_java_ejercicios;

public class Ejercicio15 {
    public static void main(String[] args){
        int[] vector = new int[100];
        loadAndPrintVector(vector);
    }
    
    private static void loadAndPrintVector(int[] vector){
        for(int i=0; i<vector.length; i++){
            vector[i] = vector.length - i;
            System.out.println(vector[i]);
        }
    }
}
