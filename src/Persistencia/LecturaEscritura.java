
package Persistencia;

import Logica.*;
import java.io.*;
import java.util.ArrayList;

public class LecturaEscritura {
    
    public void escribirProductos(ArrayList<Huesped> huespedes,Grupo g){
        BufferedWriter writer;
        try{
            writer=new BufferedWriter(new FileWriter(new File("Archivos/Registro_Huespedes.txt")));
            writer.write(g.toString()+"\n");
            for(Huesped h:huespedes){
                writer.write(h.toString()+"\n");
            }
            writer.write("\n");
            writer.close(); 
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
