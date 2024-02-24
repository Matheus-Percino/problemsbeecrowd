package Problems;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class MediaUm1005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double A, B, M;
		Scanner scan = new Scanner(System.in);	
		A = scan.nextDouble();
		B = scan.nextDouble();
		M = ((A * 3.5) + (B * 7.5))/11;
		BigDecimal bd = new BigDecimal(M);
		bd.setScale(5, RoundingMode.HALF_DOWN);
		System.out.printf("MEDIA = %.5f\n", bd);

	}

}
