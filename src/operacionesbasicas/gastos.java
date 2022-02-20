
package operacionesbasicas;


import java.text.SimpleDateFormat;
import java.util.Date; 

public class gastos {
    
    private int id;
    private String nombre;
    private int fecha;
    private double valor;
    private String usuario;

    public gastos(int id, String nombre, int fecha, double valor, String usuario) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.valor = valor;
        this.usuario = usuario;
    }
    
    

    public gastos() {
      
    }
    


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
  /*  public String formatearFecha (){
       SimpleDateFormat fsf = new SimpleDateFormat ("dd/mm/yyyy");
       String formatearFecha = fsf.format(fecha);
       return formatearFecha;
    }*/

    @Override
    public String toString() {
        return "gastos{" + "id=" + id + ", nombre=" + nombre + ", fecha=" + fecha + ", valor=" + valor + ", usuario=" + usuario + '}'+"\n";
    }
    
    
    
    
}
