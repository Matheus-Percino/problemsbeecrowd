package Problems;

import java.util.Scanner;

public class Multiplos1044 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String entrada = scanner.nextLine();
		String[] multiplos = entrada.split(" ");
		Integer A = Integer.parseInt(multiplos[0]);
		Integer B = Integer.parseInt(multiplos[1]);
		if(A == 1 || B == 1) {
		System.out.println("Sao Multiplos");
		}else {
			if (A%B == 0 || B%A == 0) {
				System.out.println("Sao Multiplos");
			}else {
				
				System.out.println("Nao sao Multiplos");
			}
				
		}
		
	}

}
