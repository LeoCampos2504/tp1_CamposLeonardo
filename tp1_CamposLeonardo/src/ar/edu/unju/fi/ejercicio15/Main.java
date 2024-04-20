package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			int num;
	        Scanner scanner= new Scanner(System.in);
	        System.out.println("Ingresa un numero entre 5 y 10 ");
			num= scanner.nextInt();
			if (num>=5 && num<=10) {
				String[] palabras = new String[num];
		        for (int i = 0; i < palabras.length; i++) {
					System.out.println("Ingresa una palabra para la posicion "+i);
					palabras[i]= scanner.next();
		        }
		        for (int i = 0; i < palabras.length; i++) {
					System.out.println("La palabra en la posicion "+i+" es: "+palabras[i]);
				}
		        System.out.println();
		        for (int i = palabras.length-1; i >= 0; i--) {
					System.out.println("La palabra en la posicion "+i+" es: "+palabras[i]);
				}
			}
	        
	        scanner.close();
		

}
		
}