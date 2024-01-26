package fundamentos.exercicios;

import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
		// Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o peso: ");
		double peso = sc.nextDouble();
		
		System.out.print("Informe a altura: ");
		double altura = sc.nextDouble();
		
		double calculoIMC = peso / (altura * altura);
		
		System.out.printf("IMC: %.2f", calculoIMC);
		
		sc.close();
	}
}
