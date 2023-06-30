
package Persistencia;

import Logica.*;
import java.io.*;
import java.util.ArrayList;

public class LecturaEscritura {
    
    public void escribirProductos(ArrayList<Grupo> grupos){
        BufferedWriter writer;
        try{
            writer=new BufferedWriter(new FileWriter(new File("Archivos/Registro_Huespedes.txt")));
            
            for(Grupo g:grupos){
                writer.write(g.toString()+"\n");
                for(Huesped h:g.getHuespedes()){
                    writer.write(h.toString()+"\n");
                }
                writer.write("\n"+"\n");
            }
            writer.close();
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
