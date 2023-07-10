
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Saul
 */
public class MarcoBotones extends JFrame {
    public static final int ANCHURA_PREFIJADA = 300;
    public static final int ALTURA_PREFIJADA = 200;
    
    public MarcoBotones(){
        setTitle("Prueba de Botones");
        setSize(ANCHURA_PREFIJADA, ALTURA_PREFIJADA);
        LaminaBotones lamina =new LaminaBotones();
        add(lamina);
    }
}
