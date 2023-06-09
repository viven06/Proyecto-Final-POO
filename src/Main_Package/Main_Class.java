
package Main_Package;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main_Class {

 
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       Hotel hotel=new Hotel();
       int diasp,hsencilla,hdoble,hsuite,codigo;
       String fechaAl;
       /*
       System.out.println("Bienvenido a Crear Nuevo Grupo");
       System.out.println("Ingrese la fecha de alojamiento: ");
       fechaAl=in.nextLine();
       System.out.println("Ingrese los dias de permanencia: ");
       diasp=in.nextInt();
       System.out.println("Ingrese la cantidad de habitaciones sencillas: ");
       hsencilla=in.nextInt();
       System.out.println("Ingrese la cantidad de habitaciones dobles: ");
       hdoble=in.nextInt();
       System.out.println("Ingrese la cantidad de habitaciones suite: ");
       hsuite=in.nextInt();
       System.out.println("Ingrese el codigo de la reserva de grupo: ");
       codigo=in.nextInt();
       
       Grupo g1=new Grupo(diasp,hsencilla,hdoble,hsuite,fechaAl,codigo);
       
       String nombre,apellido,telefono,tipoDocu,numeroDocu,genero,nacionalidad,ciudadResidencia;
       int edad;
       String rep= " ";
       do{
           System.out.println("Ingrese datos del huesped ");
            System.out.println("Tipo de documento de identidad: ");
           tipoDocu=in.next();
            System.out.println("Numero documento de identidad ");
           numeroDocu=in.next(); 
            System.out.println("Telefono: ");
           telefono=in.next();
           in.nextLine();
            System.out.println("Nombre: ");
           nombre=in.nextLine();
            System.out.println("Apellido: ");
           apellido=in.nextLine();
            System.out.println("Edad: ");
           edad=in.nextInt();
            in.nextLine();
            System.out.println("Genero: ");
           genero=in.next();
            System.out.println("Nacionalidad: ");
           nacionalidad=in.next();
            System.out.println("Ciudad de Residencia: ");
            in.nextLine();
           ciudadResidencia=in.nextLine(); 
           
           g1.agregarHuesped(nombre,apellido,telefono,tipoDocu,numeroDocu,edad,genero,nacionalidad,ciudadResidencia);
           
           System.out.println("Desea agregar otro huesped? (Ingrese cualquier texto para repetir e ingrese No para terminar");
           rep=in.next();
       }while(!"No".equals(rep));
       
       for(Object h:g1.getHuespedes()){
           Huesped hu=(Huesped)h;
           hu.mostrarHuesped(); 
       }*/
    hotel.mostrarHabitaciones();
    }
    
}
