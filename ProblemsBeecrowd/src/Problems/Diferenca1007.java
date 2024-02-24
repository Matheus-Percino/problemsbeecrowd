package Problems;

import java.util.Scanner;

public class Diferenca1007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A, B, C, D, DIFERENCA;
		Scanner scan = new Scanner(System.in);
		A = scan.nextInt();
		B = scan.nextInt();
		C = scan.nextInt();
		D = scan.nextInt();
		DIFERENCA = (A * B - C * D);
		String diferenca = "DIFERENCA = ";
		System.out.println(diferenca + DIFERENCA);
		
	}

}
