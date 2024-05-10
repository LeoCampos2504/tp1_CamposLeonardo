package ar.edu.unju.fi.ejercicio17.main;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    private static ArrayList<Jugador> jugadores = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1 – Alta de jugador");
            System.out.println("2 – Mostrar los datos del jugador");
            System.out.println("3 – Mostrar todos los jugadores ordenados por apellido.");
            System.out.println("4 – Modificar los datos de un jugador");
            System.out.println("5 – Eliminar un jugador");
            System.out.println("6 – Mostrar la cantidad total de jugadores que tiene el ArrayList.");
            System.out.println("7 – Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
            System.out.println("8 – Salir.");

            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número entero válido.");
                scanner.nextLine();
            }
            opcion = scanner.nextInt();
            scanner.nextLine();  // consume the leftover newline

            switch (opcion) {
                case 1:
                    altaJugador();
                    break;
                case 2:
                    mostrarDatosJugador();
                    break;
                case 3:
                    mostrarJugadoresOrdenadosPorApellido();
                    break;
                case 4:
                    modificarDatosJugador();
                    break;
                case 5:
                    eliminarJugador();
                    break;
                case 6:
                    mostrarCantidadTotalJugadores();
                    break;
                case 7:
                    mostrarCantidadJugadoresPorNacionalidad();
                    break;
            }
        } while (opcion != 8);

      

        scanner.close();
    }
    private static void altaJugador() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese el nombre del jugador:");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese el apellido del jugador:");
            String apellido = scanner.nextLine();

            System.out.println("Ingrese la fecha de nacimiento del jugador (formato dd/MM/yyyy):");
            String fechaNacimientoStr = scanner.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr, formatter);

            System.out.println("Ingrese la nacionalidad del jugador:");
            String nacionalidad = scanner.nextLine();

            System.out.println("Ingrese la estatura del jugador:");
            double estatura = scanner.nextDouble();

            System.out.println("Ingrese el peso del jugador:");
            double peso = scanner.nextDouble();

            scanner.nextLine();
            System.out.println("Ingrese la posición del jugador:");
            String posicion = scanner.nextLine();
           

            Jugador jugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);
            jugadores.add(jugador);
            
        scanner.close();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al intentar dar de alta al jugador. Por favor, intente nuevamente.");
            e.printStackTrace();
        }
        
    }
    private static void mostrarDatosJugador() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese el nombre del jugador:");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese el apellido del jugador:");
            String apellido = scanner.nextLine();

            boolean jugadorEncontrado = false;
            for (Jugador jugador : jugadores) {
                if (jugador.getNombre().equals(nombre) && jugador.getApellido().equals(apellido)) {
                    System.out.println("Nombre: " + jugador.getNombre());
                    System.out.println("Apellido: " + jugador.getApellido());
                    System.out.println("Fecha de nacimiento: " + jugador.getFechNacimiento());
                    System.out.println("Nacionalidad: " + jugador.getNacionalidad());
                    System.out.println("Estatura: " + jugador.getEstatura());
                    System.out.println("Peso: " + jugador.getPeso());
                    System.out.println("Posición: " + jugador.getPosicion());
                    System.out.println("Edad: " + jugador.calcularEdad());
                    jugadorEncontrado = true;
                    break;
                }
            }

            if (!jugadorEncontrado) {
                System.out.println("No se encontró un jugador con el nombre y apellido proporcionados.");
            }
           scanner.close();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al intentar mostrar los datos del jugador. Por favor, intente nuevamente.");
            e.printStackTrace();
        }
    }

    private static void mostrarJugadoresOrdenadosPorApellido() {
        try {
            jugadores.sort(Comparator.comparing(Jugador::getApellido));

            for (Jugador jugador : jugadores) {
                System.out.println("Nombre: " + jugador.getNombre());
                System.out.println("Apellido: " + jugador.getApellido());
                System.out.println("Fecha de nacimiento: " + jugador.getFechNacimiento());
                System.out.println("Nacionalidad: " + jugador.getNacionalidad());
                System.out.println("Estatura: " + jugador.getEstatura());
                System.out.println("Peso: " + jugador.getPeso());
                System.out.println("Posición: " + jugador.getPosicion());
                System.out.println("Edad: " + jugador.calcularEdad());
                System.out.println("--------------------");
            }
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al intentar mostrar los jugadores ordenados por apellido. Por favor, intente nuevamente.");
            e.printStackTrace();
        }
    }

    private static void modificarDatosJugador() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese el nombre del jugador:");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese el apellido del jugador:");
            String apellido = scanner.nextLine();

            boolean jugadorEncontrado = false;
            for (Jugador jugador : jugadores) {
                if (jugador.getNombre().equals(nombre) && jugador.getApellido().equals(apellido)) {
                    System.out.println("Ingrese el nuevo nombre del jugador:");
                    jugador.setNombre(scanner.nextLine());

                    System.out.println("Ingrese el nuevo apellido del jugador:");
                    jugador.setApellido(scanner.nextLine());

                    System.out.println("Ingrese la nueva fecha de nacimiento del jugador (formato dd/MM/yyyy):");
                    String fechaNacimientoStr = scanner.nextLine();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr, formatter);
                    jugador.setFechNacimiento(fechaNacimiento);

                    System.out.println("Ingrese la nueva nacionalidad del jugador:");
                    jugador.setNacionalidad(scanner.nextLine());

                    System.out.println("Ingrese la nueva estatura del jugador:");
                    jugador.setEstatura(scanner.nextDouble());

                    System.out.println("Ingrese el nuevo peso del jugador:");
                    jugador.setPeso(scanner.nextDouble());

                    scanner.nextLine(); // consume the leftover newline
                    System.out.println("Ingrese la nueva posición del jugador:");
                    jugador.setPosicion(scanner.nextLine());

                    System.out.println("Datos del jugador actualizados exitosamente.");
                    jugadorEncontrado = true;
                    break;
                }
            }

            if (!jugadorEncontrado) {
                System.out.println("No se encontró un jugador con el nombre y apellido proporcionados.");
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al intentar modificar los datos del jugador. Por favor, intente nuevamente.");
            e.printStackTrace();
        }
    }

    private static void eliminarJugador() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese el nombre del jugador:");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese el apellido del jugador:");
            String apellido = scanner.nextLine();

            boolean jugadorEncontrado = false;
            Iterator<Jugador> iterator = jugadores.iterator();
            while (iterator.hasNext()) {
                Jugador jugador = iterator.next();
                if (jugador.getNombre().equals(nombre) && jugador.getApellido().equals(apellido)) {
                    iterator.remove();
                    System.out.println("Jugador eliminado exitosamente.");
                    jugadorEncontrado = true;
                    break;
                }
            }

            if (!jugadorEncontrado) {
                System.out.println("No se encontró un jugador con el nombre y apellido proporcionados.");
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al intentar eliminar al jugador. Por favor, intente nuevamente.");
            e.printStackTrace();
        }
    }


    private static void mostrarCantidadTotalJugadores() {
        try {
            System.out.println("Cantidad total de jugadores: " + jugadores.size());
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al intentar mostrar la cantidad total de jugadores. Por favor, intente nuevamente.");
            e.printStackTrace();
        }
    }

    private static void mostrarCantidadJugadoresPorNacionalidad() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese la nacionalidad:");
            String nacionalidad = scanner.nextLine();

            long cantidad = jugadores.stream()
                                     .filter(jugador -> jugador.getNacionalidad().equalsIgnoreCase(nacionalidad))
                                     .count();

            System.out.println("Cantidad de jugadores de la nacionalidad " + nacionalidad + ": " + cantidad);
       scanner.close();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al intentar mostrar la cantidad de jugadores por nacionalidad. Por favor, intente nuevamente.");
            e.printStackTrace();
        }
    }


}