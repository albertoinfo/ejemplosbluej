

public class EmpleadoComision extends Empleado
{
    private double porcentajeComision;
    private int dineroVentas;

    /**
     * Constructor for objects of class EmpleadoComision
     */
    public EmpleadoComision(String nombre, Fecha fechaNacimiento, int dni, int sueldoBase,
        double porcentajeComision)
    {
        super(nombre, fechaNacimiento, dni, sueldoBase);
        this.porcentajeComision = porcentajeComision;
        this.dineroVentas = 0;
    }
    
    public double getPorcentajeComision() { return porcentajeComision; }
    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;        
    }
    
    public void vender(int dineroVenta) {
        this.dineroVentas += dineroVenta;
    }
    
    public int getSueldo() {
        return super.getSueldo() + (int) (dineroVentas * porcentajeComision / 100.0);
    }
}
