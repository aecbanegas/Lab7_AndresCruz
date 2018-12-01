/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_andrescruz;

import java.util.ArrayList;
import javax.swing.JProgressBar;

/**
 *
 * @author MBanegas
 */
public class Mesa implements Runnable{

    JProgressBar mesa;
    int media;
    boolean vive = false;
    boolean orden = false;
    boolean flag = false;
    boolean comer = false;
    boolean esperar = false;
    ArrayList<Cliente> clientes = new ArrayList();

    public Mesa(JProgressBar mesa) {
        this.mesa = mesa;        
        esperar = true;
    }

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }
    
    public boolean isComer() {
        return comer;
    }

    public void setComer(boolean comer) {
        this.comer = comer;
    }

    public boolean isEsperar() {
        return esperar;
    }

    public void setEsperar(boolean esperar) {
        this.esperar = esperar;
    }
    
    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isOrden() {
        return orden;
    }

    public void setOrden(boolean orden) {
        this.orden = orden;
    }

    public JProgressBar getMesa() {
        return mesa;
    }

    public void setMesa(JProgressBar mesa) {
        this.mesa = mesa;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public void run() {        
            while (vive) {
                if (esperar) {                                        
                    if (mesa.getValue() == mesa.getMaximum()) {
                        mesa.setString("Listo para Ordenar");                        
                        esperar = false;                        
                        mesa.setValue(0);
                    mesa.setMaximum(media);
                    }else{
                        mesa.setMaximum(15);
                        mesa.setValue(mesa.getValue() + 1);
                        mesa.setString(Integer.toString(mesa.getValue()) + " minutos");
                    
                    }
                }
                if (orden) {
                    mesa.setValue(mesa.getValue() + 1);
                        mesa.setString(Integer.toString(mesa.getValue()) + " minutos");                    
                }
                
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }        
    }
}
