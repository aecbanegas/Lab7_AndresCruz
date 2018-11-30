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
public class Mesa extends Thread{
    JProgressBar mesa;
    boolean vive=false;
    boolean orden=false;
    ArrayList<Cliente>clientes=new ArrayList();

    public Mesa(JProgressBar mesa) {
        this.mesa = mesa;
        vive=true;
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
    
    public void run(){
        if (!clientes.isEmpty()) {
            if (clientes.size()<4&&(mesa.getMaximum()>mesa.getValue())) {
                mesa.setMaximum(15);
                mesa.setValue(mesa.getValue()+1);
            }
            if (clientes.size()==4&&(mesa.getMaximum()>mesa.getValue())) {
                mesa.setMaximum(1);
                mesa.setValue(mesa.getValue()+1);
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
