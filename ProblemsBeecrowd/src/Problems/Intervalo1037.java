package Problems;
import java.util.Scanner;
public class Intervalo1037 {

	public static void main(String[] args) {
		String entradaString;
		Scanner scn = new Scanner(System.in);
		entradaString = scn.nextLine();
		double entrada = Double.parseDouble(entradaString);
		if(entrada < 0 || entrada > 100) {
			System.out.println("Fora de intervalo");
		}
		if(entrada >= 0 && entrada <= 25) {
			System.out.println("Intervalo [0,25]");
		}
		if(entrada > 25 && entrada <= 50) {
			System.out.println("Intervalo (25,50]");
		}
		if(entrada > 50 && entrada <= 75) {
			System.out.println("Intervalo (50,75]");
		}
		if(entrada > 75 && entrada <= 100) {
			System.out.println("Intervalo (75,100]");
		}
		
	}

}
