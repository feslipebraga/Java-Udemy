package fundamentos.exercicios;

import java.util.Scanner;

public class ConversaoTemperaturaC {
	public static void main(String[] args) {
		// Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Digite a temperatura em ºC: ");
		double tempC = sc.nextDouble();
				
		double conversao = (tempC *  9/5) + 32;

		System.out.printf("A temperatura %.1fºC em Fahrenheit é %.1fºF",tempC, conversao);
				
		sc.close();
	}
}
