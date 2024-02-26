package Problems;

import java.util.Scanner;

public class Lanche1038 {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		String entrada = scanner.nextLine();
		String[] split = entrada.split(" ");
		Integer menu = Integer.parseInt(split[0]);
		Double quantidade = Double.parseDouble(split[1]);
		
		switch (menu) {
		case 1: {
			System.out.printf("Total: R$ %.2f\n", quantidade*4);
			break;
		}
		case 2: {
			System.out.printf("Total: R$ %.2f\n", quantidade*4.5);
			break;
		}
		case 3: {
			System.out.printf("Total: R$ %.2f\n", quantidade*5);
			break;
		}
		case 4: {
			System.out.printf("Total: R$ %.2f\n", quantidade*2);
			break;
		}
		case 5: {
			System.out.printf("Total: R$ %.2f\n", quantidade*1.5);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + menu);
		}

	}

}
