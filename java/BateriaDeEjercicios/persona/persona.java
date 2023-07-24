/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Saul
 */
public class persona {
    //VAlores defauld de las variables de los datos
    private final String DEFAUL_NAME ="";
    private final int DEFAUL_AGE = 0;
    private final int DEFAUL_PESO = 0;
    private final int DEFAUL_ALTURA = 0;
    private final char DEFAUL_SEXSO = 'H';
    private final char DEFAUL_LETRASPARADNI[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    
    //return defauld funsion calcularIMC()
    private final int DEFAUL_SOBREPESO = 1;
    private final int DEFAUL_PESOIDEAL = 0;
    private final int DEFAUL_BAJOPESO = -1;


    
    //ATRIBUTOS ACTIVOS DE LA CLASE
    private String name;
    private int age;
    private String DNI;
    private  char sexso;
    private int peso;
    private int altura;
    
    //constructores
    public persona(){
        name = DEFAUL_NAME;
        age = DEFAUL_AGE;
        generarDNI();
        sexso = DEFAUL_SEXSO;
        peso = DEFAUL_PESO;
        altura = DEFAUL_ALTURA;
    };
    public persona(String nombre, int edad, char sexso){
        name = nombre;
        age = edad;
        generarDNI();
        comprovarSexso(sexso);
        peso = DEFAUL_PESO;
        altura = DEFAUL_ALTURA;
    };
    public persona(String nombre, int edad, char sexso, int peso, int altura){
        name = nombre;
        age = edad;
        generarDNI();
        comprovarSexso(sexso);
        this.peso = peso;
        this.altura = altura;
    };    
    

    //metodos
    public int calcularIMC(){
        double imc = peso/(altura*altura);
        if(imc < 20){
            return DEFAUL_BAJOPESO;
        }else{
            if( imc > 25){
                return DEFAUL_SOBREPESO;
            }else{
                return DEFAUL_PESOIDEAL;
            }
        }


    };
    public boolean moYorDeEdad(){
        return age>=18;
    };
    private void comprovarSexso( char a){
        if(a=='H'||a=='M'){
            this.sexso=a;
        }else{
            this.sexso=DEFAUL_SEXSO;
        }
    };
    private void generarDNI(){
        int numDNI =(int) Math.floor( Math.random()*(10000000-10000000+1)+10000000);
        int res= numDNI&23;
        char letrDNI =letraDNI(res);
        DNI = Integer.toString(numDNI) + letrDNI;
    };
    
    //clacular letra del dni
    private char letraDNI(int a){
        return DEFAUL_LETRASPARADNI[a];
    }
    
    //funsiones set
    public void setName(String a){name = a;};
    public void setAge(int a){age = a;};
    public void setSexso(char a){comprovarSexso(a);};
    public void setPeso(int a){this.peso = a;};
    public void setaltura(int a){this.altura = a;};
    

    

    
    
    
}
