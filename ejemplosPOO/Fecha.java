
/**
 * Write a description of class Fecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fecha
{
    // Atributos o variables miembros privados
                private static int contador = 0;
		private int dia;
		private int mes;
		private int año;

		// Defino mi propio CONSTRUCTOR
	public Fecha ( int dia, int mes, int año){
		this.dia = dia;
		this.mes = mes;
		this.año = año;
		contador++;
	}
		
	// Defino un constructor por copia
	public Fecha ( Fecha fechaAcopiar){
		this.dia = fechaAcopiar.dia;
		this.mes = fechaAcopiar.mes;
		this.año = fechaAcopiar.año;
	}
		         
	// Redefino el método equals para comparar
	public boolean equals(Fecha objfecha) {
		// Caso especial me pasan un objeto no instanciado / creado
		if (objfecha == null)
			return false;
			
		if ( (año == objfecha.año) && (dia == objfecha.dia) &&
	           (mes == objfecha.mes) )
				return true;
			else 
				return false;
		}

      // RESTO DE MÉTODOS 
		
		
		// Métodos get y set
		public int getDia() {
			return dia;
		}

		
		
		public void setDia(int dia) {
			this.dia = dia;
		}

		public int getMes() {
			return mes;
		}

		public void setMes(int mes) {
			this.mes = mes;
		}

		public int getAño() {
			return año;
		}

		public void setAño(int año) {
			this.año = año;
		}

		// Método toString
		public String toString() {
			return  dia + "/" + mes + "/" + año;
		}

		public void imprimir() {
			System.out.printf(this.toString());
		}
		
                public static boolean esAñoBisiesto(int paño) {

			// Divisible ente 4 y no entre 100 pero si entre 400
			if ((año % 4 == 0) && ((paño % 100 != 0) || (paño % 400 == 0)))
				return true;
			else
				return false;
		}

		
		
		public boolean esAñoBisiesto() {

			// Divisible ente 4 y no entre 100 pero si entre 400
			if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0)))
				return true;
			else
				return false;
		}



}
