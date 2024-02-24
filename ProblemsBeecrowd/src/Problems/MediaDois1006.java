package Problems;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class MediaDois1006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double A, B, C, M;
		Scanner scan = new Scanner(System.in);	
		A = scan.nextDouble();
		B = scan.nextDouble();
		C =scan.nextDouble();
		M = ((A * 2) + (B * 3) + (C * 5))/10;
		BigDecimal bd = new BigDecimal(M);
		bd.setScale(4, RoundingMode.HALF_DOWN);
		System.out.printf("MEDIA = %.1f%n", bd);

	}

}
