
/**
 * Write a description of class Cobaya here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cobaya extends Mascota
{ 
    
    
    
    Cobaya( String nombre, Sexo vsexo){
       super(nombre,vsexo);
    }
    
   public  void decirAlgo(){
       System.out.println("Iiiihhhh");
    }
   public  void gustosAlimentarios(){
       System.out.println("Quiero lechuga");    
    }
   public  Mascota cruzar ( Mascota otra){
       Mascota hijo = null;
       
       if (  (this.getClass() == otra.getClass()) && (this.vsexo != otra.vsexo)) {
           Sexo sexohijo = ( Math.random() >0.5)? Sexo.MACHO: Sexo.HEMBRA;
           String razahijo;
           hijo = new Cobaya("", sexohijo);
           
        }
       
       return hijo;
    }
    
}
