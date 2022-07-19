package com.meet.restapicliente.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;


//*** CLASE ENTITY CON SUS VARIABLES DE INSTANCIA ***
@Entity
@Table(name="CLIENTES")
public class Cliente {
    @Id
    @Column(name="DNI")
    private Integer dni;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name="APELLIDO")
    private String apellido;

    @Column(name= "FECHANACIMIENTO")
    private Date fechanacimiento;


    //**** CONSTRUCTOR VACIO  ****


    public Cliente() {
    }


    //**** CONSTRUCTOR CON PARAMETROS ****
    public Cliente(Integer dni, String nombre, String apellido, Date fechanacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechanacimiento = fechanacimiento;
    }

    //*** GETTERS AND SETTERS ***


    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }
}
