
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
    
    public void mostrarHuesped(){
        System.out.println(" ");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellidos: "+apellido);
        System.out.println("Telefono: "+telefono);
        System.out.println("Tipo Documento de Identidad: "+tipoDocu);
        System.out.println("Numero Documento de Identidad: "+numeroDocu);
        System.out.println("Edad: "+edad);
        System.out.println("Genero: "+genero);
        System.out.println("Nacionalidad: "+nacionalidad);
        System.out.println("Ciudad de Residencia: "+ciudadResidencia);
    }
    
    @Override
    public String toString(){
        return nombre+";"+apellido+";"+telefono+";"+tipoDocu+";"+numeroDocu+";"+edad+";"+genero+";"+nacionalidad+";"+ciudadResidencia;
    }
}
