package Problems;

import java.util.Scanner;

public class Resto21075 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		Scanner scan = new Scanner(System.in); 
		numero = scan.nextInt();
		for(int i = 1; i < 10000; i++) {
			if(i%numero == 2) {
				System.out.println(i);
			}
		}

	}

}
