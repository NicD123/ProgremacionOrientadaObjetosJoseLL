public class Pasword {
    private final int LONGITUD_DAFAULD = 8;
    
    private int longitud;
    private String pasword = "";
    
    Pasword(int a){
        longitud = a;
        generarPasword();
    };
    Pasword(){
        this(8);
    };
    
    public void setLongitud(int a){
        longitud = a;
        generarPasword();
    };
    public String getPasword(){
        return pasword;
    };
    public int getLongitud(){
        return longitud;
    };
    
    private void generarPasword(){
        pasword = "";
        for(int i = 0; i < longitud; i++){
            int tipo = (int) (Math.random()*(3-1));
            switch(tipo) {
                case 1:
                  // minusculo
                    char minuscula = (char) (Math.random()*(122-97)+97);
                    pasword += minuscula;
                  break;
                case 2:
                    char numero = (char) (Math.random()*(57-48)+48);
                    pasword += numero;
                  // numero
                case 3:
                    char mayuscula = (char) (Math.random()*(90-65)+65);
                    pasword += mayuscula;
                  // mayuscula
                  break;
                default:
                  // code block
              }
            
        };
        
    };
    public boolean esFuerte(){
        if(pasword.length() !=longitud){
            return false;
        };
        int numero = 0;
        int mayuscula = 0;
        int minuscula = 0;
        for( int i = 0; i < longitud;i++){
            char a = pasword.charAt(i);
            int verificar = a;
            if(97 <= verificar && verificar <= 122){
               minuscula++;
            }else{
                if(48 <= verificar && verificar <= 57){
                    numero++;
                }else{
                    if(65 <= verificar && verificar <= 90){
                        numero++;
                    }
                }
           }
        }
        if(numero >= 5){
            if(mayuscula >= 2){
                if(minuscula >= 1){
                 return true;
                }
            }
        }
        return false;

    }

    
}