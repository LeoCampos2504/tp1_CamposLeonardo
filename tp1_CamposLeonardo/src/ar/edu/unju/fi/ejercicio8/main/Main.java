package ar.edu.unju.fi.ejercicio8.main;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		Scanner scanner= new Scanner(System.in);
		System.out.println("dime un numero para calcular la sumatoria");
		int num=scanner.nextInt();
		System.out.println(calculadora.calcularSumatoria(num));
		System.out.println("dime un numero para calcular su productoria");
	    num=scanner.nextInt();
		System.out.println(calculadora.calcularProductoria(num));
        scanner.close();

	}

}