
// ---- PROGRAMAR EL RESTO DE LOS MÉTODOS ----

public class CuentaBancaria {	

      // -------------------------------------
	// Atributos de Clase 
	// -------------------------------------
	
	private int saldo;          // Saldo actual de la cuenta
	private int numMovimientos; // Número de movimientos realizados
	
	// -------------------------------------
	//   METODOS:
	// -------------------------------------
	
	// Constructores
	public CuentaBancaria( int saldo){
	   this.saldo = saldo;
	   this.numMovimientos = 0;
	}
    
	public CuentaBancaria(){
		this(0); // Llamo al primer constructor 
	}
	
	// Resto de los MÉTODOS
	
	//Ingreso, incrementa el saldo en una cantidad indicada como parámetro.
	public void ingreso (int cantidad){
		 saldo = saldo + cantidad;
		 numMovimientos++;
	}
	
	// Abono, decremento el saldo en la cantidad indicada como parámetro.
	public void abono (int cantidad){
		saldo = saldo - cantidad;
		 numMovimientos++;
		
	}
	
	// Anotar gastos decrementa el saldo en 20 euros si 
      // el saldo de la cuenta es menor 1000
	public void anotarGastos(){
		if ( saldo < 1000){
		   saldo = saldo - 20;	
		}
		numMovimientos++;
	}
	
	// Anotar Intereses incrementa la cuenta según valor de interés indicado
	// como parámetro en tanto por ciento.  
	public void anotarIntereses ( int interes){
		saldo = saldo + (saldo*interes)/100;
		numMovimientos++;
	}
	
	//Realizar transferencia a cuenta, decrementa el saldo 
    // en la cantidad indicada
	// como parámetro, realizando un ingreso en la cuenta destino.
	public void transferencia ( int importe, CuentaBancaria destino){
	    this.abono(importe);
	    destino.ingreso(importe);
	}
	
	// Consultar estado de la cuenta, mostrá el saldo actual y
      // el número de operaciones realizadas
	public String consultarEstado (){
		return " Saldo = "+ saldo + " Nº operaciones = "+ numMovimientos;
	}
}
		