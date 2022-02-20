
package operacionesbasicas;

import java.util.Vector;
import java.lang.String;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import operacionesbasicas.gastos;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class listavector {

 
    public static void main(String[] args) {
        
          Vector v3 = new Vector (); //NUEVO OBJETO LISTA ENTERO VECTOR
          LinkedList listaString = new LinkedList(); // LISTA STRING CON LINKEDLIST
          LinkedList listaString2 = new LinkedList(); // LISTA STRING CON LINKEDLIST
          
          int posicion; //Variable iteraador que busca la posicion y que se encarga de recorre el arreglo 
         boolean   creciente = false;
         boolean         decreciente  = false;
          
          
          //LISTA ENTEROS CON LA CLASE VECTOR
          System.out.println("LISTA DE ENTEROS CON VECTOR");
          
          v3.addElement(25);
          v3.addElement(26);
          v3.addElement(27);
          v3.addElement(28);
          v3.addElement(29);
          
          //IMPRIMIR
          
          for ( posicion = 0; posicion<v3.size(); posicion++){
             System.out.println(v3.elementAt(posicion)+"\t");
        }
          //AGREGAR AL INICIO
          System.out.println("AGREGAR EL INICIO ELEMENTO 34");
          
          v3.insertElementAt(34, 0); 
          
         for ( posicion = 0; posicion<v3.size(); posicion++){
             System.out.println(v3.elementAt(posicion)+"\t");
        } 
         
           //AGREGAR AL FINAL
          System.out.println("AGREGAR AL FINAL ELEMENTO 40");
          
          v3.addElement(40);
          
         for ( posicion = 0; posicion<v3.size(); posicion++){
             System.out.println(v3.elementAt(posicion)+"\t");
        } 
                   
            //OBTENER NUMERO DE ELEMENTOS
          System.out.println("OBTENER NUMERO DE ELEMENTOS");
          
          System.out.println(v3.size());
          
           //COMPROBAR SI LA LISTA ESTA VACIA
          System.out.println("LA LISTA ESTA VACIA?");
          
          System.out.println(v3.isEmpty());
          
          
            //AGREGAR EN CUALQUIER PARTE
          System.out.println("AGREGAR EL NUMERO 50 EN CUALQUER PARTE");
          
          v3.insertElementAt(50, 4); 
          
         for ( posicion = 0; posicion<v3.size(); posicion++){
             System.out.println(v3.elementAt(posicion)+"\t");
        } 
         
         //AGREGAR VARIOS ELEMENTOS
         System.out.println("SE AGREGAN VARIOS ELEMENTOS A LA LISTA");
         v3.insertElementAt(70, 4); 
         v3.insertElementAt(70, 4); 
         v3.insertElementAt(70, 4);
         
         for ( posicion = 0; posicion<v3.size(); posicion++){
             System.out.println(v3.elementAt(posicion)+"\t");
        }
         
         //MOSTRAR LOS ELEMENTOS SOLO USANSO SYSTEM.OUT
         System.out.println("MOSTRAR LOS ELEMENTOS SOLO USANSO SYSTEM.OUT");
         
         System.out.println(v3.toString());
         
         System.out.println(v3);
         
         
         //MOSTRAR LOS ELEMENTOS USANDO UN ITERADOR
         System.out.println("MOSTRAR LOS ELEMENTOS USANDO UN ITERADOR");
         
         Iterator  iterador =  v3.iterator();//OTRA FORMA DE RECORRER LAS LISTAS
                  
         while (iterador.hasNext()){
              System.out.print(iterador.next()+"["+"-"+"]");
         }
         
         System.out.print("\n");
         
         //MOSTRAR LOS ELEMENTOS USANDO UN FOR ESPECIAL
         System.out.println("MOSTRAR LOS ELEMENTOS USANDO UN FOR ESPECIAL");
                           
         v3.forEach(System.out::println);
         
         System.out.print("\n");
         
         
          //MOSTRAR LOS ELEMENTOS USANDO UN WHILE
         System.out.println("MOSTRAR LOS ELEMENTOS USANDO UN UN WHILE");
                           
         while (posicion<=v3.size()){
          System.out.print(v3);
          posicion++;
          }
         
         System.out.print("\n");
         
         
        //MOSTRAR LOS ELEMENTOS USANDO UN DO WHILE
         System.out.println("MOSTRAR LOS ELEMENTOS USANDO UN DO WHILE");
          
          do {
             System.out.print(v3);
              posicion++;
               }while (posicion<=v3.size());
         
         System.out.print("\n");
         
        //MOSTRAR LOS ELEMENTOS USANDO STREAM
         System.out.println("MOSTRAR LOS ELEMENTOS USANDO STREAM");
         
         v3.stream().forEach(System.out::println);
         
          System.out.print("\n");
          
         
        //MOSTRAR LOS ELEMENTOS EN FORMA ASCENDENTE USANDO FOR
         System.out.println("MOSTRAR EL PRIMERO ELEMENTO DEL VECTOR ");
         
         //*******Y POR AQUI************//
         System.out.println(v3.firstElement());
                  
          System.out.print("\n");
          
          
        //MOSTRAR EL ULTIMO ELEMENTO
         System.out.println("MOSTRAR EL ULTIMO ELEMENTO DEL VECTOR ");
         
         //*******Y POR AQUI************//
         System.out.println(v3.lastElement());
                  
          System.out.print("\n");
          
        
          
        //ELIMINAR EL PRIMER ELEMENTOS
        System.out.println("ELIMINAR EL PRIMER ELEMENTO ");
        
         v3.remove(0);
         
        for ( posicion = 0; posicion<v3.size(); posicion++){
             System.out.println(v3.elementAt(posicion)+"\t");
        }
        
        
        //ELIMINAR EL ULTIMO ELEMENTOS
        System.out.println("ELIMINAR EL ULTIMO ELEMENTO ");
        
        v3.remove(9);
         
        for ( posicion = 0; posicion<v3.size(); posicion++){
             System.out.println(v3.elementAt(posicion)+"\t");
        }
         
        
        System.out.println("ELIMINAR UN ELEMENTO EN LA POSICIION X ");
        
        v3.remove(4);
         
        for ( posicion = 0; posicion<v3.size(); posicion++){
             System.out.println(v3.elementAt(posicion)+"\t");
        }
        
        
        System.out.println("ELIMINAR VARIOS ELEMENTOS DE LA LISTA ");
        
        v3.remove(4);
        v3.remove(4);
        v3.remove(4);
        v3.remove(4);
         
        for ( posicion = 0; posicion<v3.size(); posicion++){
             System.out.println(v3.elementAt(posicion)+"\t");
        }
        
        
        System.out.println("ELIMINAR TODOS ELEMENTOS DE LA LISTA ");
        
       v3.removeAllElements();
         
        for ( posicion = 0; posicion<v3.size(); posicion++){
             System.out.println(v3.elementAt(posicion)+"\t");
        }
        
        
        //CONVERTIR LA LISTA EN UN ARREGLO
         System.out.println("CONVERTIR LA LISTA EN ARREGLO");
         
         int [] numeros = new int [3];
         
         
         v3.insertElementAt(5, 0); 
         v3.insertElementAt(6,1); 
         v3.insertElementAt(7, 2);
         v3.add(3);
         
         for (posicion = 0; posicion <3; posicion++){
              System.out.print(v3);
         }
   
         
        System.out.print("\n");
         
         //CLONAR UNA LISTA
         System.out.println("CLONAR UNA LISTA");
         
         System.out.print(v3.clone());
         
         
        //CONVERTIR LA LISTA EN UN ARREGLO
         System.out.println("CONVERTIR LA LISTA EN ARREGLO");
         
        int a[],b[],c[];
         
         a = new int [3];
         b = new int [3];
         c = new int [6];
         
        
         
        System.out.println("Digite el primer arreglo");
         for (posicion = 0; posicion <3; posicion++){
              System.out.println((posicion+1+"Digite un numero: "));
         }
          
         
        
         
         
         //ESPACIADOR
          System.out.print("\n");
          System.out.print("\n");
          
          
          
           //LISTA STRING CON LA CLASE VECTOR
          System.out.println("LISTA TIPO STRING CON LINKEDLIST");
          
          //LISTA
          listaString.add("Ray");
          listaString.add("David");
          listaString.add("Victoria");
          listaString.add("Alejandra");
          listaString.add("Nicolas");
          
          System.out.print("\n");
          
          //LISTA 2
          listaString2.add("Arrieta");
          listaString2.add("Herrera");
          listaString2.add("Alvarado");
          listaString2.add("Villalobos");
          listaString2.add("Romero");
          
          
          
          int pos=0;
          
          int tamaño2 = listaString2.size();
          while (pos<tamaño2){
          System.out.print("["+listaString2.get(pos)+"]->");
          pos++;
          }
          
          System.out.print("\n");
          
          int i = 0;
          int tamaño = listaString.size();
          
      
                 
          
          //IMPRIMIR LISTA 1
          
          while (i<tamaño){
          System.out.print("["+listaString.get(i)+"]->");
          i++;
          }
          
          
          
          //IMPRIMIR LISTA 1
          
         
          
          
          System.out.print("\n");
          
          //ELIMINAR PRIMERO
          System.out.println("PRIMER ELEMENTO ELIMINADO CON LINKEDLIST");
          
          listaString.removeFirst();
          tamaño = listaString.size();
          i = 0;
          while (i<tamaño){
          System.out.print("["+listaString.get(i)+"]->");
          i++;
          }
          System.out.print("\n");
          
          //ELIMINAR ULTIMO
          System.out.println("ULTIMO ELEMENTO ELIMINADO CON LINKEDLIST");
          
          listaString.removeLast();
          tamaño = listaString.size();
          i = 0;
          while (i<tamaño){
          System.out.print("["+listaString.get(i)+"]->");
          i++;
          }
          System.out.print("\n");
          
            //ELIMINAR EN LA POSICION X
          System.out.println(" ELEMENTO EN POSICION X ELIMINADO CON LINKEDLIST");
          
          listaString.remove("Victoria");
          tamaño = listaString.size();
          i = 0;
          while (i<tamaño){
          System.out.print("["+listaString.get(i)+"]->");
          i++;
          }
          
          
          //UNIR DOS LISTAS
          
          
          
          
          System.out.print("\n");
          System.out.print("\n");
          
          //LISTA DE OBJETOS CON LA CLASE ARRAYLIST
          System.out.println("LISTA DE OBJETOS CON ARRAYLIST");
          
          listagastos nuevousuario = new listagastos ();
          
          nuevousuario.agregargasto(01, "Ray", 06022022, 10000, "Rayx");
          nuevousuario.agregargasto(02, "David", 06022022, 10000, "Davx");
          nuevousuario.agregargasto(03, "Victoria", 06022022, 10000, "Vicx");
          nuevousuario.agregargasto(04, "Alejandra", 06022022, 10000, "Alex");
          nuevousuario.agregargasto(05, "Nicolas", 06022022, 10000, "Nicx");
          
          nuevousuario.vergasto();
          
          System.out.println("PRIMER ELEMENTO ELIMINADO CON ARRAYLIST");
          
          nuevousuario.eliminargasto(01);
          
          nuevousuario.vergasto();
          
          nuevousuario.buscargasto(3);
          nuevousuario.buscargasto(7);
          
          System.out.print("\n");
          System.out.print("\n");
          //RELLENAR UNA ARREGLO
          
          
          
          System.out.print("p");
          
          
          
          
          
          
    }
    
    


    
}
