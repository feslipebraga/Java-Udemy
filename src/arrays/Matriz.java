package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos tem na turma? ");
		int qtdAlunos = sc.nextInt();
		
		System.out.print("Quantas notas cada aluno tem? ");
		int qtdNotas = sc.nextInt();
		
		int qtdNotasTotal = qtdAlunos * qtdNotas;
		
		double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];
				
		double total = 0;
		for (int i = 0; i < notasDaTurma.length; i++) {
			for (int j = 0; j < notasDaTurma[i].length; j++) {
				System.out.printf("Aluno %d, %dª nota: ", i+1, j+1);
				notasDaTurma[i][j] = sc.nextDouble();
				total += notasDaTurma[i][j];
			}
		}
		
		sc.close();
		
		double media = total / qtdNotasTotal;
		
		for (double[] ds : notasDaTurma) {
			System.out.println(Arrays.toString(ds));
		}
		
		System.out.println("Média da turma: " + media);
	}
}
