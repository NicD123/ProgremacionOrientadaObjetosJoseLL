import java.util.Scanner;
public class TestPersona {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);  
        System.out.println("\n\n\tDigite su edad: ");
        int userAge = myObj.nextInt(); 
        System.out.println("\n\tDigite su sexo ( H -> Hombre; M -> mujer): ");
        String a;
        do{
            a = myObj.nextLine(); 
        }while(a.length() !=1);
        char userSexso= a.charAt(0);
        
        System.out.println("\n\n\tDigite su peso en Kg: ");
        Float userPeso = myObj.nextFloat(); 
        System.out.println("\n\n\tDigite su altura en m: ");
        Float userAltura = myObj.nextFloat(); 
        
        persona primera = new persona( userAge, userSexso, userPeso, userAltura);
        persona segunda = new persona( userAge, userSexso);
        persona tersera = new persona();
        
        tersera.setName("fernanda");
        tersera.setAge(10);
        tersera.setSexso('M');
        tersera.setPeso(50);
        tersera.setaltura(1.50);
        if(primera.moYorDeEdad()){
            switch(primera.calcularIMC()) {
                case 1:
                    System.out.println("\n\n\t la primera persona regristrada es mayor de edad y tiene sobrepeso");
                  break;
                case 0:
                    System.out.println("\n\n\t la primera persona regristrada es mayor de edad y se encuentra en su peso ideal:)");
                  break;
                case -1:
                    System.out.println("\n\n\t la primera persona regristrada es mayor de edad y se encuentra desnutrida");
                  break;
                default:
                  // code block
              }
        }else{
            switch(primera.calcularIMC()) {
                case 1:
                    System.out.println("\n\n\t la primera persona regristrada es menor de edad y tiene sobrepeso");
                  break;
                case 0:
                    System.out.println("\n\n\t la primera persona regristrada es menor de edad y se encuentra en su peso ideal:)");
                  break;
                case -1:
                    System.out.println("\n\n\t la primera persona regristrada es menor de edad y se encuentra desnutrida");
                  break;
                default:
                  // code block
              }
        }
        
        
        if(segunda.moYorDeEdad()){
            switch(segunda.calcularIMC()) {
                case 1:
                    System.out.println("\n\n\t la segunda persona regristrada es mayor de edad y tiene sobrepeso");
                  break;
                case 0:
                    System.out.println("\n\n\t la segunda persona regristrada es mayor de edad y se encuentra en su peso ideal:)");
                  break;
                case -1:
                    System.out.println("\n\n\t la segunda persona regristrada es mayor de edad y se encuentra desnutrida");
                  break;
                default:
                  // code block
              }
        }else{
            switch(segunda.calcularIMC()) {
                case 1:
                    System.out.println("\n\n\t la segunda persona regristrada es menor de edad y tiene sobrepeso");
                  break;
                case 0:
                    System.out.println("\n\n\t la segunda persona regristrada es menor de edad y se encuentra en su peso ideal:)");
                  break;
                case -1:
                    System.out.println("\n\n\t la segunda persona regristrada es menor de edad y se encuentra desnutrida");
                  break;
                default:
                  // code block
              }
        }
        
        if(tersera.moYorDeEdad()){
            switch(tersera.calcularIMC()) {
                case 1:
                    System.out.println("\n\n\t la tersera persona regristrada es mayor de edad y tiene sobrepeso");
                  break;
                case 0:
                    System.out.println("\n\n\t la tersera persona regristrada es mayor de edad y se encuentra en su peso ideal:)");
                  break;
                case -1:
                    System.out.println("\n\n\t la tersera persona regristrada es mayor de edad y se encuentra desnutrida");
                  break;
                default:
                  // code block
              }
        }else{
            switch(tersera.calcularIMC()) {
                case 1:
                    System.out.println("\n\n\t la tersera persona regristrada es menor de edad y tiene sobrepeso");
                  break;
                case 0:
                    System.out.println("\n\n\t la tersera persona regristrada es menor de edad y se encuentra en su peso ideal:)");
                  break;
                case -1:
                    System.out.println("\n\n\t la tersera persona regristrada es menor de edad y se encuentra desnutrida");
                  break;
                default:
                  // code block
              }
        }

    }
}
