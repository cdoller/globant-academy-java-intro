/*
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */

package intro_java_ejercicios;
import java.util.Scanner;

public class Ejercicio1_extra {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el tiempo en minutos: ");
        int totalMinutes = input.nextInt();
        int minutesPerHour = 60;
        int hoursPerDay = 24;
        
        int days = totalMinutes / (hoursPerDay * minutesPerHour);
        int hours = totalMinutes % (hoursPerDay * minutesPerHour) / minutesPerHour;
        int minutes = totalMinutes % 60;
        System.out.println("El equivalente es: " + days + " dia(s), " + hours + " horas, " + minutes + " minuto(s).");
    }
}
