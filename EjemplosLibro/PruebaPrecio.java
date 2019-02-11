
/**
 * Write a description of class PruebaPrecio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PruebaPrecio {
    
  public static void main (String arg[]){
      Precio p;
      p = new Precio();
      p.pone(56.8);
      
      System.out.println(" Valor dolar -> Euro " + Precio.conversionDolar());
      System.out.println("Valor = " + p.da());
      // Llamada al metodo da
      // que devuelve el valor de euros
      Precio q = new Precio();
      Precio q2 = q;
      // Crea una referencia y el objeto
      q.pone(75.6);
      q = p;
      // Asigna 75.6 al atributo euros
      System.out.println("Valor = " + q2.da());
    }
}









