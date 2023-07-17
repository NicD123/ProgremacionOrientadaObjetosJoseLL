

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Saul
 */
public class LaminaBotones extends JPanel{
    public LaminaBotones(){
        JButton botonEscaleno = new JButton("Escaleno");
        JButton botonEquilatero = new JButton("Equilatero");
        JButton botonIsoseles = new JButton("Isoseles");
        
        add(botonEscaleno);
        add(botonEquilatero);
        add(botonIsoseles);
        
        AccionColor accionEquilatero = new AccionColor(Color.BLUE,1);
        AccionColor accionEscaleno = new AccionColor(Color.YELLOW,2);
        AccionColor accionIsoseles = new AccionColor(Color.RED,3);
        
        botonEscaleno.addActionListener(accionEscaleno);
        botonEquilatero.addActionListener(accionEquilatero);
        botonIsoseles.addActionListener(accionIsoseles);
    }
    public class AccionColor implements ActionListener {
        
        private Color colorDeFondo;
        public int tipo;
        public double lado1;
        public double lado2;
        public double lado3;
        public double perimetro;
        public double area;
        
        Triangulo objetoCalculo = new Triangulo(); 
        
        public AccionColor(Color c, int a){
            colorDeFondo = c;
            tipo = a;
        }
        
        public void actionPerformed(ActionEvent envento){
            String L1;
            String L2;
            String L3;
            String LA;
            setBackground(colorDeFondo);
            L1 = JOptionPane.showInputDialog("¿Tamaño del lado 1?");
            switch(tipo){
                case 1:
                    
                    LA = JOptionPane.showInputDialog("¿Altura?");

                    lado1 = Integer.parseInt (L1);
                    lado2 = Integer.parseInt (LA);
                    objetoCalculo.cambiarDatos(tipo, lado1, lado2);
                    perimetro = objetoCalculo.perimetro();
                    area = objetoCalculo.area();
                    JOptionPane.showMessageDialog(null, "con el triangulo dado de lados "+ lado1 +" y altura " + lado2 +"\n\n El perimetro es: " + perimetro + "\n\n El area es: " + area);
                    break;
                case 2:
                    
                    L2 = JOptionPane.showInputDialog("¿Tamaño del lado 2?");
                    L3 = JOptionPane.showInputDialog("¿Tamaño del lado 3?");
                    
                    lado1 = Integer.parseInt (L1);
                    lado2 = Integer.parseInt (L2);
                    lado3 = Integer.parseInt (L3);

                    objetoCalculo.cambiarDatos(tipo, lado1, lado2,lado3);
                    perimetro = objetoCalculo.perimetro();
                    area = objetoCalculo.area();
                    JOptionPane.showMessageDialog(null, "con el triangulo dado de lados: "+ lado1 +", " + lado2 +", "+lado3+"\n\n El perimetro es: " + perimetro + "\n\n El area es: " + area);
                    break;
                    
                case 3:
                    
                    L1 = JOptionPane.showInputDialog("¿Tamaño del lado 2?");
                    L3 = JOptionPane.showInputDialog("¿Tamaño del lado 3?");

                    lado1 = Integer.parseInt (L1);
                    lado2 = lado1;
                    lado3 = Integer.parseInt (L3);
                    objetoCalculo.cambiarDatos(tipo, lado1, lado2,lado3);
                    perimetro = objetoCalculo.perimetro();
                    area = objetoCalculo.area();
                    JOptionPane.showMessageDialog(null, "con el triangulo dado de lados:"+ lado1 +" y base " + lado2 +"\n\n El perimetro es: " + perimetro + "\n\n El area es: " + area);
                    break;
                default:
                    break;
                    
            }
        }
    }
}
