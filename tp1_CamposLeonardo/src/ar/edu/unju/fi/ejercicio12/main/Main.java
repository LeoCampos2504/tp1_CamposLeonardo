package ar.edu.unju.fi.ejercicio12.main;

import ar.edu.unju.fi.ejercicio12.model.*;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la fecha de nacimiento (dd/mm/yyyy):");
        String[] fecha = scanner.nextLine().split("/");
        int dia = Integer.parseInt(fecha[0]);
        int mes = Integer.parseInt(fecha[1]);
        int anio = Integer.parseInt(fecha[2]);

        Persona persona = new Persona();
        persona.setNombre_persona(nombre);
        persona.setFechaNacimiento(new GregorianCalendar(anio, mes - 1, dia));

        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = formatoFecha.format(persona.getFechaNacimiento().getTime());

        System.out.println("Nombre: " + persona.getNombre_persona());
        System.out.println("Fecha de nacimiento: " + fechaFormateada);
        System.out.println("Edad: " + persona.calcularEdad() + " años");
        System.out.println("Signo del zodiaco: " + persona.obtenerSignoZodiaco());
        System.out.println("Estación: " + persona.obtenerEstacion());
        scanner.close();
    }
}

