/*
 * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
 */

package intro_java_ejercicios;
import java.util.Scanner;

public class Ejercicio23_extra {
    public static void main(String[] args){
        String[][] sopaLetras = new String[20][20];
        int numberWords = 5;
        
        for(int i=0; i<numberWords; i++){
            ubicarPalabraPosicionAleatoria(readWord(), sopaLetras, (int)(Math.random()*2));
        }
        rellenarConNumeros(sopaLetras);
        imprimirSopa(sopaLetras);
    }
    
    /**
     * Lee una palabra ingresada por el usuario entre 3 y 5 caracteres
     * @return String ya validado
     */
    public static String readWord(){
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        while(word.length()>5 || word.length()<3){
            System.out.println("La palabra tiene que tener entre 3 y 5 caracteres");
            word = input.nextLine();
        }
        return word;        
    }
    
    /**
     * Busca una fila y columna aleatoria para poner la palabra
     * Luego verifica la disponibilidad segun esa fila y columna
     * Por ultimo coloca la palabra en la matriz si hay disponibilidad
     * Si no hay disponibilidad genera una nueva posicion
     * @param palabra
     * @param sopaLetras
     * @param horizontal 
     */
    public static void ubicarPalabraPosicionAleatoria(String palabra, String[][] sopaLetras, int horizontal){
        int fila=0 ,columna=0; 
        do{
            if(horizontal == 1){ // palabra horizontal
                fila = (int)(Math.random()*sopaLetras.length);
                columna = (int)(Math.random()*(sopaLetras.length - palabra.length()));
            }else{ // palabra vertical
                fila = (int)(Math.random()*(sopaLetras.length - palabra.length()));
                columna = (int)(Math.random()*sopaLetras.length);
            }
        }while(!verificarDisponibilidad(sopaLetras, fila, columna, palabra.length(), horizontal));
        colocarPalabraEnMatriz(palabra, sopaLetras, fila, columna, horizontal);
    }
    
    /**
     * Colocamos la palabra en la matriz, para ello primero debemos verificarDisponibilidad
     * Solamente debemos colocar la palabra cuando verificarDisponibilidad = true
     * @param palabra
     * @param sopaLetras
     * @param fila , posicion inicial de la fila
     * @param columna , posicion inicial de la columna
     * @param horizontal ,=1 horizontal , =0 vertical
     */
    public static void colocarPalabraEnMatriz(String palabra, String[][] sopaLetras, int fila, int columna, int horizontal){
        for(int i=0; i<palabra.length(); i++){
            if(horizontal == 1){
               sopaLetras[fila][columna+i] = palabra.substring(i, i+1);
            }else{
               sopaLetras[fila+i][columna] = palabra.substring(i, i+1);
            }
        }
    }
    
    /**
     * Verifica que desde la posicion inicial [fila][columna],
     * tengamos espacios libres para colocar la palabra
     * @param sopaLetras
     * @param fila , posicion inicial de la fila
     * @param columna , posicion inicial de la columna
     * @param longPalabra 
     * @param horizontal , =1 significa que la palabra va horizontal, =0 palabra va vertical
     * @return 
     */
    public static boolean verificarDisponibilidad(String[][] sopaLetras, int fila, int columna, int longPalabra, int horizontal){
        for(int i=0; i<longPalabra; i++){
            if(horizontal == 1){
                if(sopaLetras[fila][columna+i] != null){
                    return false;
                }
            }else{ // vertical
                if(sopaLetras[fila+i][columna] != null){
                    return false;
                }
            }
        }
        return true;
    }
    
    /**
     * Rellena las posiciones null de la matriz con numeros aleatorios entre 0 y 9
     * Se ejecuta luego de haber cargado las palabras en la matriz
     * @param sopaLetras 
     */
    public static void rellenarConNumeros(String[][] sopaLetras){
        for(int i=0; i<sopaLetras.length; i++){
            for(int j=0; j<sopaLetras[0].length; j++){
                if(sopaLetras[i][j] == null){
                    sopaLetras[i][j] = String.valueOf((int)(Math.random()*10));   // convierte en string el valor aleatorio entre 0 y 9                
                }
            }
        }
    }
    
    /**
     * Imprime la sopa de letras
     * @param sopaLetras 
     */
    public static void imprimirSopa(String[][] sopaLetras){
        for(int i=0; i<sopaLetras.length; i++){
            for(int j=0; j<sopaLetras[0].length; j++){
                System.out.print(sopaLetras[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
