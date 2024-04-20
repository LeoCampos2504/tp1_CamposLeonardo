package ar.edu.unju.fi.ejercicio13;
 import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int[] enteros = new int[8];
        Scanner scanner= new Scanner(System.in);
        for (int i = 0; i < enteros.length; i++) {
			System.out.println("Ingresa un numero para la posicion "+i);
			enteros[i]= scanner.nextInt();
		}
        for (int i = 0; i < enteros.length; i++) {
			System.out.println("Entero en la posicion "+i+" es: "+enteros[i]);
		}
        scanner.close();
	}

}
