package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
     private String nombre;
     private int legajo;
     private double salario;
     private static final double SALARIO_MINIMO= 210000; 
     private static final double AUMENTO=20000;
	public Empleado(String nombre, int legajo, double salario) {
	
		this.nombre = nombre;
		this.legajo = legajo;
		this.salario = salario >= SALARIO_MINIMO ? salario : SALARIO_MINIMO;
		
	}
	
	public void mostrar_datos() {
		System.out.println("Nombre del empleado: "+ nombre);
		System.out.println("Legajo: "+ legajo);
		System.out.println("Salario: $"+ salario);
	
	}
	
     public double salar_aumento() {
    	 return salario = salario + AUMENTO;
     } 
}
