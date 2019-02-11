
public class Empleado extends Persona
{
    protected int sueldoBase;
    
    public Empleado(String nombre, Fecha fechaNacimiento, int dni, int sueldoBase) {
        super(nombre, fechaNacimiento, dni);        
        this.sueldoBase = sueldoBase;        
    }
    
    public int getSueldo() { return sueldoBase; }
    public void setSueldo(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.print("SUELDO: ");
        System.out.println(this.getSueldo());
    }
}
