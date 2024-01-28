package controle.exercicios;

import java.util.Random;
import java.util.Scanner;

public class JogoDaAdvinhacao {
	public static void main(String[] args) {
		
		Random random = new Random();
		int numeroAleatorio = random.nextInt(101);
		
		int tentativas = 10;
		int contador = 0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("JOGO DA ADVINHAÇÃO");
		
		while (true) {
			System.out.print(">> Digite um número entre 0 e 100: ");
			int chute = sc.nextInt();
			contador++;
			
			if (chute != numeroAleatorio) {
				tentativas--;
				if (tentativas == 0) {
					System.out.println("GAME OVER! Você não conseguiu");
					break;
				}
				System.out.println("ERROU! Tentativas restantes: " + tentativas);
				
				if (chute > numeroAleatorio) {
					System.out.println("É um número MENOR.");
				} else {
					System.out.println("É um número MAIOR.");
				}
			} else {
				System.out.printf("Parabéns! Você acertou na %dª tentativa %n", contador);
				break;
			}
		}
		
		System.out.println("Número gerado: " + numeroAleatorio);
		
		sc.close();
	}
}
