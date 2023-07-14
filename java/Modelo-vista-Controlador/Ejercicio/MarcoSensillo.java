/**
 *
 * @author Saul
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MarcoSensillo extends JFrame {
    public MarcoSensillo( String a) {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = kit.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchuraPantalla = tamanoPantalla.width;
        JLabel label = new JLabel ( "En este programa usted podra calcular el el perimetro y area de un triangulo");
        LaminaBotones lamina = new LaminaBotones();
        
        setSize( anchuraPantalla, alturaPantalla);
        setTitle(a);
        add(lamina);
        add(label);
    }
}
