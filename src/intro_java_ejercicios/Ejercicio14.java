/*
 * Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */

package intro_java_ejercicios;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de Euros que desea convertir: ");
        double euros = input.nextDouble();
        changeMoney(euros, "libras");
        changeMoney(euros, "dolares");
        changeMoney(euros, "yenes");
        changeMoney(euros, "pesos");
    }
    
    private static void changeMoney(double cantEuros, String moneda){
        switch(moneda){
            case "libras":
                System.out.println(cantEuros + " Euros = " + (cantEuros*0.86) + " Libras");
                break;
            case "dolares":
                System.out.println(cantEuros + " Euros = " + (cantEuros*1.28611) + " Dolares");
                break;
            case "yenes":
                System.out.println(cantEuros + " Euros = " + (cantEuros*129.852) + " Yenes");
                break;
            default:
                System.out.println("La moneda no es valida");
                break;
        }
    }
}
