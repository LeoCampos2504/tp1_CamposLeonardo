package ar.edu.unju.fi.ejercicio5;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ingrese un numero entre 1 y 9");
		int num=scanner.nextInt();
		int resultado=0;
		if (num>=1 && num<=9) {
			for (int i = 0; i < 11; i++) {
				resultado=num*i;
				System.out.println(num+"x"+i+"="+resultado);
			}
				
			}
		scanner.close();
	}

}