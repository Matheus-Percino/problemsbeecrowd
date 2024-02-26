package Problems;
import java.util.Scanner;

public class NotasEMoedas1021 {

	public static void main(String[] args) {
		//commit
		Scanner scanner = new Scanner(System.in);
		Double reais = scanner.nextDouble();
		double centavo = ((reais%100%50%20%10%5%2%1%0.50%0.25%0.10%0.05/0.01)+0.001);
		System.out.println("NOTAS:");
		System.out.printf("%.0f",Math.floor((reais/100)));
		System.out.println(" nota(s) de R$ 100.00");
		System.out.printf("%.0f",Math.floor((reais%100/50)));
		System.out.println(" nota(s) de R$ 50.00");
		System.out.printf("%.0f",Math.floor((reais%100%50/20)));
		System.out.println(" nota(s) de R$ 20.00");
		System.out.printf("%.0f",Math.floor((reais%100%50%20/10)));
		System.out.println(" nota(s) de R$ 10.00");
		System.out.printf("%.0f",Math.floor((reais%100%50%20%10/5)));
		System.out.println(" nota(s) de R$ 5.00");
		System.out.printf("%.0f",Math.floor((reais%100%50%20%10%5/2)));
		System.out.println(" nota(s) de R$ 2.00");;
		System.out.println("MOEDAS:");
		System.out.printf("%.0f",Math.floor((reais%100%50%20%10%5%2/1)));
		System.out.println(" moeda(s) de R$ 1.00");
		System.out.printf("%.0f",Math.floor((reais%100%50%20%10%5%2%1/0.5)));
		System.out.println(" moeda(s) de R$ 0.50");
		System.out.printf("%.0f",Math.floor((reais%100%50%20%10%5%2%1%0.5/0.25)));
		System.out.println(" moeda(s) de R$ 0.25");
		System.out.printf("%.0f",Math.floor((reais%100%50%20%10%5%2%1%0.5%0.25/0.1)));
		System.out.println(" moeda(s) de R$ 0.10");
		System.out.printf("%.0f",Math.floor((reais%100%50%20%10%5%2%1%0.5%0.25%0.1/0.05)));
		System.out.println(" moeda(s) de R$ 0.05");
		System.out.printf("%.0f",Math.floor(centavo));
		System.out.println(" moeda(s) de R$ 0.01");
		

	}

}
