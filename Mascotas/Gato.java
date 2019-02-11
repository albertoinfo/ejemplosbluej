
/**
 * Write a description of class Gato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gato extends Mascota
{
    // instance variables - replace the example below with your own
    private String raza;
    
    
    Gato( String nombre, Sexo vsexo, String raza){
       super(nombre,vsexo);
       this.raza = raza;
    }
    
   public  void decirAlgo(){
       System.out.println("Miauuuu");
    }
   public  void gustosAlimentarios(){
       System.out.println("Quiero pescado");    
    }
    
   public String toString(){ 
    
      return super.toString() + ": Raza ="+ this.raza;
      
    } 
    
   public  Mascota cruzar ( Mascota otra){
       Mascota hijo = null;
       
       if (  (this.getClass() == otra.getClass()) && (this.vsexo != otra.vsexo)) {
           Sexo sexohijo = ( Math.random() >0.5)? Sexo.MACHO: Sexo.HEMBRA;
           String razahijo;
           
           if ( this.raza.equals(((Gato)otra).raza) ){
               razahijo = new String(this.raza);
            }
           else{
               razahijo =  new String("Mezcla");
            }
           hijo = new Gato("", sexohijo, razahijo);
           
        }
       
       
       return hijo;
    }
    
}
