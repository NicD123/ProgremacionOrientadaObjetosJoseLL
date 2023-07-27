public class Electrodomesticos {
    
// variables de uso
    protected int precioBase;
    protected int precioFinal;
    protected int peso;
    protected char CosnsumoEnergia;
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
    


  
 //constructores
    Electrodomesticos(int presioBase1,int peso1,char CosnsumoEnergia1, String color1){
        precioBase = presioBase1;
        peso = peso1;
        CosnsumoEnergia = CosnsumoEnergia1;
        color = color1;
    };
    Electrodomesticos(int presioBase1,int peso1){
        this( presioBase1, peso1, 'F',"blanco");
    };
    Electrodomesticos(){
        this( 100, 5, 'F',"blanco");
    };
    
    protected void comprobarConsumo(char a){
        for(int i=0; i < _TIPOS_CONSUMOS_ENERGETICO.length ;i++ ){
            if(_TIPOS_CONSUMOS_ENERGETICO[i] == a){
                CosnsumoEnergia=a;
                i = _TIPOS_CONSUMOS_ENERGETICO.length;
            }else{
                if( i == _TIPOS_CONSUMOS_ENERGETICO.length-1){
                    CosnsumoEnergia = _CONSUMO_ENERGETICO_DEFAULT;
                }
            }
        }
    };
}
