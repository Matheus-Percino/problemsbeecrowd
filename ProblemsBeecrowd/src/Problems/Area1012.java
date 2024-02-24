package Problems;

import java.util.Scanner;

public class Area1012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String entrada;
		Scanner scn = new Scanner(System.in);
		entrada = scn.nextLine();
		String[] split = entrada.split(" ");
		double a,b,c,triangulo,circulo,trapezio,quadrado,retangulo;
		double pi = 3.14159;
		a = Double.parseDouble(split[0]);
		b = Double.parseDouble(split[1]);
		c = Double.parseDouble(split[2]);
		triangulo = a * c/2;
		circulo = (c*c)*pi;
		trapezio = (a+b)*c/2;
		quadrado = b*b;
		retangulo = a*b;
		System.out.printf("TRIANGULO: %.3f\n",triangulo);
		System.out.printf("CIRCULO: %.3f\n",circulo);
		System.out.printf("TRAPEZIO: %.3f\n",trapezio);
		System.out.printf("QUADRADO: %.3f\n",quadrado);
		System.out.printf("RETANGULO: %.3f\n",retangulo);
	}

}
