package Problems;

import java.util.Scanner;

public class Esfera1011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		double raio, resposta;
		double pi = 3.14159;
		raio = scn.nextDouble();
		resposta = (raio*raio*raio)*pi*(4.0/3.0);
		System.out.printf("VOLUME =  %.3f\n", resposta);
	}

}
