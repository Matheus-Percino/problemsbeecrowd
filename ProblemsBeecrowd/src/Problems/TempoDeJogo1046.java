package Problems;

import java.util.Scanner;

public class TempoDeJogo1046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String entrada = scanner.nextLine();
		String[] horas = entrada.split(" ");
		Integer inicio = Integer.parseInt(horas[0]);
		Integer fim = Integer.parseInt(horas[1]);
		
		if(inicio < fim){
			System.out.println("O JOGO DUROU "+ ((inicio - fim)*-1) +" HORA(S)");
		}
		if(inicio == fim) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
		if(inicio > fim) {
			int diferença = (inicio-24)*-1;
			
			System.out.println("O JOGO DUROU "+(diferença + fim) +" HORA(S)");
		}
		
		
	}

}
