package arrays.desafios;

import java.util.Arrays;
import java.util.Scanner;

public class MediaAluno {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// quantidade de notas a serem armazenadas
		System.out.print("Quantas notas informar? ");
		int qtdNotas = sc.nextInt();
		
		// armazenamento das notas
		double[] notas = new double[qtdNotas];
		for (int i = 0; i < qtdNotas; i++) {
			System.out.printf("%dª nota: ", i+1);
			double nota = sc.nextDouble();
			notas[i] = nota;
		}
		
		sc.close();
		
		// soma das notas
		double totalNotas = 0;
		for (double i : notas) {
			totalNotas += i;
		}
		
		// calculo da media
		double mediaNotas = totalNotas / qtdNotas;
		
		System.out.println(Arrays.toString(notas));
		System.out.println(totalNotas);
		System.out.printf("A média das notas é %.1f", mediaNotas);
	}
}
