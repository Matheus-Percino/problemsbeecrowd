package Problems;

import java.util.Scanner;

public class ParesEntreCincoNúmeros1065 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int contador = 0;
		for(int i=0; i<5;i++) {
			int entrada = scanner.nextInt();
			if(entrada%2 == 0) {
				contador ++;
			}
		}
		System.out.println(contador+" valores pares");
		
		
	}

}
