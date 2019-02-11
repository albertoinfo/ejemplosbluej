
/**
 * Write a description of class Perro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Perro extends Mascota
{
    // instance variables - replace the example below with your own
    private String raza;
    
    
    Perro( String nombre, Sexo vsexo, String raza){
       super(nombre,vsexo);
       this.raza = raza;
    }
    
   public String toString(){ 
    
      return super.toString() + ": Raza ="+ this.raza;
      
    }
   public  void decirAlgo(){
       System.out.println("Guauu");
    }
   public  void gustosAlimentarios(){
       System.out.println("Quiero huesos");    
    }
   public  Mascota cruzar ( Mascota otra){
       Mascota hijo = null;
       
       if (  (this.getClass() == otra.getClass()) && (this.vsexo != otra.vsexo)) {
           Sexo sexohijo = ( Math.random() >0.5)? Sexo.MACHO: Sexo.HEMBRA;
           String razahijo;
           
           if ( this.raza.equals(((Perro)otra).raza) ){
               razahijo = new String(this.raza);
            }
           else{
               razahijo =  new String("Mezcla");
            }
           hijo = new Perro("", sexohijo, razahijo);
           
        }
       
       
       return hijo;
    }
    
}
