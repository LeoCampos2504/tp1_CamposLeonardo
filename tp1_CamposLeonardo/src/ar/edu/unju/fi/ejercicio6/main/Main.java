package ar.edu.unju.fi.ejercicio6.main;
import java.time.LocalDate;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		Persona persona1= new Persona();
		persona1.mostrarDatos();
		//persona2
	    System.out.println("Ingrese el DNI: ");
        String dni = scanner.nextLine();
        System.out.println("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la fecha de nacimiento (formato: yyyy-mm-dd): ");
        LocalDate fechana = LocalDate.parse(scanner.nextLine());
        System.out.println("Ingrese la provincia: ");
        String provincia = scanner.nextLine();
        Persona persona2 = new Persona(dni, nombre, fechana, provincia);
        persona2.mostrarDatos();
        //persona3
        System.out.println("Ingrese el DNI: ");
        dni = scanner.nextLine();
        System.out.println("Ingrese el nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Ingrese la fecha de nacimiento (formato: yyyy-mm-dd): ");
        fechana = LocalDate.parse(scanner.nextLine());
        Persona persona3 = new Persona(dni, nombre, fechana);
        
        persona3.mostrarDatos();

        scanner.close();
	    }

	}