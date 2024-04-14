package ar.edu.unju.fi.ejercicio9.main;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);

	        for (int i = 0; i < 3; i++) {
	            Producto producto = new Producto();

	            System.out.println("Ingrese el nombre del producto: ");
	            producto.setNombre(scanner.nextLine());

	            System.out.println("Ingrese el código del producto: ");
	            producto.setCodigo(scanner.nextLine());

	            System.out.println("Ingrese el precio del producto: ");
	            producto.setPrecio(scanner.nextDouble());

	            System.out.println("Ingrese el descuento del producto (0-50): ");
	            producto.setDescuento(scanner.nextInt());
	            scanner.nextLine();  

	            System.out.println("Nombre: " + producto.getNombre());
	            System.out.println("Código: " + producto.getCodigo());
	            System.out.println("Precio: " + producto.getPrecio());
	            System.out.println("Descuento: " + producto.getDescuento());
	            System.out.println("Precio con descuento: " + producto.calcularDescuento());
	            System.out.println();
	        }

	        scanner.close();
	    }

	}
