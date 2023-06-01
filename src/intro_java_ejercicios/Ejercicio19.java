/*
 * Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package intro_java_ejercicios;

import static intro_java_ejercicios.Ejercicio18.loadMatrix;
import static intro_java_ejercicios.Ejercicio18.printMatrix;
import static intro_java_ejercicios.Ejercicio18.printTransposeMatrix;

public class Ejercicio19 {

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        do {
            loadMatrix(matrix);
        } while (!isAntiSymmetric(matrix));
        
        printMatrix(matrix);
        System.out.println("");
        printTransposeMatrix(matrix);
        System.out.println("La matriz es anti simetrica? " + isAntiSymmetric(matrix));
    }

    public static boolean isAntiSymmetric(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (-matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
