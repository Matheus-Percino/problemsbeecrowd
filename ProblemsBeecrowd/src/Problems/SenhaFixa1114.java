package Problems;

import java.util.Scanner;

public class SenhaFixa1114 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int numero = 0;
		for(int i = 0; numero != 2002; i++) {
			numero = scan.nextInt();
			System.out.println("Senha Invalida");
		}

		if (numero == 2002) {
			System.out.println("Acesso Permitido");
		}
	}
}
