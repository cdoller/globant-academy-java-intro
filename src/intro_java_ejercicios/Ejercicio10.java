/*
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */

package intro_java_ejercicios;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int limite, suma=0;
        
        do{
            System.out.println("Ingrese el limite positivo");
            limite = leer.nextInt(); 
        }while(limite<0);
        
        System.out.println("Ingrese numeros hasta superar el limite:");
        while(true){
            suma += leer.nextInt();
            System.out.print(" --> La suma es " + suma);
            if(suma>limite){
                System.out.println("");
                System.out.println("La suma ha superado el limite, FIN.");
                break;
            }
            else{
                System.out.println(" , puede seguir ingresando numeros...");
            }
        }
        
    }
}
