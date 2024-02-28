package Problems;

import java.util.Scanner;

public class MediaTres1040 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		double notaUm, notaDois, notaTres, notaQuatro, q;
		notaUm = scanner.nextDouble();
		notaDois = scanner.nextDouble();
		notaTres = scanner.nextDouble();
		notaQuatro = scanner.nextDouble();
		q = scanner.nextDouble();
		double mediaUm = (notaUm * 2 + notaDois * 3 + notaTres * 4 + notaQuatro)/10;
		
		if(mediaUm >= 7.0) {
			System.out.printf("Media final: %.1f%n",mediaUm);
			System.out.println("Aluno aprovado.");
		}
		if(mediaUm < 5.0) {
			System.out.printf("Media final: %.1f%n",mediaUm);
			System.out.println("Aluno reprovado.");
		}
		if(mediaUm == 5.0 || mediaUm < 6.9) {
			System.out.printf("Media final: %.1f%n",mediaUm);
			System.out.println("Aluno em exame.");
				
				double exame = scanner.nextDouble();
				if((mediaUm + exame)/2 > 5.0) {
					System.out.println("Nota do exame: "+exame);
					System.out.println("Aluno aprovado");
					System.out.printf("Media final: %.1f%n",(mediaUm + exame)/2);
				}else {
					System.out.println("Aluno reprovado.");
				}
			
			
		}
		 scanner.close();

	}

}
