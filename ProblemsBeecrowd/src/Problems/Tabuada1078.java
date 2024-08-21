package Problems;

import java.util.Scanner;

public class Tabuada1078 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		Scanner scan = new Scanner(System.in); 
		numero = scan.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i+" x "+numero+" = "+(i*numero));
		}

	}

}
