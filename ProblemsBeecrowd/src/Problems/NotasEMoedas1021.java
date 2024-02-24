package Problems;

import java.util.Scanner;

public class NotasEMoedas1021 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Double reais = scanner.nextDouble();
		System.out.println("NOTAS:");
		System.out.printf("%.f\n",(reais/100)," nota(s) de R$ 100.00");
		System.out.println((reais%100/50)+" nota(s) de R$ 50.00");
		System.out.println((reais%100%50/20)+" nota(s) de R$ 20.00");
		System.out.println((reais%100%50%20/10)+" nota(s) de R$ 10.00");
		System.out.println((reais%100%50%20%10/5)+" nota(s) de R$ 5.00");
		System.out.println((reais%100%50%20%10%5/2)+" nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println((reais%100%50%20%10%5%2/1)+" moeda(s) de R$ 1.00");
		System.out.println((reais%100%50%20%10%5%2%1/0.5)+" moeda(s) de R$ 0.50");
		System.out.println((reais%100%50%20%10%5%2%1%0.5/0.25)+" moeda(s) de R$ 0.25");
		System.out.println((reais%100%50%20%10%5%2%1%0.5%0.25/0.1)+" moeda(s) de R$ 0.10");
		System.out.println((reais%100%50%20%10%5%2%1%0.5%0.25%0.1/0.05)+" moeda(s) de R$ 0.05");
		System.out.println((reais%100%50%20%10%5%2%1%0.5%0.25%0.1%0.05/0.01)+" moeda(s) de R$ 0.01");
		
		

	}

}
