import javax.swing.JOptionPane;
public class testPasword {
    public static void main(String args[]) {
        //Introducimos el tamaño del array y la longitud del password
        String texto=JOptionPane.showInputDialog("Introduce un tamaño para el array");
        int tamano = Integer.parseInt(texto);
        
        Pasword listado[] = new Pasword[tamano];
        boolean calidad[]=new boolean[tamano];

        
        String texto2=JOptionPane.showInputDialog("la cantiadad de digitos de la contraceña");
        int tamanoContracena = Integer.parseInt(texto2);
        

        for( int i = 0; i < tamano; i++){
            listado[i] = new Pasword(tamanoContracena);
            calidad[i] = listado[i].esFuerte();
        }
        String mensajeFinal="acontinuasion se mostraran " + tamano + " de claves con un tamaño de " + tamanoContracena + " y una valoracion de seguridad\n\n";

        for( int i = 0; i < tamano; i++){
            if( calidad[i]){
                mensajeFinal += "\tLa contraceña " + listado[i].getPasword() + " \t\t es segura\n\n";
            }else{
                mensajeFinal += "\tLa contraceña " + listado[i].getPasword() + " \t\t no es segura\n\n";
            }

        }
        JOptionPane.showMessageDialog(null, mensajeFinal);

    }
}
