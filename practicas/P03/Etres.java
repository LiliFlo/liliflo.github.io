public class Etres {

public static void main(String[] args) {

int numero;
//Multiplos de 5 hasta 100
//Ciclo for desde 1 a 100
//Validamos que numeros son multiplos de 5 con condicional if
//Va a dividir 5 entre 100 y si el residuo es 0 se cumple la condicion 
String mul="";
for (int i = 1; i < 100; i++){
	if (100%5==0){
		mul=mul+1;
	}
}
System.out.print("Multiplos de 5 de 1 a 100" + mul);
} // Fin del main

} // Fin de la clase EjerciciotresPtres
