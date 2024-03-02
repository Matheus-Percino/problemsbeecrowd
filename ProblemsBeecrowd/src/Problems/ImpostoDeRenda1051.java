package Problems;

import java.util.Scanner;

public class ImpostoDeRenda1051 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double salario = scanner.nextDouble();
		if(salario <= 2000.00) {
			System.out.println("Isento");
		}
		if(salario >= 2000.01 && salario <= 3000.00) {
			System.out.printf("R$ %.2f\n",(salario - 2000)*0.08);
		}
		if(salario >= 3000.01 && salario <= 4500.00) {
			System.out.printf("R$ %.2f\n",(salario - 2000)*0.18);
		}
		if(salario >= 4500.00) {
			System.out.printf("R$ %.2f\n",(salario - 2000)*0.28);
		}
	}

}
