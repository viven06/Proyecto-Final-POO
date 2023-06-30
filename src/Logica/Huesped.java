
package Logica;


public class Huesped {
    private String nombre;
    private String apellido;
    private String telefono;
    private String tipoDocu;
    private String numeroDocu;
    private int edad;
    private String genero;
    private String nacionalidad;
    private String ciudadResidencia;
    
    public Huesped(String n,String a,String tf,String tdo,String ndo,int edad,String genero,String nac,String ciures){
        this.nombre=n;
        this.apellido=a;
        this.telefono=tf;
        this.tipoDocu=tdo;
        this.numeroDocu=ndo;
        this.edad=edad;
        this.genero=genero;
        this.nacionalidad=nac;
        this.ciudadResidencia=ciures;
    }
    
    
    
    @Override
    public String toString(){
        return "NOMBRE: "+nombre+" | APELLIDO: "+apellido+" | TELEFONO: "+telefono+" | TIPO DOCUMENTO: "+tipoDocu+" | NUMERO DOCUMENTO: "+numeroDocu+" | EDAD: "+edad+" | GENERO: "+genero+" | NACIONALIDAD: "+nacionalidad+" | CIUDAD DE RESIDENCIA: "+ciudadResidencia;
    }
}
