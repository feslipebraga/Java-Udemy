package controle.desafios;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double somaTotal = 0;
		int contador = 0;
		
		while (true) {
			System.out.print("Informe a nota 0 a 10: ");
			double nota = sc.nextDouble(); 
			if (nota == -1) {
				System.out.println("Saindo...");
				break;
			} else if (nota < 0 || nota > 10) {
				System.out.println("Nota inválida.");
			} else if (nota >= 0 && nota <= 10) {
				somaTotal += nota;
				contador ++;
			}
		}
		
		double media = somaTotal / contador;
		
		System.out.println("Soma das notas: " + somaTotal);
		System.out.println("Média dos alunos: " + media);

		sc.close();
		
	}
}
