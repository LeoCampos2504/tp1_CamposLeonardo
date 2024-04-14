package ar.edu.unju.fi.ejercicio7.main;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio7.model.Empleado;
public class Main {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("ingrese su nombre:");
		String nombre= scanner.nextLine();
		System.out.println("ingrese su legajo:");
		int legajo= scanner.nextInt();
		System.out.println("ingrese su salario:");
		double salario= scanner.nextInt();
		Empleado empleado1= new Empleado(nombre,legajo, salario);
        empleado1.mostrar_datos();
        empleado1.salar_aumento();
        empleado1.mostrar_datos();
        scanner.close();
	}

}