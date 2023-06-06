/*
 * Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */

package intro_java_ejercicios;
import java.util.Scanner;

public class Ejercicio5_extra {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el tipo de obra social: ");
        String membershipType = input.nextLine();
        while(!isMembershipTypeValid(membershipType)){
            System.out.print("El tipo tiene que ser A, B o C, vuelva a ingresar: ");
            membershipType = input.nextLine();
        }
        System.out.print("Ingrese el costo total del tratamiento: ");
        double treatmentCost = input.nextDouble();
        
        System.out.println("Con la obra social [" + membershipType + "], el costo total es: " + totalCost(membershipType, treatmentCost));
    }
    
    public static double totalCost(String membershipType, double treatmentCost){
        switch(membershipType){
            case "A": return treatmentCost * 0.5;
            case "B": return treatmentCost * 0.35;
            case "C": return treatmentCost;
            default: return 0;
        }
    }
    
    public static boolean isMembershipTypeValid(String membershipType){
        return membershipType.matches("[ABC]");
    }
}
