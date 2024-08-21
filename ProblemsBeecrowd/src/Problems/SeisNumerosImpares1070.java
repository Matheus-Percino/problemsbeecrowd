package Problems;

import java.util.Scanner;

public class SeisNumerosImpares1070 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		
		for(int i = 0; i < 6; numero++) {
			if(numero%2 > 0) {
				i++;
				System.out.println(numero);
			}
		}
	}

}
