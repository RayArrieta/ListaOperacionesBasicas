
package operacionesbasicas;

import java.util.*;
import java.util.Vector;
import java.lang.String;

public class vectoresYlinkedlist {

   
    public static void main(String[] args) {
        
        Vector v1 = new Vector (0);
        
        //Añadir elemento al final de un vector
        
        v1.addElement("1");
        v1.addElement("2");
        v1.addElement("3");
        
        //Insertar elemento en una posicion especifica
        
        v1.insertElementAt(5, 0);
        
        //Metodos para eliminar elementos de un vector
        
       
        v1.removeAllElements(); //Remover todos los elementos
        v1.removeElementAt(0); //Remover un elemento en concreto
        v1.removeElement(v1);//Romver un elemento por indicando su indice
        
        
        //Acceso a los elementos de un vector
        
        v1.elementAt(1);
        
        for (int i = 0; i<v1.size(); i++){
             System.out.println(v1.elementAt(i)+"\t");
        }
        
        
        
        
        
    }
    
}
