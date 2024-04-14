package ar.edu.unju.fi.ejercicio10.main;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Pizza pizza=new Pizza();
        for (int i = 1; i < 4; i++) {
			System.out.println("Ingresa el diametro de la pizza que quieres puede ser 20,30 o 40");
			int diametro=scanner.nextInt();
			System.out.println("Quieres agregarle ingredientes especiales?");
			boolean especiales=scanner.nextBoolean();
			
			System.out.println("**Pizza "+i+"**");
			System.out.println("Diametro= "+diametro);
			System.out.println("ingredientes especialas= "+especiales);
			System.out.println("Precio Pizza= "+pizza.calcularPrecio(diametro, especiales));
			System.out.println("Area de la pizza= "+pizza.calcularArea(diametro));
			scanner.nextLine();
		}
        scanner.close();
	}

}