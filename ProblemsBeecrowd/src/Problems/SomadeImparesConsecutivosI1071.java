package Problems;

import java.util.Scanner;

public class SomadeImparesConsecutivosI1071 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primeiro, segundo, contador = 0;
		Scanner scan = new Scanner(System.in); 
		primeiro = scan.nextInt();
		segundo = scan.nextInt();
		
		if((primeiro - segundo) == 0) {
			System.out.println("0");
		}
		if(primeiro > segundo) {
			for(int i = segundo; i < primeiro; i++) {
				
				if(i%2 != 0) {
					contador += i;
				}
			}
		}
		if(primeiro < segundo) {
			for(int i = primeiro; i > segundo; i++) {
				if(i%2 != 0) {
					contador += i;
				}
			}
		}

		System.out.println(contador);
	}

}
