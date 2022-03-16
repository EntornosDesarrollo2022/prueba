/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personaBanco;

import java.time.LocalDate;
import java.util.Date;
import jdk.internal.vm.annotation.IntrinsicCandidate;

/**
 *
 * @author Alumno
 */
public abstract class Persona{
    
    protected String nombre;
    protected String apellidos;
    protected String direccion;
    protected String localidad;
    protected LocalDate fNacimiento;
    
    public Persona(String aNombre, String aApellidos, String aDireccion, String aLocalidad, LocalDate aFNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.localidad = localidad;
        this.fNacimiento = fNacimiento;
    }

    
    
    public String nombreCompleto() {
        return getNombre() + " " + getApellidos();
    } //usado para mostrar parte de los datos del cliente

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the localidad
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * @param localidad the localidad to set
     */
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    /**
     * @return the fNacimiento
     */
    public LocalDate getfNacimiento() {
        return fNacimiento;
    }

    /**
     * @param fNacimiento the fNacimiento to set
     */
    public void setfNacimiento(LocalDate fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public int calcular_edad() {
        LocalDate fechaHoy = LocalDate.now();
        LocalDate fNacimiento = this.fNacimiento;
        int edad = fechaHoy.getYear() - fNacimiento.getYear();
        System.out.println("tienes " + edad + " a\u00f1os");
        return edad;
    }
    
}
