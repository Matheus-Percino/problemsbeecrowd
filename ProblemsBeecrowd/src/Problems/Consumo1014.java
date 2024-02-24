package Problems;

import java.util.Scanner;

public class Consumo1014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int distancia;
		double combustivel, consumo;
		distancia = scn.nextInt();
		combustivel = scn.nextDouble();
		consumo = distancia/combustivel;
		System.out.printf("%.3f",consumo);
		System.out.println(" km/l");
	}

}
