/**
 *
 * @author Saul
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BienvenidaSw{
	public static void main(String[] args){

		JFrame frame = new JFrame("Bienvenida");
		final JLabel label = new JLabel("\n\tBienvenidos al mundo de la programacion orientada a objetos");

		frame.getContentPane().add(label);
		frame.addWindowListener( new java.awt.event.WindowAdapter(){
                        @Override
			public void windowClosing( WindowEvent e){
				System.exit(0);
			}
                });
            frame.pack();
            frame.setVisible(true);

	}
}
