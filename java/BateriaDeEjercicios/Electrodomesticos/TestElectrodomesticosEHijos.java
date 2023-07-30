import javax.swing.JOptionPane;
public class TestElectrodomesticosEHijos {
    public static void main(String args[]) {
        Electrodomesticos listaDeCompra[] = new Electrodomesticos[10];
        
        listaDeCompra[0] = new Electrodomesticos();
        listaDeCompra[1] = new Electrodomesticos( 100,50);
        listaDeCompra[2] = new Televicion( 100, 100, 'A', "rojo",20,false);
        listaDeCompra[3] = new Televicion( 100,50);
        listaDeCompra[4] = new Televicion( 100, 100, 'A', "rojo",40,true);
        listaDeCompra[5] = new Labadora();
        listaDeCompra[6] = new Labadora( 100,50);
        listaDeCompra[7] = new Labadora( 100, 100, 'C', "ojo", 100);
        listaDeCompra[8] = new Electrodomesticos( 100, 100, 'C', "rojo");
        listaDeCompra[9] = new Electrodomesticos();
        int precioFinal = 0;
        String mensajeFinal="Acontinuasion se mostrara la cotizacion de 10 electrodomestico distintos mostrando su tamaño\n\n";
        for( int i=0; i < 9; i++){
            if(listaDeCompra[i] instanceof Electrodomesticos){
                precioFinal += listaDeCompra[i].calcularPrecioFinal();
                mensajeFinal += "\n" + (i + 1) + " Electrodomestico generico con:\t peso -> " + listaDeCompra[i].getPeso() + ".\t color -> " + listaDeCompra[i].getColor() + ".\t Consumo Energetico -> " + listaDeCompra[i].getCosnsumoEnergia() + ".\t --> Presio Total del electrodomestico -> " + listaDeCompra[i].calcularPrecioFinal();
            }
            if(listaDeCompra[i] instanceof Labadora){
                mensajeFinal += "\n" + (i + 1) + " Labadora con:\t peso -> " + listaDeCompra[i].getPeso() + ".\t color -> " + listaDeCompra[i].getColor() + ".\t Consumo Energetico -> " + listaDeCompra[i].getCosnsumoEnergia() + ".\t --> Presio Total de la Labadora-> " + listaDeCompra[i].calcularPrecioFinal();
                precioFinal += listaDeCompra[i].calcularPrecioFinal();

            }
            if(listaDeCompra[i] instanceof Televicion){
                mensajeFinal += "\n" + (i + 1) + " Televisor con:\t peso -> " + listaDeCompra[i].getPeso() + ".\t color -> " + listaDeCompra[i].getColor() + ".\t Consumo Energetico -> " + listaDeCompra[i].getCosnsumoEnergia() + ".\t --> Presio Total del Televisor -> " + listaDeCompra[i].calcularPrecioFinal();
                precioFinal += listaDeCompra[i].calcularPrecioFinal();

            }
        }
        mensajeFinal += "\n\n\n El valor total de la cotisasion es --> " + precioFinal + " Euros ";
        JOptionPane.showMessageDialog(null, mensajeFinal);    
    }
}
