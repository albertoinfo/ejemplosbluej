
/**
 * Write a description of class TiendaAnimales here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TiendaAnimales
{
   
    static public void main ( String argv[]){
     
        Mascota  tanimales []  = new Mascota [5];
        
        
        tanimales[0] = new Gato ("Felix",Sexo.MACHO,"siames");
        tanimales[1] = new Perro ("Toby",Sexo.MACHO,"mezcla");
        tanimales[2] = new Gato ("Mimi",Sexo.HEMBRA,"siames");
        tanimales[3] = new Cobaya ("Bola",Sexo.MACHO);
        tanimales[4] = new Cobaya ("Peluso",Sexo.MACHO);
        
        for (int i= 0; i< tanimales.length; i++){
          System.out.println("ANIMAL :"+i+"-->"+ tanimales[i]);
          tanimales[i].decirAlgo();
          tanimales[i].gustosAlimentarios();  
        }
        
        Gato gatito = new Gato ("Bigotes",Sexo.MACHO,"persa");
        
        for (int i= 0; i< tanimales.length; i++){    
            Mascota hijo = gatito.cruzar(tanimales[i]);
            if ( hijo != null ){
               System.out.println("Padre "+ gatito);
               System.out.println("Madre "+ tanimales[i]);
               System.out.println("ANIMAL :"+ hijo);
               hijo.decirAlgo();
               hijo.gustosAlimentarios();  
            }
            else{
             System.out.println("A Bigotes no le mola "+tanimales[i]);   
            }
         
        }
        
        
        
        
        
        
        
        
        
        
        
        
  }

}
