package ar.edu.unju.fi.ejercicio16;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int num=0;
		byte posicion;
		String[] nombresPersonas = new String[5];
		for (int i = 0; i < nombresPersonas.length; i++) {
			System.out.println("Ingresa una palabra para la posicion "+i);
			nombresPersonas[i]= scanner.next();
		}
		while (num<nombresPersonas.length) {
			System.out.println("El nombre en la posicion "+num+" es: "+nombresPersonas[num]);
			num++;
		}
		num=0;
		System.out.println("el tamaño de la array es: "+nombresPersonas.length);
		System.out.println("dime la posicion que quieres eliminar");
		posicion=scanner.nextByte();
		do {
			num++;
			if (num==posicion & posicion==nombresPersonas.length-1) {
				nombresPersonas[nombresPersonas.length-1]=" ";
			}else if (num==posicion & posicion!=nombresPersonas.length-1) {
				for (int i = posicion; i < nombresPersonas.length-1; i++) {
					nombresPersonas[i]=nombresPersonas[i+1];
					}
				nombresPersonas[nombresPersonas.length-1]=" ";
			}
			
		} while (num!=posicion);
		num=0;
		while (num<nombresPersonas.length) {
			System.out.println("El nombre en la posicion "+num+" es: "+nombresPersonas[num]);
			num++;
		}
		
	}

}
