/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_andrescruz;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

public class administrarTiempo implements Runnable{
    private JLabel hora;
    private boolean vive;
    private Date b=new Date();
    private int cont=0;

    public administrarTiempo(JLabel hora) {
        this.hora = hora;
        vive=true;
        b.setHours(12);
        b.setMinutes(0);
        b.setSeconds(0);
    }
    public void run(){
        while(vive){        
        DateFormat f= new SimpleDateFormat("hh:mm:ss");
        hora.setText(f.format(b));
        b.setMinutes(b.getMinutes()+1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                
            }
            if (b.getHours()==4) {
                cont++;
            }
            if (cont==2) {
                vive=false;
            }
        }
    }
}
