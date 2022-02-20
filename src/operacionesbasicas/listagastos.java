
package operacionesbasicas;

import java.util.ArrayList;

public class listagastos {
    
    
    private ArrayList<gastos> Listgastos;
    
    public listagastos (){
         
        Listgastos = new ArrayList<>();
        
     }
    
    public void eliminargasto (int id){
       for (int i = 0; i<Listgastos.size();i++){
            if (id == Listgastos.get(i).getId()){
                Listgastos.remove(i);
            }
       }
    }
    
    public void agregargasto (int id, String nombre, int fecha, double valor, String usuario){
       gastos nuevo = new gastos (id,nombre,fecha,valor,usuario);
       Listgastos.add(nuevo);
   }
    
    public void buscargasto (int id){
         for (int i = 0; i<Listgastos.size();i++){
            if (id == Listgastos.get(i).getId()){
                {System.out.println("DATO ENCONTRADO");}
                System.out.println(Listgastos.get(i).getId()+" "+Listgastos.get(i).getNombre()+" "+Listgastos.get(i).getFecha()+" "+Listgastos.get(i).getValor()+" "+Listgastos.get(i).getUsuario());
            } 
            
       } 
    }
    
    public void vergasto (){
      for (int i = 0; i<Listgastos.size();i++){
         System.out.println(Listgastos.get(i).getId()+" "+Listgastos.get(i).getNombre()+" "+Listgastos.get(i).getFecha()+" "+Listgastos.get(i).getValor()+" "+Listgastos.get(i).getUsuario());
      }
    }
    
    
}
