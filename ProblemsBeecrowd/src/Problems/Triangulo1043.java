package Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Triangulo1043 {

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
		
		if(A < (B+C)) {
			System.out.println("Perimetro = "+(A+B+C));
		}else {
			System.out.println("Area = "+((A+B)*C)/2);
		}
	}

}
