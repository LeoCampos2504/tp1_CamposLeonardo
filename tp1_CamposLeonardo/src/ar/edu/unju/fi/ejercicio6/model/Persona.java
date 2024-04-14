package ar.edu.unju.fi.ejercicio6.model;
import java.time.LocalDate;

public class Persona {
private String dni;
private String nombre;
private LocalDate fechanac;
private String provincia;

public Persona() {
	this.fechanac = LocalDate.now();
}

public Persona(String dni, String nombre, LocalDate fechanac, String provincia) {

	this.dni = dni;
	this.nombre = nombre;
	this.fechanac = fechanac;
	this.provincia = provincia;
}

public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
    this(dni, nombre, fechaNacimiento, "Jujuy");
}

public int calcularEdad() {
    return LocalDate.now().getYear() - this.fechanac.getYear();
}


public boolean esMayorDeEdad() {
    return calcularEdad() >= 18;
}

public void mostrarDatos() {
    System.out.println("DNI: " + dni);
    System.out.println("Nombre: " + nombre);
    System.out.println("Fecha de Nacimiento: " + fechanac);
    System.out.println("Provincia: " + provincia);
    System.out.println("Edad: " + calcularEdad());
    System.out.println(esMayorDeEdad() ? "La persona es mayor de edad" : "La persona no es mayor de edad");
}

}