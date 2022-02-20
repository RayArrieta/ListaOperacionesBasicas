
package operacionesbasicas;

import java.util.*;
import java.util.Vector;
import java.lang.String;

public class ejemplovectores {

    
    public static void main(String[] args) {
      
        Vector v2 = new Vector ();
        
        //Agregar datos de las personas Nombre, Edad, Estatura
        
        //Persona 1
        
        v2.addElement("Ray");
        v2.addElement(29);
        v2.addElement(1.7);
        
        
           //Persona 2
        
        v2.addElement("Ray David");
        v2.addElement(1);
        v2.addElement(0.45);
        
           //Persona 3
        
        v2.addElement("Victoria");
        v2.addElement(23);
        v2.addElement(1.65);
        
        //Imprimir arreglo
        
        int posicion; 
        
         for (posicion = 0; posicion<v2.size(); posicion++){
             System.out.println(v2.elementAt(posicion)+"\t");
        }
        
        
    }
    
}
