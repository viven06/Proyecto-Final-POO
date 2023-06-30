
package Logica;
import java.util.List;
import java.util.ArrayList;

public class Grupo {
    private ArrayList<Huesped> vHuespedes;
    private int dias_permanencia;
    private int hSencilla;
    private int hDoble;
    private int hSuite;
    private int contadorSencilla;
    private int contadorDoble;
    private int contadorSuite;    
    private String fechaAlojamiento;
    private int codigo;
    
    public Grupo(int dpe,int hse,int hdo, int hsu,String fal,int codigo){
        this.dias_permanencia=dpe;
        this.hSencilla=hse;
        this.hDoble=hdo;
        this.hSuite=hsu;
        this.fechaAlojamiento=fal;
        this.codigo=codigo;
        contadorSencilla=hSencilla;
        contadorDoble=hDoble;
        contadorSuite=hSuite;
        vHuespedes=new ArrayList();
    }
    
    public int calcularCosto(){
        int valorSencilla=100000;
        int valorDoble=200000;
        int valorSuite=350000;
        return (valorSencilla*dias_permanencia*hSencilla)+ (valorDoble*dias_permanencia*hDoble) + (valorSuite*hSuite*dias_permanencia);
    }
    
    public void agregarHuesped(String n,String a,String tf,String tdo,String ndo,int edad,String genero,String nac,String ciures){
        vHuespedes.add(new Huesped(n,a,tf,tdo,ndo,edad,genero,nac,ciures));
    }
    
    
    
    public int getCH(String tipo){
        if(tipo.equals("Sencilla")){
            return contadorSencilla;
        }
        else if(tipo.equals("Doble")){
            return contadorDoble;
        }
        else if(tipo.equals("Suite")){
            return contadorSuite;
        }
        return 0;
    }
    
    public int getH(String tipo){
        if(tipo.equals("Sencilla")){
            return hSencilla;
        }
        else if(tipo.equals("Doble")){
            return hDoble;
        }
        else if(tipo.equals("Suite")){
            return hSuite;
        }
        return 0;
    }
    
    public void setCH(String tipo){
        if(tipo.equals("Sencilla")){
            contadorSencilla--;
        }
        else if(tipo.equals("Doble")){
            contadorDoble--;
        }
        else if(tipo.equals("Suite")){
            contadorSuite--;
        }
    }
        
    public ArrayList<Huesped> getHuespedes(){
        return vHuespedes;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public String toString(){
        return "FECHA ALOJAMIENTO: "+fechaAlojamiento+" | DÍAS DE PERMANENCIA: "+dias_permanencia+" | H SENCILLAS: "+hSencilla+" | H DOBLES: "+hDoble+" | H SUITES: "+hSuite+" | CODIGO RESERVA: "+codigo;
    }
    
    public String toStringForList(){
        return "Codigo Reserva: "+codigo+"         Sen: "+hSencilla+"   Dob: "+hDoble+"   Sui: "+hSuite+"       Valor a Pagar: $"+calcularCosto();
    }
      
}
