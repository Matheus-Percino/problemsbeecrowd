package Problems;

import java.util.Scanner;

public class FormulaDeBhaskara1036 {

	public static void main(String[] args) {

		
		String entrada;
		Scanner scn = new Scanner(System.in);
		entrada = scn.nextLine();
		String[] split = entrada.split(" ");
		float a,b,c,d,resultado1,resultado2;
		a = Float.parseFloat(split[0]);
		b = Float.parseFloat(split[1]);
		c = Float.parseFloat(split[2]);
		d = (b*b) - 4*a*c;
		float delta = (float) Math.sqrt(d);
		float infinito = Float.POSITIVE_INFINITY;
		
		
		
		if(d < 0 || delta == infinito || a == 0  ) {
			System.out.println("Impossivel calcular");
		}else {
			resultado1 = ((b*(-1))+delta)/(2*a);
			resultado2 = ((b*(-1))-delta)/(2*a);
			System.out.printf("R1 = %.10f\n",resultado1);
			System.out.printf("R2 = %.5f\n",resultado2);
		}
		
		
	}

}
