/*
 * EJERCICIO 11
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.

a e i o u
@ # $ % *

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
package intro_java_ejercicios;

import java.util.Scanner;

public class Ejercicio11_ejemplos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String frase = leer.nextLine();
        while(!isPhraseValid(frase)){
            System.out.println("Tu frase no termina en .");
            System.out.println("Vuelve a ingresar la frase por favor");
            frase = leer.nextLine();
        }
        System.out.println(codificatePhrase(frase));
    }
    
    private static String codificatePhrase(String phrase) {
        return phrase.replace("a","@").replace("e","#").replace("i","$").replace("o","%").replace("u", "*");
    }
    
    private static boolean isPhraseValid(String input){
        return input.matches(".*\\."); 
        // el "." indica cualquier caracter, 
        // el "*" indica que no importa la cantidad, 
        // la "\\" permite salir del primer "."
        // el ultimo "." indica que debe terminar en "."
    }
}
