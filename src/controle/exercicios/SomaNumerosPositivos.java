package controle.exercicios;

import java.util.Scanner;

public class SomaNumerosPositivos {
	public static void main(String[] args) {
		// Criar um programa que enquanto estiver recebendo números positivos, imprime no console a soma dos números inseridos, caso receba um número negativo, encerre o programa. Tente utilizar a estrutura do while.
		
		Scanner sc = new Scanner(System.in);

		int soma = 0;
		
		while (true) {
		System.out.print("Informe um número positivo: ");
		int numero = sc.nextInt();
		if (numero >= 0) {
			soma += numero;
			System.out.printf("Soma atual: %d %n", soma);
		} else {
			System.out.println("Número negativo. Encerrando o programa.");
			break;
		}
		}
		
		System.out.printf("Soma final: %d", soma);
		
		sc.close();
	}
}
