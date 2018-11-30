
package lab7_andrescruz;

import java.io.Serializable;


public class Cliente implements Serializable{
    String nombre;
    String apellido;
    String tarjeta;
    Double cargo;
    Double billetera;
    String recibos;
    boolean unitec;
    String cuenta;

        private static final long SerialVersionUID=1;
        
    public Cliente(String nombre, String apellido, String tarjeta, Double billetera, boolean unitec, String cuenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tarjeta = tarjeta;
        this.cargo = 0.0;
        this.billetera = billetera;
        this.recibos = "";
        this.unitec = unitec;
        if (this.unitec) {
        this.cuenta = cuenta;    
        }else{
        this.cuenta="0";
        }
        
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

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Double getCargo() {
        return cargo;
    }

    public void setCargo(Double cargo) {
        this.cargo = cargo;
    }

    public Double getBilletera() {
        return billetera;
    }

    public void setBilletera(Double billetera) {
        this.billetera = billetera;
    }

    public String getRecibos() {
        return recibos;
    }

    public void setRecibos(String recibos) {
        this.recibos = recibos;
    }

    public boolean isUnitec() {
        return unitec;
    }

    public void setUnitec(boolean unitec) {
        this.unitec = unitec;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
