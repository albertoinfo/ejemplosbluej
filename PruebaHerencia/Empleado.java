
public class Empleado extends Persona
{
    protected int sueldoBase;
    
    public Empleado(String nombre, Fecha fechaNacimiento, int dni, int sueldoBase) {
        super(nombre, fechaNacimiento, dni);        
        this.sueldoBase = sueldoBase;        
    }
    
    public abstract int getSueldo(); 
    
    public void setSueldo(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    
    public void masInfo(int valor){
        System.out.println(" Soy un empleado ");
    }    
    
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.print("SUELDO: ");
        System.out.println(this.getSueldo());
    }
}
