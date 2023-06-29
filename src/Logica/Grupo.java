
package Logica;
import java.util.List;
import java.util.ArrayList;

public class Grupo {
    private ArrayList<Huesped> vHuespedes;
    private int dias_permanencia;
    private int hSencilla;
    private int hDoble;
    private int hSuite;
    private String fechaAlojamiento;
    private int codigo;
    
    public Grupo(int dpe,int hse,int hdo, int hsu,String fal,int codigo){
        this.dias_permanencia=dpe;
        this.hSencilla=hse;
        this.hDoble=hdo;
        this.hSuite=hsu;
        this.fechaAlojamiento=fal;
        this.codigo=codigo;
        vHuespedes=new ArrayList();
    }
    
    public int calcularCosto(){
        int valorSencilla=10000;
        int valorDoble=30000;
        int valorSuite=50000;
        return (valorSencilla*dias_permanencia*hSencilla)+ (valorDoble*dias_permanencia*hDoble) + (valorSuite*hSuite*dias_permanencia);
    }
    
    public void agregarHuesped(String n,String a,String tf,String tdo,String ndo,int edad,String genero,String nac,String ciures){
        vHuespedes.add(new Huesped(n,a,tf,tdo,ndo,edad,genero,nac,ciures));
    }
    
    public void mostrarHuespedes(){
        for(Huesped h:vHuespedes){
            h.mostrarHuesped();
        }
    }
    
    public ArrayList getHuespedes(){
        return vHuespedes;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public String toString(){
        return dias_permanencia+";"+hSencilla+";"+hDoble+";"+hSuite+";"+fechaAlojamiento+";"+codigo;
    }
    
    public String toStringForList(){
        return "Reserva: "+codigo;
    }
      
}
