package Problems;

import java.util.Scanner;

public class Cedulas1018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int entrada;
		Scanner scn = new Scanner(System.in);
		entrada = scn.nextInt();
		System.out.println(entrada);
		System.out.println(entrada/100 +" nota(s) de R$ 100,00");
		System.out.println((entrada%100)/50+" nota(s) de R$ 50,00");
		System.out.println(((entrada%100)%50)/20+" nota(s) de R$ 20,00");
		System.out.println((((entrada%100)%50)%20)/10+ " nota(s) de R$ 10,00");
		System.out.println(((((entrada%100)%50)%20)%10)/5+" nota(s) de R$ 5,00");
		System.out.println((((((entrada%100)%50)%20)%10)%5)/2+" nota(s) de R$ 2,00");
		System.out.println((((((entrada%100)%50)%20)%10)%5)%2+" nota(s) de R$ 1,00");
	}

}
