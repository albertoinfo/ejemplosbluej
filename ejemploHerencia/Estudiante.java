

public class Estudiante extends Persona
{
    private int puntos;
    private int numeroCalificaciones;
    
    public Estudiante(String nombre, Fecha fechaNacimiento, int dni) {
        super(nombre, fechaNacimiento, dni);
        this.puntos = 0;
        this.numeroCalificaciones = 0;
    }
    
    public void nuevaCalificacion(int puntos) {
        numeroCalificaciones++;
        this.puntos += puntos;
    }
    
    public double getNotaMedia() {
        return ((double) puntos) / numeroCalificaciones;
    }
    
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.print("NOTA MEDIA: ");
        System.out.println(getNotaMedia());
    }

}
