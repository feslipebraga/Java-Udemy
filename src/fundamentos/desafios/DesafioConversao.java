package fundamentos.desafios;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Salário 1: ");
		String v1 = sc.nextLine().replaceAll(",", ".");
				
		System.out.print("Salário 2: ");
		String v2 = sc.nextLine().replaceAll(",", ".");
		
		System.out.print("Salário 3: ");		
		String v3 = sc.nextLine().replaceAll(",", ".");
		
		double salario1 = Double.parseDouble(v1);
		double salario2 = Double.parseDouble(v2);
		double salario3 = Double.parseDouble(v3);
		
		double soma = salario1 + salario2 + salario3;
		double media = soma / 3;
		System.out.printf("A soma dos salários é: %.2f %n", soma);
		System.out.printf("A média, por sua vez, é: %.2f %n", media);
		
		sc.close();
	}
}
