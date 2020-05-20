package Grafico;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import javax.swing.JPanel;
/**
 *
 * @author hp
 */
public class panelImagen extends JPanel implements Runnable{
MediaTracker tracker ;  
Image imagen;
String dirFondo="";
Toolkit herram;

    
    public panelImagen(String direccionFondo) {
    this.dirFondo=direccionFondo;
    
    inicioComponentes();
    }
    
    private void inicioComponentes(){
        tracker = new MediaTracker(this);
        herram= Toolkit.getDefaultToolkit();//todo este bloque solo es para que cargue la imagen de fondo
        imagen = herram.getImage(getClass().getResource(dirFondo));
        //linea para cuando ya se compile
        //imagen = herram.getImage(System.getProperty("user.dir")+dirFondo);
        tracker.addImage(imagen, 1);
            try {
                tracker.waitForAll();
            } catch (InterruptedException e) {
                System.out.println("no cargo");
            }
        setLayout(null);
        this.setBackground(new Color(0, 0, 0, 0));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //Dibujamos el fondo con bajos graficos
        g.drawImage(imagen, 0, 0, this.getWidth(),this.getHeight(), this);
        
        //g.drawImage(imagen, 0, 0, this.getWidth(),this.getHeight(), new Color(0, 0, 0, 200), this);
    }

    @Override
    public void run() {
        while(true){
            this.repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println("error");
            }
        }
    }


    
    
}
