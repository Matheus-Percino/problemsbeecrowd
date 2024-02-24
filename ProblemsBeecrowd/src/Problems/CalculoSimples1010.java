package Problems;

import java.util.Scanner;

public class CalculoSimples1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String entradaUm, entradaDois;
		entradaUm = scn.nextLine();
		entradaDois = scn.nextLine();
		String[] primeiro = entradaUm.split(" ");
		String[] segundo = entradaDois.split(" ");
		int i = Integer.parseInt(primeiro[1]);
		double b = Double.parseDouble(primeiro[2]);
		int ii = Integer.parseInt(segundo[1]);
		double bb = Double.parseDouble(segundo[2]);
		double c = (i * b)+(ii*bb);
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", c);
	}

}
