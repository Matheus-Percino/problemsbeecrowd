package Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TiposDeTriangulos1045 {

	public static void main(String[] args) {
		
		String entrada;
		Scanner scn = new Scanner(System.in);
		entrada = scn.nextLine();
		String[] split = entrada.split(" ");
		double A, B, C;
		A = Double.parseDouble(split[0]);
		B = Double.parseDouble(split[1]);
		C = Double.parseDouble(split[2]);
		
		ArrayList<Double> lado = new ArrayList<Double>();
		lado.add(A);
		lado.add(B);
		lado.add(C);
		Collections.sort(lado);
		A = lado.get(2);
		B = lado.get(1);
		C = lado.get(0);
		
		if(A >= (B+C)) {
			System.out.println("NAO FORMA TRIANGULO");
		}else {
			if((A*A) == ((B*B)+(C*C))) {
				System.out.println("TRIANGULO RETANGULO");
			}
			if((A*A) > ((B*B)+(C*C))) {
				System.out.println("TRIANGULO OBTUSANGULO");//
			}
			if((A*A) < ((B*B)+(C*C))) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if(A == B && B == C && A == C) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			if((A == B && B != C) || (A == C && C != B) || (C == B && C != A)) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
		



	}

}
