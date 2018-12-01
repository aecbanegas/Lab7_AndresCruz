/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_andrescruz;

import java.io.Serializable;

/**
 *
 * @author MBanegas
 */
public class Comida implements Serializable{
    private static final long SerialVersionUID=1;
    String nombre;
    Double precio;
    int tiempo;
    int cantidad;

    public Comida(String nombre, Double precio, int tiempo, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.tiempo = tiempo;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return nombre + " Precio=" + precio + " Tiempo=" + tiempo ;
    }
    
}
