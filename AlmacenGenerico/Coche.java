
public class Coche  implements Comparable<Coche> {
	// Definir los atributos
	private String matricula; 
	private String modelo;  //  Una cadena con el modelo de vehículo.
	private boolean motor;  // Arrancado o parado ( true / false)
	private int velocidad;  // velocidad en km/h
	private int velocidadMax; // Máxima velocidad con la que puede circular el vehículo  
	public int distanciaParcial;
	public int distanciaTotal;
	// Definir los métodos
	
	// Constructor
	Coche ( String matricula, String modelo, int velocidadMax){
		this.matricula = matricula;
		this.modelo = modelo;
		this.distanciaParcial = 0;
		this.distanciaTotal = 0;
		this.velocidad = 0;
		this.velocidadMax = velocidadMax;
		this.motor = false;	
	}
	
	// Arranca el motor
	public boolean arrancar(){
	  if ( motor ){
		  infoError("Motor ya arrancado");
		  return false;
	  }
	  else{
		  motor = true;
		  return true;
	  }
	}

	// Para el motor
	public boolean parar(){
		if ( !motor ){
			  infoError("Motor ya esta parado");
			  return false;
		  }
		  else{
			  motor = false;
			  velocidad = 0;
			  distanciaParcial = 0;
			  return true;
		  }	
	}

	// Acelera, incrementa la velocidad
	public boolean acelera( int cantidad){
		if ( motor){
			velocidad = velocidad + cantidad;
			// Control de la velocidad Máxima
			if ( velocidad > velocidadMax){
				velocidad = velocidadMax;
			}
			return true; 	
		}
		else{
			infoError(" Motor parado. No se puede acelerar");
			return false;
		}
	}
	
   // Frena, reduce la velocidad
   public boolean frena ( int cantidad){
	   if ( motor){
			velocidad = velocidad - cantidad;
			// Control de la velocidad Mínima 0
			if ( velocidad < 0){
				velocidad = 0;
			}
			return true; 	
		}
		else{
			infoError(" Motor parado. No se puede frenar");
			return false;
		}	
	}
	
   // Incremeta la distancia en función de la velocidad
   public boolean recorre (){
	   if ( motor){
		     // Incremento la velocidad
			distanciaParcial += velocidad;
			distanciaTotal   += velocidad;
			return true; 	
		}
		else{
			infoError(" Motor parado. No se puede avanzar ");
			return false;
		}
   }
	
   // Información completa del coche
   public String info(){
	   return this.modelo+ " Motor encendido: "+ motor
              + " km :"+ distanciaParcial +" Velocidad:"+ velocidad;
   }
	
// Información gráfica coche con recorriodo en asteriscos
   public String infog(){
	   StringBuilder msg = new StringBuilder();
	    
	   msg.append(String.format("%-15s:", modelo));
	   for (int i=1; i <= distanciaParcial/10; i++){
		   msg.append('*');
	   }
	   return msg.toString();
   }
   
   // Devuelve la distancia recorrida hasta ahora
   public int getKilometros(){
	   return distanciaParcial;
   }
   
   // Muestra un mensaje por la salida estándar de errores
   private void infoError( String mensaje){
	   System.err.println(mensaje);
   }

   
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Coche other = (Coche) obj;
	if (matricula == null) {
		if (other.matricula != null)
			return false;
	} else if (!matricula.equals(other.matricula))
		return false;
	return true;
}



@Override
public String toString() {
	return "Coche [matricula=" + matricula + ", modelo=" + modelo + "]";
}

@Override
public int compareTo(Coche o) {
	   
	return  o.distanciaParcial - this.distanciaParcial;
}	


}
