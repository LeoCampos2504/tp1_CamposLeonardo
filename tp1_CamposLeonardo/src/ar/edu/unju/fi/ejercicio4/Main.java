package ar.edu.unju.fi.ejercicio4;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ingrese un numero entre 0 y 10");
		int num=scanner.nextInt();
		int i=num;
		int resultado=1;
		if (num>=0 && num<=10) {
			while (num>1) {
				resultado*=num;
				num-=1;
				
			}
			System.out.println("El factorial de "+ i+ " es: "+resultado);
		} else {
System.out.println("El numero ingresado no esta entre 0 y 10");
		}
scanner.close();
	}

}