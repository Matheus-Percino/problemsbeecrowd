package Problems;

import java.util.Scanner;

public class CoordenadasDeUmPonto1041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner =  new Scanner(System.in);
		
		
		double x, y;
		x = scanner.nextDouble();
		y = scanner.nextDouble();
		if(x > 0) {
			if(y > 0) {
				System.out.println("Q1");
			}
		}
		if(x > 0) {
			if(y < 0) {
				System.out.println("Q4");
			}
		}
		if(x < 0) {
			if(y > 0) {
				System.out.println("Q2");
			}
		}
		if(x < 0) {
			if(y < 0) {
				System.out.println("Q3");
			}
		}
		if(x == 0 && y ==0) {
			System.out.println("Origem");
		}
	}

}
