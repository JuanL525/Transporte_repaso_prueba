package Clases;

public class Normal extends Ticket {
    public Normal(Ruta ruta, Pasajero pasajero, String asiento, int maletas) {
        super(ruta, pasajero, asiento, maletas);
    }

    @Override
    public double calcularCosto() {
        return super.calcularCosto();
    }
}