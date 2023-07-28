public class Electrodomesticos {
    
// variables de uso
    protected int precioBase;
    protected int peso;
    protected char cosnsumoEnergia;
    protected String color;

//variables default
    protected final int _PRECIO_BASE_DEFAULT = 100;
    protected final int _PESO_DEFAULT = 5;
    protected final char _CONSUMO_ENERGETICO_DEFAULT  = 'F';
    protected final String _COLOR_DEFAULT  = "blanco";
//Variables defauld de Consumo y color presio
    protected final char _TIPOS_CONSUMOS_ENERGETICO[]  = { 'A', 'B', 'C', 'D', 'E', 'F'};
    protected final int _PRESIO_CONSUMOS_ENERGETICO[]  = { 100, 80, 60, 50, 30, 10};
    
    protected final String _COLORES_DISPONIBLES[] = { "blanco", "negro", "rojo", "azul", "gris"};
    
    protected final int _LIMITES_DE_PESO[]  = { 0, 20, 50, 80};
    protected final int _PRESIO_POR_RANGO_DE_PESO[]  = { 10, 50, 80, 100};


  
 //constructores
    public Electrodomesticos(int presioBase1,int peso1,char CosnsumoEnergia1, String color1){
        precioBase = presioBase1;
        peso = peso1;
        comprobarConsumo(CosnsumoEnergia1);
        comprobarColor(color1);
    };
    public Electrodomesticos(int presioBase1,int peso1){
        this( presioBase1, peso1, 'F',"blanco");
    };
    public Electrodomesticos(){
        this( 100, 5, 'F',"blanco");
    };
    
    
 // comprobar dato de ingreso
    protected void comprobarConsumo(char a){
        for(int i=0; i < _TIPOS_CONSUMOS_ENERGETICO.length ;i++ ){
            if(_TIPOS_CONSUMOS_ENERGETICO[i] == a){
                cosnsumoEnergia=a;
                i = _TIPOS_CONSUMOS_ENERGETICO.length;
            }else{
                if( i == _TIPOS_CONSUMOS_ENERGETICO.length-1){
                    cosnsumoEnergia = _CONSUMO_ENERGETICO_DEFAULT;
                }
            }
        }
    };
    protected void comprobarColor(String a){
        a = a.toLowerCase();
        for(int i=0; i < _COLORES_DISPONIBLES.length ;i++ ){
            if(_COLORES_DISPONIBLES[i].equals(a)){
                color = a;
                i = _COLORES_DISPONIBLES.length;
            }else{
                if( i == _COLORES_DISPONIBLES.length-1){
                    color = _COLOR_DEFAULT;
                }
            }
            }
        };
 
    
// get
    public int getPrecioBase(){
        return precioBase;
    };
    public int getPeso(){
        return peso;
    };
    public char getCosnsumoEnergia(){
        return cosnsumoEnergia;
    };
    public String getcolor(){
        return color;
    };
    

//Calcular peresio}
    public double calcularPrecioFinal(){
        int presio;
        presio = precioBase;        
        for(int i=0; i < _TIPOS_CONSUMOS_ENERGETICO.length-1 ;i++ ){
             if(_TIPOS_CONSUMOS_ENERGETICO[i] == cosnsumoEnergia){
                presio += _PRESIO_CONSUMOS_ENERGETICO[i];
            }
        }
        for(int i=0; i < _LIMITES_DE_PESO.length ;i++ ){
            if(_LIMITES_DE_PESO[i] <= peso && peso <_LIMITES_DE_PESO[i+1]){
                presio += _PRESIO_POR_RANGO_DE_PESO[i];
            }else{
                if( i < _LIMITES_DE_PESO.length-1){
                    presio += _PRESIO_POR_RANGO_DE_PESO[i+1];
                }
            }
        }
        
        return 1;
    }
    
}
