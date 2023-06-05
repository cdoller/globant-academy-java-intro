/*
 * Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
 */

package intro_java_ejercicios;
import static intro_java_ejercicios.Ejercicio18.printMatrix;

public class Ejercicio21 {
    public static void main(String[] args){
        int[][] matrixM = new int[10][10];
        int[][] matrixP = new int[2][2];        
        int intentos = 0 , max = 20, min = 10; 
        do{
            loadMatrix(matrixM, max, min);
            loadMatrix(matrixP, max, min);
            intentos++;
        }while(!findMatrixInMatrix(matrixM, matrixP));
        
        printMatrix(matrixM);
        System.out.println("");
        printMatrix(matrixP);
        System.out.println("Encontramos la matriz P en M, luego de " + intentos + " intentos");
    }
    
    public static void loadMatrix(int[][] matrix, int max, int min) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() *(max - min + 1) + min);
            }
        }
    }
    
    public static boolean findMatrixInMatrix(int[][] matrixM, int[][] matrixP){
        for(int i=0; i < (matrixM.length - matrixP.length + 1); i++){
            for(int j=0; j < (matrixM[0].length - matrixP[0].length + 1); j++){
                if(matrixM[i][j] == matrixP[0][0]){
                    if(verifyMatrix(matrixM, matrixP, i, j)){
                        System.out.println("Las coordenadas son: " + i + "/" + j);
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public static boolean verifyMatrix(int[][] matrixM, int[][] matrixP, int fila, int columna){
        for(int i=0; i < matrixP.length; i++){
            for(int j=0; j < matrixP[0].length; j++){
                if(matrixM[fila+i][columna+j] != matrixP[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
