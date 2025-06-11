package Clases;

public class Ruta {
    private String origen;
    private String destino;
    private double precioBase;

    public Ruta (String origen, String destino, double precioBase) {
        this.origen = origen;
        this.destino = destino;
        this.precioBase = precioBase;
    }
    public String getOrigen(){return  origen;}
    public void setOrigen(String origen) {this.origen= origen;}

    public String getDestino(){return destino;}
    public void setDestino(String destino){this.destino = destino;}

    public double getPrecioBase(){return precioBase;}
    public void setPrecioBase(double precioBase){this.precioBase = precioBase;}

    @Override
    public String toString(){
        return origen + "-" + destino + " ($" + precioBase + ")";
    }
}
