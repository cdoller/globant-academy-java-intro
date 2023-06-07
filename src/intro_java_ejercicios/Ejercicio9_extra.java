/*
 * Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. 
Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */

package intro_java_ejercicios;
import java.util.Scanner;
import static intro_java_ejercicios.Ejercicio7_extra.inputGreaterThanZero;
 

public class Ejercicio9_extra {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el dividendo: ");
        int dividendo = inputGreaterThanZero();
        System.out.print("Ingrese el divisor: ");
        int divisor = inputGreaterThanZero();
        
        calcularDivision(dividendo, divisor);
    }
    
    public static void calcularDivision(int dividendo, int divisor){
        int cuenta=0;
        System.out.print(dividendo + " / " + divisor + " = ");
        while(divisor<dividendo){
            dividendo = dividendo-divisor;
            cuenta++;
        }
        System.out.println(cuenta + ", resto: " + dividendo);
    }
}
