package arrays;

import java.util.Arrays;

public class ExercicioForEach {
	public static void main(String[] args) {
		
		// ALUNO A
		
		double[] notasAlunoA = new double[4];		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		System.out.println("Notas do aluno: " + Arrays.toString(notasAlunoA));
		
		double totalAlunoA = 0;
		for (double i : notasAlunoA) {
			totalAlunoA += i;
		}
		
		double mediaAlunoA = totalAlunoA / notasAlunoA.length;
		
		System.out.println("Média do aluno: " + mediaAlunoA);
		
		// ALUNO B
		
		final double notaArmazenadaB = 5.9;
		double[] notasAlunoB = {6.9, 8.9, notaArmazenadaB, 10};
		
		System.out.println("Notas do aluno: " + Arrays.toString(notasAlunoA));

		double totalAlunoB = 0;
		for (double i : notasAlunoB) {
			totalAlunoB += i;
		}
		
		double mediaAlunoB = totalAlunoB / notasAlunoB.length;
		
		System.out.println("Média do aluno: " + mediaAlunoB);
	}
}
