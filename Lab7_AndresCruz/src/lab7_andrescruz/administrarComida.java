/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_andrescruz;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author MBanegas
 */
public class administrarComida {
       ArrayList<Comida>lista=new ArrayList();
    File archivo=null;
    administrarComida(String Path){
    archivo=new File(Path);
    }
    public File getArchivo() {
        return archivo;
    }

    public ArrayList<Comida> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Comida> lista) {
        this.lista = lista;
    }
    
    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public void setComida(Comida comida){
        lista.add(comida);
    }
        public void cargarArchivo() {
        try {            
            lista = new ArrayList();
            Comida temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Comida) objeto.readObject()) != null) {
                        lista.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Comida t : lista) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }

}
