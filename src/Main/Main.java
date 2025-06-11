package Main;
import java.util.*;
import Clases.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Ticket> tickets = new ArrayList<>();

    public static void main(String[] args) {
       int opcion;
       do{
           System.out.println("======Sistema compra de pasajes el buho=========");
           System.out.println("1. Comprar pasaje Normal");
           System.out.println("2. Comprar pasaje VIP");
           System.out.println("3. Ver tickets comprados");
           System.out.println("4. SALIR");
           System.out.print("Opcion: ");
           opcion = sc.nextInt();
           sc.nextLine();

           switch (opcion){
               case 1 -> comprarPasajeNormal();
               case 2 -> comprarPasajeVIP();
               case 3 -> mostrarTickets();
               case 4 -> System.out.println("Gracias por usar el sistema");
               default -> System.out.println("Opcion no valida");
           }
       }while (opcion != 4);
    }
    private static Ruta seleccionarRuta() {
        System.out.println("Rutas disponibles:");
        System.out.println("1. Quito - Guayaquil ($20)");
        System.out.println("2. Quito - Tulcán ($17.50)");
        System.out.println("3. Quito - Puyo ($15)");
        System.out.println("4. Quito - Riobamba ($17.50)");
        System.out.print("Seleccione ruta (1-4): ");
        int opcion = sc.nextInt();
        sc.nextLine();

        return switch (opcion) {
            case 1 -> new Ruta("Quito", "Guayaquil", 20);
            case 2 -> new Ruta("Quito", "Tulcán", 17.50);
            case 3 -> new Ruta("Quito", "Puyo", 15);
            case 4 -> new Ruta("Quito", "Riobamba", 17.50);
            default -> {
                System.out.println("Ruta no válida. Seleccionando Quito - Guayaquil por defecto.");
                yield new Ruta("Quito", "Guayaquil", 20);
            }
        };
    }

    private static Pasajero crearPasajero() {
        System.out.print("Nombre del pasajero: ");
        String nombre = sc.nextLine();
        System.out.print("Cédula: ");
        String cedula = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        return new Pasajero(nombre, cedula, edad);
    }

    private static void comprarPasajeNormal() {
        System.out.println("\n--- Comprar Pasaje Normal ---");
        Ruta ruta = seleccionarRuta();
        Pasajero pasajero = crearPasajero();
        System.out.print("Tipo de asiento (ventana/pasillo/final/adelante): ");
        String asiento = sc.nextLine();
        System.out.print("Cantidad de maletas: ");
        int maletas = sc.nextInt();
        sc.nextLine();

        Ticket ticket = new Normal(ruta, pasajero, asiento, maletas);
        tickets.add(ticket);
        System.out.println("Pasaje comprado exitosamente.");
    }

    private static void comprarPasajeVIP() {
        System.out.println("\n--- Comprar Pasaje VIP ---");
        Ruta ruta = seleccionarRuta();
        Pasajero pasajero = crearPasajero();
        System.out.print("Tipo de asiento (ventana/pasillo/final/adelante): ");
        String asiento = sc.nextLine();
        System.out.print("Cantidad de maletas: ");
        int maletas = sc.nextInt();
        sc.nextLine();

        System.out.print("¿Desea televisión? (true/false): ");
        boolean tv = sc.nextBoolean();
        System.out.print("¿Desea internet? (true/false): ");
        boolean net = sc.nextBoolean();
        sc.nextLine(); // limpiar buffer

        System.out.print("Servicio adicional 1: ");
        String extra1 = sc.nextLine();
        System.out.print("Servicio adicional 2: ");
        String extra2 = sc.nextLine();

        Servicio servicio = new Servicio(net, tv, extra1, extra2);
        Ticket ticket = new VIP(ruta, pasajero, asiento, maletas, servicio);
        tickets.add(ticket);
        System.out.println("Pasaje VIP comprado exitosamente.");
    }

    private static void mostrarTickets() {
        if (tickets.isEmpty()) {
            System.out.println("No hay tickets comprados aún.");
        } else {
            System.out.println("\n--- Tickets Comprados ---");
            for (Ticket ticket : tickets) {
                ticket.imprimirTicket();
                System.out.println("--------------------------");
            }
        }
    }
}