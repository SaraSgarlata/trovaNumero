package org.italy.generation;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in); //classe
		
		Random R = new Random(); //classe
		
		int numeroGenerato, numeroPensato;
		
		numeroGenerato = R.nextInt(100)+1; // genera numero casuale tra 1 e 100
		
		System.out.println("inserisci un numero casuale");  
		numeroPensato = Integer.parseInt(scanner.nextLine());
		
		while (numeroPensato!= numeroGenerato)
			{
				if (numeroPensato > numeroGenerato)
					System.out.println("il numero pensato è troppo grande");
				else 
					System.out.println("il numero pensato è troppo piccolo");
				System.out.println("inserisci numero");
				numeroPensato = Integer.parseInt(scanner.nextLine());
				
	}

}
}