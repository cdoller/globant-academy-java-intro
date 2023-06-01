/*
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */

package intro_java_ejercicios;

import static intro_java_ejercicios.Ejercicio16.printVector;

public class Ejercicio17 {
    public static void main(String[] args){
    int dim = (int)(Math.random()*(100))+1;
        int[] vector = new int[dim];
        int[] nums = new int[5];
        
        for(int i=0; i<vector.length; i++){
            vector[i] = (int)(Math.random()*(99999-1+1))+1; //entre 10 y 99
        }
        
        printVector(vector);
        // manera 1
        for(int i=0; i<vector.length; i++){
            switch(String.valueOf(vector[i]).length()){
                case 1:
                    nums[0]++;
                    break;
                case 2:
                    nums[1]++;
                    break;
                case 3:
                    nums[2]++;
                    break;
                case 4:
                    nums[3]++;
                    break;
                case 5:
                    nums[4]++;
                    break;
                default:
                    System.out.println("RARO o.O, el numero es " + vector[i]);
            }
        }
        for(int i=0; i<nums.length; i++){
            System.out.println("Numeros con " + (i+1) + " digitos: " + nums[i]);
        }
        
        //manera 2:
        for(int i=0; i<5; i++){
            System.out.println("Numeros con " + (i+1) + " digitos: " + countNumbersWithDigitsX(vector, i+1));
        }
    }
    
    public static int countNumbersWithDigitsX(int[] matrix, int digits){
        int count=0;
        for(int i=0; i<matrix.length; i++){
            if(String.valueOf(matrix[i]).length() == digits){
                count++;
            }
        }
        return count;
    }
}
