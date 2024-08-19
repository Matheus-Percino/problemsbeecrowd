package Problems;

import java.util.ArrayList;
import java.util.Scanner;

public class Animal1049 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> listaAnimal = new ArrayList<String>();
		Scanner scn = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			String entrada;
			entrada = scn.nextLine();
			listaAnimal.add(entrada);
	
		}
		
		
		if(listaAnimal.get(0).equals("vertebrado")  &&
			listaAnimal.get(1).equals("ave") && 
			listaAnimal.get(2).equals("carnivoro")) {
			System.out.println("aguia");
		}
		if(listaAnimal.get(0).equals("vertebrado")  &&
				listaAnimal.get(1).equals("ave") && 
				listaAnimal.get(2).equals("onivoro")) {
				System.out.println("pomba");
			}
		if(listaAnimal.get(0).equals("vertebrado")   &&
				listaAnimal.get(1).equals("mamifero")   && 
				listaAnimal.get(2).equals("onivoro")  ) {
				System.out.println("homem");
			}
		if(listaAnimal.get(0).equals("vertebrado")   &&
				listaAnimal.get(1).equals("mamifero")   && 
				listaAnimal.get(2).equals("herbivoro")  ) {
				System.out.println("vaca");
			}
		if(listaAnimal.get(0).equals("invertebrado")  &&
				listaAnimal.get(1).equals("inseto")  && 
				listaAnimal.get(2).equals("hematofago")  ) {
				System.out.println("pulga");
			}
		if(listaAnimal.get(0).equals("invertebrado") &&
				listaAnimal.get(1).equals("inseto")  && 
				listaAnimal.get(2).equals("herbivoro") ) {
				System.out.println("lagarta");
			}
		if(listaAnimal.get(0).equals("invertebrado") &&
				listaAnimal.get(1).equals("anelideo") && 
				listaAnimal.get(2).equals("hematofago") ) {
				System.out.println("sanguessuga");
			}
		if(listaAnimal.get(0).equals("invertebrado")  &&
				listaAnimal.get(1).equals("anelideo") && 
				listaAnimal.get(2).equals("onivoro")  ) {
				System.out.println("minhoca");
			}

	}

}
