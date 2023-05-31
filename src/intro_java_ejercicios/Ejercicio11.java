/*
 * Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
package intro_java_ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, eleccion;

        System.out.print("Ingrese el primer numero: ");
        num1 = leer.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = leer.nextInt();
        while (num1 < 1 || num2 < 1) {
            System.out.println("Alguno de los numeros no es positivo. Debe ingresarlos nuevamente");
            System.out.print("Ingrese el primer numero: ");
            num1 = leer.nextInt();
            System.out.print("Ingrese el segundo numero: ");
            num2 = leer.nextInt();
        }
        do{
            System.out.println("--------------");
            System.out.println("MENU:");
            System.out.println("1) Sumar");
            System.out.println("2) Restar");
            System.out.println("3) Multiplicar");
            System.out.println("4) Dividir");
            System.out.println("5) Salir");
            switch(eleccion = leer.nextInt()){
                case 1:
                    System.out.println(num1 + "+" + num2 + " = " + (num1+num2));
                    break;
                case 2:
                    System.out.println(num1 + "-" + num2 + " = " + (num1-num2));
                    break;
                case 3:
                    System.out.println(num1 + "*" + num2 + " = " + (num1*num2));
                    break;
                case 4:
                    System.out.println(num1 + "/" + num2 + " = " + (num1/num2) + " y resto " + (num1%num2)); //division con truncamiento
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    leer.nextLine();
                    if(leer.nextLine().equals("S")){
                        System.out.println("Chau!");
                        break;
                    }else{
                        eleccion = 6;
                        break;
                    }
                default:
                    System.out.println("El numero ingresado no es una opcion valida.");
                    break;
            }
            System.out.println("--------------");
        }while(eleccion != 5);
    }
}
