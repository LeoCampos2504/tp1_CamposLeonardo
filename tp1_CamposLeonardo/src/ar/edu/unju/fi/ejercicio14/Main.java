package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			int num;
			int suma=0;
	        Scanner scanner= new Scanner(System.in);
	        System.out.println("Ingresa un numero entre 3 y 10 ");
			num= scanner.nextInt();
			if (num>=3 && num<=10) {
				int[] enteros2 = new int[num];
		        for (int i = 0; i < enteros2.length; i++) {
					System.out.println("Ingresa un numero para la posicion "+i);
					enteros2[i]= scanner.nextInt();
				}
		        for (int i = 0; i < enteros2.length; i++) {
					suma+=enteros2[i];
				}
		        
		        for (int i = 0; i < enteros2.length; i++) {
					System.out.println("Entero en la posicion "+i+" es: "+enteros2[i]);
				}
		        System.out.println("La suma de los elementos del arreglo es: "+ suma);
			}
	        
	        scanner.close();
		

}
		
}
