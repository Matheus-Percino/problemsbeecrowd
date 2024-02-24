package Problems;

import java.util.Scanner;

public class IdadeEmDias1020 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int dias = scanner.nextInt();
		System.out.println(dias/365 +" ano(s)");
		System.out.println(((dias%365)-((dias%365)%30))/30+" mes(es)");
		System.out.println(((dias%365)%30)+" dia(s)");
	}

}
