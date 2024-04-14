package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
      
	private int N;
    private double resultado=1;
	public CalculadoraEspecial() {}

	public int getN() {
		return N;
	}

	public void setN(int N) {
		this.N = N;
	}
	
	public double calcularSumatoria(int n) {
		resultado=0;
		for (int i = 1; i <= n; i++) {
			resultado= resultado + Math.pow(((i*(i+1))/2),2);
		}
		
		return resultado;
	}
	
	public double calcularProductoria(int n) {
		resultado=1;
		for (int i = 1; i <= n; i++) {
			resultado= resultado * i*(i+4);
			System.out.println(resultado);
		}
		
		return resultado;
	}
	
	
	}