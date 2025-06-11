package Clases;

public class Ticket {
    protected Ruta ruta;
    protected Pasajero pasajero;
    protected String asiento;
    protected int maletas;

    public Ticket(Ruta ruta, Pasajero pasajero, String asiento, int maletas){
        this.ruta=ruta;
        this.pasajero=pasajero;
        this.asiento=asiento;
        this.maletas=maletas;
    }

    public double calcularCosto(){
        return ruta.getPrecioBase();
    }

    public void imprimirTicket(){
        System.out.println("====TICKET=====");
        System.out.println(pasajero);
        System.out.println("Ruta: "+ruta);
        System.out.println("Asiento: "+asiento);
        System.out.println("Maletas: "+ maletas);
        System.out.println("Costo: $"+ calcularCosto());
    }

}

