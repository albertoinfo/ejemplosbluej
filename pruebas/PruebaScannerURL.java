
/**
 * Write a description of class PruebaScannerURL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.net.URL;

public class PruebaScannerURL
{
    // instance variables - replace the example below with your own
    
    public static void  contar ( String direccion ) throws Exception{
       

         Scanner sc = new Scanner(new URL(direccion).openStream());
         String input;
         int count = 0;

         
          while ( sc.hasNextLine() ){
          input = sc.nextLine();
          int index = input.indexOf("<img");

          while (index != -1) {
                count++;
                System.out.println(input.substring(index));
                input = input.substring(index + 1);
                index = input.indexOf("<img");    
            }
         }  
            System.out.println("Existen " + count +" imagenes ");

        }
         
    
    public PruebaScannerURL()
    {
       
    }

   }
