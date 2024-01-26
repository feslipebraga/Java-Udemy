package fundamentos.exercicios;

import java.util.Scanner;

public class QuadradoCubo {

	public static void main(String[] args) {
		// Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um valor inteiro: ");
		Integer numero = sc.nextInt();
		
		int numeroQuadrado = (int) Math.pow(numero, 2) ;
		int numeroCubo = (int) Math.pow(numero, 3);
		
		System.out.printf("%d² = %d %n", numero, numeroQuadrado);
		System.out.printf("%d³ = %d", numero, numeroCubo);
		
		sc.close();
	}

}
