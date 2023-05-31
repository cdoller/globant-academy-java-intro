/*
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package intro_java_ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la dimension del cuadrado: ");
        int limite = leer.nextInt();
        for (int i = 1; i <= limite; i++) {
            for (int j = 1; j <= limite; j++) {
                if(i == 1 || i == limite){
                    System.out.print("* ");
                }else if(j == 1 || j == limite){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
