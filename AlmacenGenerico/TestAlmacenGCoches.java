import java.util.Scanner;
// Test Almacen Generico con Coche
public class TestAlmacenGCoches {


	static public void main(String[] argv) {

		AlmacenG <Coche> prueba = new <Coche> AlmacenG();
		
		Scanner sc = new Scanner(System.in);
		int opcion;

		mostrarMenu();
		opcion = sc.nextInt();
		while (opcion != 0) {
			procesarOpcion(opcion, prueba);
			mostrarMenu();
			opcion = sc.nextInt();
		}
		sc.close();

	}

	static void mostrarMenu() {
		System.out.println("--- MENÚ DE  CONTROL COCHES -----");
		System.out.println(" 1.- Mostrar contenido del Almacén");
		System.out.println(" 2.- Poner un Valor  ");
		System.out.println(" 3.- Buscar un Valor ");
		System.out.println(" 4.- Borrar un Valor");
		System.out.println(" 5.- Contar posiciones ocupadas.");
		System.out.println(" 6.- Contar posiciones libres.");
		System.out.println(" 7.- Empaquetar");
		System.out.println(" 0.- Terminar");
		System.out.print(" Introduzca una opción:[1-6]:");
	}

	// Procesa la opción introducida operando sobre el objeto AlmacenG
	@SuppressWarnings("unchecked")
	static void procesarOpcion(int opcion, AlmacenG parAlmacen) {
		Scanner entrada = new Scanner(System.in);
		Integer velocidad;
		String modelo;
		String matricula;

		switch (opcion) {
		case 1:
			System.out.println("Almacen = " + parAlmacen);
			break;
		case 2:
			System.out.print("Matricula a buscar:");
			matricula = entrada.nextLine();
			System.out.print("Modelo de coche:");
			modelo = entrada.nextLine();
			System.out.print("Velocidad máxima:");
			velocidad = entrada.nextInt();
			if (parAlmacen.ponValor(new Coche(matricula,modelo,velocidad)) ) {
				System.out.println(" Valor introducido.");
			} else {
				System.out.println(" Error: Valor no introducido.");
			}
			break;
		case 3:
			System.out.print("Matricula a buscar:");
			matricula = entrada.nextLine();
			  // Recibe un coche
			if (parAlmacen.estaValor(new Coche (matricula,null,0))) {
				System.out.println(" El valor está almacenado.");
			} else {
				System.out.println(" El valor No está almacenado.");
			}
			break;
		case 4:
			System.out.print("Matricula a Eliminar:");
			matricula = entrada.nextLine();
			if (parAlmacen.sacarValor(matricula)) {
				System.out.println(" Valor Eliminado.");
			} else {
				System.out.println(" Error: Valor no Eliminado");
			}
			break;
		case 5:
			System.out.println(" Posiciones Ocupadas = " + parAlmacen.numPosicionesOcupadas());
			break;
		case 6:
			System.out.println(" Posiciones libres = " + parAlmacen.numPosicionesLibres());
			break;
		case 7:
			System.out.println("Empaquetando..."); parAlmacen.empaquetar();
			break;
		}
        
	}

	
}
