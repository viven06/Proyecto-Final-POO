
package Main_Package;


public class Habitacion {
    private String estado;
    private int grupo;
    private String tipoHabitacion;
   
    public Habitacion(String estado,int grupo,String tipoH){
        this.estado=estado;
        this.grupo=grupo;
        this.tipoHabitacion=tipoH;
    }
    public void setGrupo(int grupo){
        this.grupo=grupo;
    }
    
    public String toString(){
        return "Tipo : "+ tipoHabitacion+" || Estado : "+estado;
    }
}
