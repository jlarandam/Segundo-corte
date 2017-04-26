/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casasoftware;

/**
 *
 * @author Estudiante
 */
public class Admon extends Empleado {

    public Admon(int id, String nombre, double salario)
        throws NombreExcepcion, SalarioExcepcion{
        super(id, nombre, salario);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    

    @Override
    public double calcularSalario() {
        return 200;
    }

    @Override
    public String mostrarInformacion() {
        return "Admon"+this.nombre + " "+ this.id;
    }
    
}
