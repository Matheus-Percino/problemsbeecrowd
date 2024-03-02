package Problems;

import java.util.Scanner;

public class AumentoDeSalario1048 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double salario = scanner.nextDouble();
		if(salario <= 400.00) {
			System.out.printf("Novo salario: %.2f\n",(salario + (salario*0.15)));
			System.out.printf("Reajuste ganho: %.2f\n",(salario*0.15));
			System.out.println("Em percentual: 15 %");
		}
		if(salario >= 400.01 && salario <= 800.00) {
			System.out.printf("Novo salario: %.2f\n", (salario + (salario*0.12)));
			System.out.printf("Reajuste ganho: %.2f\n",(salario*0.12));
			System.out.println("Em percentual: 12 %");
		}
		if(salario >= 800.01 && salario <= 1200.00) {
			System.out.printf("Novo salario: %.2f\n", (salario + (salario*0.1)));
			System.out.printf("Reajuste ganho: %.2f\n",(salario*0.1));
			System.out.println("Em percentual: 10 %");
		}
		if(salario >= 1200.01 && salario <= 2000.00) {
			System.out.printf("Novo salario: %.2f\n", (salario + (salario*0.07)));
			System.out.printf("Reajuste ganho: %.2f\n",(salario*0.07));
			System.out.println("Em percentual: 7 %");
		}
		if(salario > 2000.00) {
			System.out.printf("Novo salario: %.2f\n", (salario + (salario*0.04)));
			System.out.printf("Reajuste ganho: %.2f\n",(salario*0.04));
			System.out.println("Em percentual: 4 %");
		}
	}

}
