

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Saul
 */
public class LaminaBotones extends JPanel{
    public LaminaBotones(){
        JButton botonAmarillo = new JButton("Amarillo");
        JButton botonAzul = new JButton("Azul");
        JButton botonRojo = new JButton("Rojo");
        
        add(botonAmarillo);
        add(botonAzul);
        add(botonRojo);
        
        AccionColor accionAmarillo = new AccionColor(Color.YELLOW);
        AccionColor accionAzul = new AccionColor(Color.BLUE);
        AccionColor accionRojo = new AccionColor(Color.RED);
    }
    private class AccionColor implements ActionListener {
        private Color colorDeFondo;
        public AccionColor(Color c){
            colorDeFondo = c;
        }
        public void actionPerformed(ActionEvent envento){
            setBackground(colorDeFondo);
        }
    }
}
