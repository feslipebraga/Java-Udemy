package controle.exercicios;

import java.util.Scanner;

public class NumeroPar {

	public static void main(String[] args) {
		// Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
		
		Scanner sc = new Scanner(System.in);

		String status = null;
		String parImpar = null;
		
		boolean loop = true;
		while (loop) {
			System.out.print("Digite um número inteiro: ");
			int numero = sc.nextInt();
			
			sc.nextLine();
			
			if (numero >= 0 && numero <= 10) {
				status = "está entre 0 e 10";
			} else {
				status = "NÃO está entre 0 e 10";
			}
			if (numero % 2 == 0) {
				parImpar = "par";
			} else {
				parImpar = "ímpar";
			}
			System.out.printf("O número %s e é %s %n", status, parImpar);
			while (true) { 
				// continuar programa?
				System.out.print("Deseja continuar? S/N ");
				String running = sc.nextLine();
				
				if (running.equalsIgnoreCase("s")) {
					break;
				} else if (running.equalsIgnoreCase("n")) {
					loop = false;
					break;
				} else {
					System.out.println("Opção inválida... Tente novamente!");
				}
			}
			
		}
		System.out.println("FIM!");
		
		sc.close();

	}

}
