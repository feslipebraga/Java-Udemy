package controle.exercicios;

import java.util.Scanner;

public class CalculoMedia {
	public static void main(String[] args) {
		// Criar um programa que receba duas notas parciais, calcular a média final. Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", caso contrário imprime no console "Reprovado".
		
		Scanner sc = new Scanner(System.in);
		
		// Guarda as notas
		System.out.print("Informe a 1ª nota: ");
		double nota1 = sc.nextDouble();
		System.out.print("Informe a 2ª nota: ");
		double nota2 = sc.nextDouble();
		
		// Calcula a média
		double media = (nota1 + nota2) / 2;
		
		// Mostra a média
		System.out.printf("Média: %.1f %n", media);
		
		// Analisa o status
		String status = null;
		if (media >= 7) {
			status = "Aprovado";
		} else if (media > 4 && media < 7) {
			status = "Recuperação";
		} else {
			status = "Reprovado";
		}
		
		// Mostra o status
		System.out.printf("Status: %s", status);
		
		sc.close();
	}
}	
