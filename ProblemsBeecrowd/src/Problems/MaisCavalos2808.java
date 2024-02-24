package Problems;

import java.util.Scanner;

public class MaisCavalos2808 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		var position1 = scanner.next();
		var position2 = scanner.next();
		int a = position1.charAt(0);
		int b = position1.charAt(1);
		int c = position2.charAt(0);
		int d = position2.charAt(1);
		
		if(Math.abs(a - c) == 2 && Math.abs(b - d ) == 1 || Math.abs(a - c) == 1 && Math.abs(b -d ) == 2 ) {
			System.out.println("VALIDO");
		}
		else {
			System.out.println("INVALIDO");
		}

		


	}

}
