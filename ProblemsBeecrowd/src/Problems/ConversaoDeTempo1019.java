package Problems;

import java.util.Scanner;

public class ConversaoDeTempo1019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int  entrada,hora =0,minuto =0,segundo;
		entrada =scn.nextInt();
		hora = (entrada / 3600);
		minuto =(entrada % 3600) / 60;
		segundo=((entrada % 3600)%60);
		System.out.println(hora +":"+minuto+":"+segundo);
	}

}
