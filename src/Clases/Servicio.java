package Clases;

public class Servicio {
    private boolean internet;
    private boolean television;
    private String adicional1;
    private String adicional2;

    public Servicio (boolean internet, boolean television, String adicional1, String adicional2){
        this.internet=internet;
        this.television=television;
        this.adicional1=adicional1;
        this.adicional2=adicional2;
    }
    @Override
    public String toString(){
        return  "TV: "+(television?"SI":"NO")+
                ", Internet: "+(internet? "SI":"NO")+
                ", Extra1: "+ adicional1 + ", Extra2:"+ adicional2;
    }
}
