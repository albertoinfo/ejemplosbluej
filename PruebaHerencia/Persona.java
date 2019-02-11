

public abstract class Persona
{
    private String nombre;
    private Fecha fechaNacimiento;
    private int dni;
  
    public Persona(String nombre, Fecha fechaNacimiento, int dni) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }
    
    public String getNombre() { return nombre; }
    public Fecha getFechaNacimiento() { return fechaNacimiento; }
    public int getDni()  { return dni; }
    
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setFechaNacimiento(Fecha fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
    public void setDni(int dni) { this.dni = dni; }
    
    public abstract void masInfo(int valor);
    
    public void imprimirDatos() {
        System.out.print("DNI: ");
        System.out.println(dni);
        System.out.println("NOMBRE: " + nombre);
        System.out.print("FECHA DE NACIMIENTO: ");
        fechaNacimiento.imprimir();
        System.out.println();
    }
    
}

