
package Main_Package;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class Hotel {
    private HashMap<Integer,Habitacion> habitaciones;
    
    public Hotel(){
        habitaciones=new HashMap<Integer,Habitacion>();
        for(int i=1;i<=10;i++){
            int numerohp1=100+i;
            if(i<=6){
                habitaciones.put(numerohp1,new Habitacion("Disponible",0,"Sencilla") );
            }
            else if(i>6 && i<10){
                habitaciones.put(numerohp1,new Habitacion("Disponible",0,"Doble") );
            }
            else if(i==10){
                habitaciones.put(numerohp1,new Habitacion("Disponible",0,"Suite") );
            }
        }
        for(int i=1;i<=10;i++){
            int numerohp2=200+i;
            if(i<=6){
                habitaciones.put(numerohp2,new Habitacion("Disponible",0,"Sencilla") );
            }
            else if(i>6 && i<10){
                habitaciones.put(numerohp2,new Habitacion("Disponible",0,"Doble") );
            }
            else if(i==10){
                habitaciones.put(numerohp2,new Habitacion("Disponible",0,"Suite") );
            }
        }
        for(int i=1;i<=10;i++){
            int numerohp3=300+i;
            if(i<=6){
                habitaciones.put(numerohp3,new Habitacion("Disponible",0,"Sencilla") );
            }
            else if(i>6 && i<10){
                habitaciones.put(numerohp3,new Habitacion("Disponible",0,"Doble") );
            }
            else if(i==10){
                habitaciones.put(numerohp3,new Habitacion("Disponible",0,"Suite") );
            }   
        }
    }
    
    public void mostrarHabitaciones(){
        Iterator iter = habitaciones.entrySet().iterator();
    while (iter.hasNext()) {
        Map.Entry entry = (Map.Entry) iter.next();
        System.out.println("Numero habitacion : " + entry.getKey() + " ||  " + entry.getValue().toString());
    }
    }
}
