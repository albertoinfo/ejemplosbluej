import java.util.Arrays;

/*
 * Implementación de un clase Generica 
 */

public class AlmacenG <Tipo> {
	// No puede ser Estática pues depende del tipo generico
	private final Tipo LIBRE = null;
	// Array con los valores almacenados
	private Tipo tvalores[];
	private int valoresAlmacenados = 0;

	// Constructores sin parámetros creo una tabla de 10 elementos
	public AlmacenG() {
		this(10); // Llamo al constructor con parámetros
	}

	// Constructor donde se fija tamaño máximo del Almacén
	public AlmacenG(int tamaño) {
		// No puedo crear directamente una tabla de Genericos
		tvalores =  (Tipo[]) new Object [tamaño];
		init();
	}

	// Pone todas las posiciones a LIBRES
	public void init() {
		for (int i = 0; i < tvalores.length; i++) {
			tvalores[i] = LIBRE;
		}
		valoresAlmacenados = 0;
	}

	// Muestra una cadena con los valores de la tabla
	public String toString() {
		return Arrays.toString(tvalores);
	}

	// Devuelve el números de posiciones libres
	public int numPosicionesLibres() {
		return tvalores.length - valoresAlmacenados;
	}

	// Devuelve el número de posiones ocupadas
	public int numPosicionesOcupadas() {
		return valoresAlmacenados;
	}

	// Devuelve verdadero o falso si está almacenado el valor en la tabla
	public boolean estaValor(Tipo num) {
		boolean esta = false;
		
		for (int i = 0; i < tvalores.length; i++) {
			if (tvalores[i] != LIBRE && tvalores[i].equals(num)) {
				esta = true;
				break;
			}
		}
		return esta;
	}

	// Almacena el valor el la tabla, devuelve false sin no puede almacenarlo
	public boolean ponValor (Tipo num){
		boolean colocado = false;
		for (int i = 0; i < tvalores.length; i++) {
			  if ( tvalores[i] == LIBRE){
				  tvalores[i] = num;
				  valoresAlmacenados++;
			      colocado = true;
				  break;
			  }
		}			
	return colocado;
	}

	// Elimina el elemento de la tabla, si no esta devuelve false
	public boolean sacarValor(Tipo num) {
		boolean eliminado = false;
		for (int i = 0; i < tvalores.length; i++) {
			if (tvalores[i] != LIBRE && tvalores[i].equals(num)) {
				tvalores[i] =  LIBRE;
				valoresAlmacenados--;
				eliminado = true;
				break;
			}
		}
		return eliminado;
	}

	// Indica si el almacén esta lleno
	public boolean estaLleno() {
		return (valoresAlmacenados == tvalores.length);
	}
	
	// Elimina los huecos intermedios
	public void empaquetar (){
		int izda = 0;
		int dcha = tvalores.length -1;
		while ( izda < dcha){
			// Si hay un hueco a la izquierda muevo el valor de la derecha
			if ( (tvalores [izda] == LIBRE) && (tvalores[dcha] != LIBRE)){
				tvalores[izda] = tvalores[dcha];
				tvalores[dcha] = LIBRE;
				izda++;
				dcha--;
			}
			if ( tvalores [izda]!= LIBRE){
				izda++;
			}
			if ( tvalores [dcha] == LIBRE){
				dcha--;
			}
		}
	}
}


