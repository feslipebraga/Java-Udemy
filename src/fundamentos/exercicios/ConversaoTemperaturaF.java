package fundamentos.exercicios;

import java.util.Scanner;

public class ConversaoTemperaturaF {
	public static void main(String[] args) {
		// Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a temp em ºF: ");
		double tempF = sc.nextDouble();
		
		double conversao = (tempF - 32) * 5/9;

		System.out.printf("A temperatura %.1fºF em Celcius é %.1fºC",tempF, conversao);
		
		sc.close();
	}
}
