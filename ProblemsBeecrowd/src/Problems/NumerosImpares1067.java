package Problems;

import java.util.Scanner;

public class NumerosImpares1067 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		
		for(int i = 0; i <= numero; i++) {
			if(i%2 > 0) {
				System.out.println(i);
			}
		}
	}

}
