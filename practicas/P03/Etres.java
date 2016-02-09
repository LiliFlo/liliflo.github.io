import java.util.Scanner;

public class Etres {

public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);

int numero;

System.out.print("Ingresar un numero:");
numero = entrada.nextInt();
System.out.print("La suma de los primeros " + numero + " numeros multiplos de 5 es de:" + ((numero*numero * 5) + (numero * 5)) / 2);
}
}