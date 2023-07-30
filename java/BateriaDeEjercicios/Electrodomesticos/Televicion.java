public class Televicion extends Electrodomesticos{

        
    protected final int _RESOLUCION_DEFAULT = 20;
    protected int resolucion;
    
    protected final boolean _TD_SINTONISADOR_DEFAULT = false;
    protected boolean tdSintonisador;
    
    
    public Televicion(){
        super();
        resolucion = _RESOLUCION_DEFAULT;
        tdSintonisador = _TD_SINTONISADOR_DEFAULT;
    }
    public Televicion(int presioBase1,int peso1){
        super(presioBase1, peso1);
        resolucion = _RESOLUCION_DEFAULT;
        tdSintonisador = _TD_SINTONISADOR_DEFAULT;
    }
    public Televicion(int precio1, int peso1, char CosnsumoEnergia1, String color1, int resolucion1, boolean tdSintonisador1){
        super( precio1,  peso1,  CosnsumoEnergia1,  color1);
        resolucion = resolucion1;
        tdSintonisador = tdSintonisador1;
    }

    public int getResolucion() {
        return resolucion;
    }
    public boolean getTdSintonisador() {
        return tdSintonisador;
    }
    
    public double precioFinal(){
        double plus = super.calcularPrecioFinal();
        if(tdSintonisador){
            plus += 30;
        }
        if(resolucion >= 40){
            plus += (plus * 30 / 100);
        }
        return plus;
    }
}
