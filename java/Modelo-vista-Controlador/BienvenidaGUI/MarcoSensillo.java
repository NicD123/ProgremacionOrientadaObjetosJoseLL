/**
 *
 * @author Saul
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MarcoSensillo extends JFrame {
    public MarcoSensillo() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = kit.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchuraPantalla = tamanoPantalla.width;
        
        setSize( anchuraPantalla, alturaPantalla);
        setTitle("Marco sencillo");
    }
}
