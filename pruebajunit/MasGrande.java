
/**
 * Clase de prueba de JUnit
 * 
 * @author  Alberto Lopez
 * @version 14/01/2019
 */
public class MasGrande
{
   

    /**
     * Funcion que devuelve el valor maximo de un array de enteros
     * 
     * @param  a   Array de entero
     * @return     valor maximo 
     */
    public static int max(int [] a)
    {
       int maximo = Integer.MIN_VALUE;
       for (int i=0; i < a.length; i++) {
           if ( a[i] > maximo){
               maximo = a[i];
            }
        }
       return maximo; 
       
    }
}
