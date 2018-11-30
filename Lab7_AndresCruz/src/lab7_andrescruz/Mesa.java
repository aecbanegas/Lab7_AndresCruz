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
    boolean flag=false;
    ArrayList<Cliente>clientes=new ArrayList();

    public Mesa(JProgressBar mesa) {
        this.mesa = mesa;
        vive=true;
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
    
    public void run(){
        if (!clientes.isEmpty()) {
            while(vive){
            System.out.println("Aqui");
            if (clientes.size()<4&&(mesa.getMaximum()>mesa.getValue())) {
                mesa.setMaximum(15);
                mesa.setValue(mesa.getValue()+1);
                mesa.setString(Integer.toString(mesa.getValue())+" minutos");
            }
            if (clientes.size()==4&&(mesa.getMaximum()>mesa.getValue())) {
                mesa.setMaximum(1);
                mesa.setValue(mesa.getValue()+1);
                mesa.setString(Integer.toString(mesa.getValue())+" minutos");
            }
            if (mesa.getValue()==mesa.getMaximum()) {
                mesa.setString("Listo para Ordenar");
                vive=false;
            }
            System.out.println("hasta aqui");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            }
        }
    }
}
