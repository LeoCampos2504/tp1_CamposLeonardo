package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {

	public static void main(String[] args) {
		 ArrayList<Pais> paises = new ArrayList<>();
	        ArrayList<DestinoTuristico> destinos = new ArrayList<>();

	        Pais pais5 = new Pais();
	        pais5.setCodigo(5);
	        pais5.setNombre("Argentina");
	        paises.add(pais5);

	        Pais pais2 = new Pais();
	        pais2.setCodigo(2);
	        pais2.setNombre("Brasil");
	        paises.add(pais2);

	        Pais pais3 = new Pais();
	        pais3.setCodigo(3);
	        pais3.setNombre("Chile");
	        paises.add(pais3);
	        
	        Pais pais4 = new Pais();
	        pais4.setCodigo(4);
	        pais4.setNombre("Uruguay");
	        paises.add(pais4);

	        Scanner scanner = new Scanner(System.in);
	        int opcion;

	        do {
	            System.out.println("1 – Alta de destino turístico");
	            System.out.println("2 – Mostrar todos los destinos turísticos");
	            System.out.println("3 – Modificar el país de un destino turístico");
	            System.out.println("4 – Limpiar el ArrayList de destino turísticos");
	            System.out.println("5 – Eliminar un destino turístico");
	            System.out.println("6 – Mostrar los destinos turísticos ordenados por nombre");
	            System.out.println("7 – Mostrar todos los países");
	            System.out.println("8 – Mostrar los destinos turísticos que pertenecen a un país");
	            System.out.println("9 – Salir");

	            System.out.print("Ingrese una opción: ");
	            opcion = scanner.nextInt();

	            switch (opcion) {
	                case 1:
	                	try {
	                        System.out.println("Ingrese el código del destino turístico:");
	                        int codigoDestino = scanner.nextInt();
	                        scanner.nextLine(); 
	                        System.out.println("Ingrese el nombre del destino turístico:");
	                        String nombreDestino = scanner.nextLine(); 
	                        System.out.println("Ingrese el precio del destino turístico:");
	                        double precioDestino = scanner.nextDouble();
	                        scanner.nextLine(); 
	                        System.out.println("Ingrese el código del país del destino turístico:");
	                        int codigoPais = scanner.nextInt();
	                        scanner.nextLine(); 
	                        System.out.println("Ingrese la cantidad de días del destino turístico:");
	                        int cantidadDias = scanner.nextInt();
	                        scanner.nextLine(); 

	                        Pais paisAsociado = null;
	                        for (Pais pais : paises) {
	                            if (pais.getCodigo() == codigoPais) {
	                                paisAsociado = pais;
	                                break;
	                            }
	                        }

	                        if (paisAsociado == null) {
	                            System.out.println("No se encontró un país con el código ingresado.");
	                        } else {
	                            DestinoTuristico nuevoDestino = new DestinoTuristico();
	                            nuevoDestino.setCodigo(codigoDestino);
	                            nuevoDestino.setNombre(nombreDestino);
	                            nuevoDestino.setPrecio(precioDestino);
	                            nuevoDestino.setPais(paisAsociado);
	                            nuevoDestino.setCantidadDeDias(cantidadDias);
	                            destinos.add(nuevoDestino);
	                            System.out.println("Destino turístico agregado exitosamente.");
	                        }
	                    } catch (InputMismatchException e) {
	                        System.out.println("Ha ingresado un tipo de dato incorrecto. Inténtelo de nuevo.");
	                        scanner.nextLine(); 
	                    } catch (Exception e) {
	                        System.out.println("Ha ocurrido un error: " + e.getMessage());
	                    }
	                    break;
	                case 2:
	                	try {
	                        if (destinos.isEmpty()) {
	                            System.out.println("No hay destinos turísticos para mostrar.");
	                        } else {
	                            for (DestinoTuristico destino : destinos) {
	                                System.out.println("Código: " + destino.getCodigo());
	                                System.out.println("Nombre: " + destino.getNombre());
	                                System.out.println("Precio: " + destino.getPrecio());
	                                System.out.println("País: " + destino.getPais().getNombre());
	                                System.out.println("Cantidad de días: " + destino.getCantidadDeDias());
	                                System.out.println("-------------------------");
	                            }
	                        }
	                    } catch (Exception e) {
	                        System.out.println("Ha ocurrido un error: " + e.getMessage());
	                    }
	                    break;
	                case 3:
	                	try {
	                        System.out.println("Ingrese el código del destino turístico que desea modificar:");
	                        int codigoDestino = scanner.nextInt();
	                        DestinoTuristico destinoAModificar = null;
	                        for (DestinoTuristico destino : destinos) {
	                            if (destino.getCodigo() == codigoDestino) {
	                                destinoAModificar = destino;
	                                break;
	                            }
	                        }

	                        if (destinoAModificar == null) {
	                            System.out.println("No se encontró un destino turístico con el código ingresado.");
	                        } else {
	                            System.out.println("Ingrese el nuevo código de país para el destino turístico:");
	                            int nuevoCodigoPais = scanner.nextInt();
	                            Pais nuevoPais = null;
	                            for (Pais pais : paises) {
	                                if (pais.getCodigo() == nuevoCodigoPais) {
	                                    nuevoPais = pais;
	                                    break;
	                                }
	                            }

	                            if (nuevoPais == null) {
	                                System.out.println("No se encontró un país con el código ingresado.");
	                            } else {
	                                destinoAModificar.setPais(nuevoPais);
	                                System.out.println("El país del destino turístico ha sido modificado exitosamente.");
	                            }
	                        }
	                    } catch (InputMismatchException e) {
	                        System.out.println("Ha ingresado un tipo de dato incorrecto. Inténtelo de nuevo.");
	                        scanner.nextLine(); 
	                    } catch (Exception e) {
	                        System.out.println("Ha ocurrido un error: " + e.getMessage());
	                    }
	                    break;
	                case 4:
	                	 try {
	                	        destinos.clear();
	                	        System.out.println("Se ha limpiado la lista de destinos turísticos.");
	                	    } catch (Exception e) {
	                	        System.out.println("Ha ocurrido un error: " + e.getMessage());
	                	    }
	                    break;
	                case 5:
	                	try {
	                        System.out.println("Ingrese el código del destino turístico que desea eliminar:");
	                        int codigoDestino = scanner.nextInt();
	                        DestinoTuristico destinoAEliminar = null;
	                        for (DestinoTuristico destino : destinos) {
	                            if (destino.getCodigo() == codigoDestino) {
	                                destinoAEliminar = destino;
	                                break;
	                            }
	                        }

	                        if (destinoAEliminar == null) {
	                            System.out.println("No se encontró un destino turístico con el código ingresado.");
	                        } else {
	                            destinos.remove(destinoAEliminar);
	                            System.out.println("El destino turístico ha sido eliminado exitosamente.");
	                        }
	                    } catch (InputMismatchException e) {
	                        System.out.println("Ha ingresado un tipo de dato incorrecto. Inténtelo de nuevo.");
	                        scanner.nextLine(); 
	                    } catch (Exception e) {
	                        System.out.println("Ha ocurrido un error: " + e.getMessage());
	                    }
	                    break;
	                case 6:
	                	try {
	                        if (destinos.isEmpty()) {
	                            System.out.println("No hay destinos turísticos para mostrar.");
	                        } else {
	                           
	                            ArrayList<DestinoTuristico> destinosOrdenados = new ArrayList<>(destinos);
	                            destinosOrdenados.sort(Comparator.comparing(DestinoTuristico::getNombre));
	                            for (DestinoTuristico destino : destinosOrdenados) {
	                                System.out.println("Código: " + destino.getCodigo());
	                                System.out.println("Nombre: " + destino.getNombre());
	                                System.out.println("-------------------------");
	                            }
	                        }
	                    } catch (Exception e) {
	                        System.out.println("Ha ocurrido un error: " + e.getMessage());
	                    }
	                    break;
	                case 7:
	                	try {
	                        if (paises.isEmpty()) {
	                            System.out.println("No hay países para mostrar.");
	                        } else {
	                            for (Pais pais : paises) {
	                                System.out.println("Código: " + pais.getCodigo());
	                                System.out.println("Nombre: " + pais.getNombre());
	                                System.out.println("-------------------------");
	                            }
	                        }
	                    } catch (Exception e) {
	                        System.out.println("Ha ocurrido un error: " + e.getMessage());
	                    }
	                    break;
	                case 8:
	                	try {
	                        System.out.println("Ingrese el código del país del que desea ver los destinos turísticos:");
	                        int codigoPais = scanner.nextInt();
	                        Pais paisSeleccionado = null;
	                        for (Pais pais : paises) {
	                            if (pais.getCodigo() == codigoPais) {
	                                paisSeleccionado = pais;
	                                break;
	                            }
	                        }

	                        if (paisSeleccionado == null) {
	                            System.out.println("No se encontró un país con el código ingresado.");
	                        } else {
	                            boolean hayDestinos = false;
	                            for (DestinoTuristico destino : destinos) {
	                                if (destino.getPais().getCodigo() == codigoPais) {
	                                    System.out.println("Código: " + destino.getCodigo());
	                                    System.out.println("Nombre: " + destino.getNombre());
	                                    System.out.println("-------------------------");
	                                    hayDestinos = true;
	                                }
	                            }
	                            if (!hayDestinos) {
	                                System.out.println("No hay destinos turísticos para el país seleccionado.");
	                            }
	                        }
	                    } catch (InputMismatchException e) {
	                        System.out.println("Ha ingresado un tipo de dato incorrecto. Inténtelo de nuevo.");
	                        scanner.nextLine(); 
	                    } catch (Exception e) {
	                        System.out.println("Ha ocurrido un error: " + e.getMessage());
	                    }
	                    break;
	            }
	        } while (opcion != 9);
	scanner.close();    
	}

}
