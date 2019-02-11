/**
 * Abstract class Mascota - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Mascota
{
   
    protected String nombre;
    protected Sexo vsexo;
    
    public Mascota (String nombre, Sexo vsexo){
        
       this.nombre = nombre;
       this.vsexo = vsexo;
    }
    
   public String toString(){
       
       return "Mi nombre es "+nombre + " Sexo = "+vsexo;
       
    }
   public abstract void decirAlgo();
   public abstract void gustosAlimentarios();
   public abstract Mascota cruzar ( Mascota otra);
}
