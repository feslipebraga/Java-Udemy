package fundamentos.exercicios;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Base: ");
		double base = sc.nextDouble();
		
		System.out.print("Altura: ");
		double altura = sc.nextDouble();
		
		double area = (base * altura) / 2;
				
		System.out.printf("Área do triângulo: %.2fm² %n", area);
		
		sc.close();
		
	}

}
