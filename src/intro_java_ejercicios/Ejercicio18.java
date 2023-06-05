/*
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 */
package intro_java_ejercicios;

public class Ejercicio18 {

    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        loadMatrix(matrix, 9, 1);
        printMatrix(matrix);
        System.out.println("");
        printTransposeMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] >= 0) {
                    System.out.print(" ");
                }
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    public static void loadMatrix(int[][] matrix, int max, int min) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * (max - min + 1) + min);
            }
        }
    }

    public static void printTransposeMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[j][i] >= 0) {
                    System.out.print(" ");
                }
                System.out.print(matrix[j][i] + "  ");
            }
            System.out.println("");
        }
    }
}
