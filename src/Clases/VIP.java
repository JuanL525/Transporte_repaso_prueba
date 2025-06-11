package Clases;

public class VIP extends Normal {
    private Servicio servicio;

    public VIP(Ruta ruta, Pasajero pasajero, String asiento, int maletas, Servicio servicio) {
        super(ruta, pasajero, asiento, maletas);
        this.servicio = servicio;
    }

    @Override
    public double calcularCosto() {
        return super.calcularCosto() * 1.3;
    }

    @Override
    public void imprimirTicket() {
        super.imprimirTicket();
        System.out.println("Servicio VIP: " + servicio);
    }
}
