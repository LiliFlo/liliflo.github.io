import java.util.Scanner;

public class Ejerciciotres {

public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);
/*Se declara objeto llamado entrada instancia de clase Scanner 
*este objeto permitira obtener los datos que el usuario ingrese por teclado
*/
// programa que permita la suma de dos numeros multiplos de 5
int numero; // variable tipo entero llamada numero
System.out.print("Ingresar un numero:"); 
numero = entrada.nextInt();// Permite capturar el entero que ingresa el usuario, se guarda en variable numero
System.out.print("La suma de los primeros " + numero + " numeros multiplos de 5 es de:" + ((numero*numero * 5) + (numero * 5)) / 2);
}//Formula para hayar la suma de los multiplos de 5    n*n*5 + n*7 / 2
}