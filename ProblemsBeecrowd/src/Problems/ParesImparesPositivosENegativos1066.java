package Problems;

import java.util.ArrayList;
import java.util.Scanner;

public class ParesImparesPositivosENegativos1066 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Integer> listaNumero = new ArrayList<Integer>();
		
		for(int i = 0; i < 5; i++) {
			
			String entrada = scn.nextLine();
			Integer numero = Integer.parseInt(entrada);
			listaNumero.add(numero);
	
		}
		
		
		int contPar =0, contImpar =0, contPositivo =0, contNegativo =0;
		
		for(Integer numeros : listaNumero) {
			
			if(numeros%2 == 0) {
				contPar++;
			}
			if(numeros%2 != 0) {
				contImpar++;
			}
			if(numeros > 0) {
				contPositivo++;
			}
			if(numeros < 0) {
				contNegativo++;
			}
			
		}
		System.out.println(contPar+" valor(es) par(es)");
		System.out.println(contImpar+" valor(es) impar(es)");
		System.out.println(contPositivo+" valor(es) positivo(s)");
		System.out.println(contNegativo+" valor(es) negativo(s)");

	}

}
