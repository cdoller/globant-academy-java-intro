/*
 * Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
 */

package intro_java_ejercicios;

public class Ejercicio22_extra {
    public static void main(String[] args){
        int suma=0, N=4, M=4;
        int[][] matriz = new int[N][M];
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                matriz[i][j] = (int)(Math.random()*9);
                suma += matriz[i][j];
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("La suma de los valores de la matriz es: " + suma);
    }
}
