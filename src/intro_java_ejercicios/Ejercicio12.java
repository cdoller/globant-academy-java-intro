/*
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */

package intro_java_ejercicios;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args){
        String FDE = "&&&&&", input;
        int secuenciasCorrectas=0, secuenciasIncorrectas=0;
        Scanner leer = new Scanner(System.in);
        
        while(true){
            System.out.print("Ingrese una cadena de caracteres: ");
            input = leer.nextLine();
            if(input.equals(FDE)){
                System.out.println("Fin de linea");
                break;
            }else if(isValidInput(input)){
                System.out.println("Secuencia Correcta");
                secuenciasCorrectas++;
            }else{
                System.out.println("Secuencia Invalida");
                secuenciasIncorrectas++;
            }
        }
        System.out.println("Numero de secuencias correctas: " + secuenciasCorrectas);
        System.out.println("Numero de secuencias incorrectas: " + secuenciasIncorrectas);
    }
    
    private static boolean isValidInput(String input){
        return input.matches("X.{3}O"); // "el .{n} indica que los proximos 3 caracteres pueden ser cualquiera"
    }
}
