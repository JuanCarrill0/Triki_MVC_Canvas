/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;


import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author Juan
 */
public class Controlador implements MouseMotionListener, MouseListener{
    
    private final Vista ventana;
    private final Modelo modelo;
    
    public Controlador(Vista v){
        ventana = v;
        modelo= v.getMiModelo();
    }
    

    public void actionPerformed(ActionEvent e) {
        
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("X = "+e.getX() + "Y = "+e.getY());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() instanceof Canvas){
            modelo.mostrarCeldaSeleccionada(e.getX(), e.getY());
            modelo.establecerTurnoJugado();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
