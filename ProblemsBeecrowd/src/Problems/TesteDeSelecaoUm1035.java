package Problems;

import java.util.Scanner;

public class TesteDeSelecaoUm1035 {

	public static void main(String[] args) {

		//commit
		Scanner scanner = new Scanner(System.in);
		String entrada = scanner.nextLine();
		String[] split = entrada.split(" ");
		Integer a = Integer.parseInt(split[0]);
		Integer b = Integer.parseInt(split[1]);
		Integer c = Integer.parseInt(split[2]);
		Integer d = Integer.parseInt(split[3]);
		
		if(b > c && d > a && (c+d) > (a+b) && c > 0 && d> 0 && a%2 == 0) {
			System.out.println("Valores aceitos");
		}else {
			System.out.println("Valores nao aceitos");
		}

		
	}

}
