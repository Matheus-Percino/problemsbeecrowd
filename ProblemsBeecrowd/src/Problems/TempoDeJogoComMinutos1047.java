package Problems;

import java.util.Scanner;

public class TempoDeJogoComMinutos1047 {

	public static void main(String[] args) {

		
		String entrada;
		Scanner scn = new Scanner(System.in);
		entrada = scn.nextLine();
		String[] split = entrada.split(" ");
		int horaInicial, minutoInicial, horaFinal, minutoFinal, tempo = 0;
		horaInicial = Integer.parseInt(split[0]);
		minutoInicial = Integer.parseInt(split[1]);
		horaFinal = Integer.parseInt(split[2]);
		minutoFinal = Integer.parseInt(split[3]);
		
		
		//if(horaInicial == 0 || horaFinal == 0) {}
		
		if(horaInicial > horaFinal) {
			tempo += ((horaInicial - horaFinal)*60);
		}
		if(horaInicial < horaFinal) {
			tempo += ((horaFinal - horaInicial)*60);
		}
		if(minutoInicial > minutoFinal) {
			tempo += (minutoFinal - minutoInicial);
		}
		if(minutoInicial < minutoFinal) {
			tempo += (minutoFinal - minutoInicial);
		}
		if(((tempo-tempo%60)/60) > 24 || tempo%60 < 1 || tempo == 0) {
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		}else {
			System.out.println("O JOGO DUROU "+((tempo-tempo%60)/60)+" HORA(S) E "+tempo%60+" MINUTO(S)");
		}
		
		
	}

}
