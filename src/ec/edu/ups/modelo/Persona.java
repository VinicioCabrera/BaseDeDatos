/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;


import java.util.Date;


/**
 *
 * @author Eduardo Ayora
 */
public class Persona {

    private String cedula;
    private String nombre;
    private String apellido;
    private int edad;
    private Date fechaNacimiento;
    private String celular;
    private Double salario;

    public Persona() {
    }

    public Persona(String cedula, String nombre, String apellido, int edad, Date fechaNacimiento, String celular, Double salario) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.celular = celular;
        this.salario = salario;
    }
    
    

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento)  {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
      this.celular = celular;

    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
     this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre)  {
        this.nombre = nombre; 
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) throws Exception {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        this.edad = edad;

    }

}
