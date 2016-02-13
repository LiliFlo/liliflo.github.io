import java.util.Scanner;

public class Ejtres {

public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);
/*Se declara objeto llamado entrada instancia de clase Scanner 
*este objeto permitira obtener los datos que el usuario ingrese por teclado
*/
// programa que permita la suma de dos numeros multiplos de 5
int a, b, aux, suma= 0;
String numeros = ""; // variables tipo string llamada numeros
System.out.print("Ingresa el primer numero:"); 
a = entrada.nextInt();// Permite capturar el entero que ingresa el usuario, se guarda en variable numero
System.out.print("Ingresa el segundo numero");
b = entrada.nextInt();

if (a < 0 || b < 0){
	System.out.println("Ingresa un numero diferente a 0");
	return;
}
if (a > b){
	aux = a;
	a = b;
	b = aux;
}
 for (int i = a; i <= b; i = i + 5){
 	numeros = numeros + " " + i;
 	suma =  + 1;
 }
 System.out.println("Los multiplos son :  " + numeros + "\n" );
 System.out.println("La suma de los multiplos es: " + suma);
}
}