package com.meet.restapicliente.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "PRODUCTOS")
public class Productos {


    @Id
    @Column (name = "IDPRODUCTO")
    private int IdProducto;

    @Column (name = "NOMBRE")
    private String nombre;

    @Column (name = "PRECIO")
    private int precio;

    public Productos() {
    }

    public Productos(int idProducto, String nombre, int precio) {
        IdProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int idProducto) {
        IdProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
