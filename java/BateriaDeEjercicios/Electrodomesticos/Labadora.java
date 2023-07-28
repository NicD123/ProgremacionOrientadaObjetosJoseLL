
/**
 *
 * @author NicD
 */
public class Labadora extends Electrodomesticos{
    
    protected final int _CARGA_DEFAULT = 5;
    protected int carga;
    public Labadora(){
        super();
        carga = _CARGA_DEFAULT;
    }
    public Labadora(int precio, int peso){
        super(precio,peso);
        carga = _CARGA_DEFAULT;
    }
    public Labadora(int precio1, int peso1, char CosnsumoEnergia1, String color1,int cargas){
        super(precio1,peso1,CosnsumoEnergia1,color1);
        carga = cargas;
    }
    
    public int getCarga() {
        return carga;
    }
    public double precioFinal(){
    double plus = super.calcularPrecioFinal();
    int aumento =  carga % 30;
    plus = plus + 50 * aumento;
    return plus;
    }
    
}
