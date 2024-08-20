package Problems;

import java.util.Scanner;

public class NumerosPositivos1060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int contador = 0;
		
		for(int i = 0; i < 6; i++) {
			String entrada = scn.nextLine();
			double nota = Double.parseDouble(entrada);
			if(nota > 0) {
				contador++;
			}
		}
		
		System.out.println(contador + " valores positivos");

	}

}
