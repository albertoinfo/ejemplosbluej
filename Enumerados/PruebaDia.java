
/**
 *  Pueba de la clase de enumerado Dia y los metodos comunes de un enumerado
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class PruebaDia
{
    public static void main ( String argv[] ){
       
        Dia diaL = Dia.LUNES;
        Dia diaD = Dia.DOMINGO;
        // Muestra como cadena asociada a su valor
        System.out.println(" Hoy es "+ diaL);
        // Muestra el número de orden
        System.out.println(" Nº de día: " + diaL + ":"+ diaL.ordinal()); 
        System.out.println(" Nº de día: " + diaD + ":"+ diaD.ordinal()); 
        
        // Se pueden comparar
        if ( diaL.compareTo(Dia.LUNES) == 0) System.out.println ( " Si, diaL es un lunes");
        
        // Recorrer todos los días de la semana
        System.out.println(" Todos los días de la semana:");
        for ( Dia undia: Dia.values() ){
            // Numero de orden : nombre
            System.out.println ( undia.ordinal()+":"+ undia.name() );
        }
        
        // Se puede obtener un valor enumerado a partir del valor de una cadena:
        System.out.print(" Introduce un día de la semana:");
        Scanner sc = new Scanner(System.in);
        String valor =  sc.nextLine();
        // Ojo si falla se genera una excepcion si en nombre no es igual a los definidos en el enumerado
        Dia nuevo = Dia.valueOf(valor);
        System.out.println (" Has introducido el día :"+ nuevo);
        
        
        
    }
}
