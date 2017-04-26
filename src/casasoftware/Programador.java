package casasoftware;

public class Programador extends Empleado {
    protected String lenguaje;

    public Programador(int id, String nombre, double salario, String lenguaje) 
            throws NombreExcepcion, SalarioExcepcion, LenguajeExcepcion {
        super(id, nombre, salario);
        if( lenguaje.equalsIgnoreCase("go"))
            throw new LenguajeExcepcion();
        this.lenguaje = lenguaje;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
    
    

    @Override
    public double calcularSalario() {
        double bonificacion = 0;
        if(this.lenguaje.equals("java"))
            bonificacion = this.salario*0.2;
        return this.salario;
    }

    @Override
    public String mostrarInformacion() {
        return "Programador" + this.nombre +  " " +  this.id;
    }

    public Iterable<Programador> getEquipo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}