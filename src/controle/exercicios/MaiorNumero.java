package controle.exercicios;

import java.util.Scanner;

public class MaiorNumero {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		int maior = 0;
		int menor = 0;
		
		int i = 1;
		while (i < 4) {
			System.out.printf("%dº número: ", i);
			numero = sc.nextInt();

			if (i == 1) {
				maior = numero;
				menor = numero;
				
			} else {
				if (numero > maior) {
					maior = numero;
				}
				if (numero < menor) {
					menor = numero;
				}
			}
			
			i++;
		}
		System.out.println("COM BASE NOS NÚMEROS DIGITADOS...");
		System.out.printf("Menor número: %d %n", menor);
		System.out.printf("Maior número: %d %n", maior);
		
		sc.close();
	}
}
