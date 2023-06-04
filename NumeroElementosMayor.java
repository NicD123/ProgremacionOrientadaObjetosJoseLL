import java.util.*;
public class NumeroElementosMayor {
	public static void main(String[] args){
		Scanner sc  = new Scanner (System.in);
		System.out.println("\t\tBienvenido.\n\n");
		System.out.println("\tEste programa le dira cuantos numeros son mayores al ultimo numero que capture.");
		System.out.println("\t¿Cuantos numeros va a capturar?  ");
		int numeroDeVariables;
		int mayores;
		int [] numeros;
		numeroDeVariables = sc.nextInt();
		numeros = new int[numeroDeVariables + 1];
		mayores = 0;
		
		for(int i = 0; i < numeroDeVariables; i++){
			System.out.println( "\tte falta por diguitar:  " + (numeroDeVariables - i) + "\n\n\tDigite un numero:  ");
			numeros[i] = sc.nextInt();
		}

		for(int i = 0; i < numeroDeVariables-1; i++){
//			System.out.println(numeros[numeroDeVariables-1] < numeros[i]);
			if(numeros[numeroDeVariables-1] < numeros[i]){
//				System.out.println(numeros[i]);
//				System.out.println(numeros[numeroDeVariables-1]);
				mayores++;
			}
		}
		System.out.println("\tHay " + mayores + " numeros mayores al ultimo numero capturado");
	}



}