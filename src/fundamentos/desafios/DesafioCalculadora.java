package fundamentos.desafios;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int n1 = sc.nextInt();
		
		System.out.print("Digite outro número: ");
		int n2 = sc.nextInt();
		
		System.out.print("Digite o símbolo da operação + - * / %: ");
		String operacao = sc.next();
		
		int resultado = 0;
		
		if (operacao.equals("+")) {
			resultado = n1 + n2;
		} else if (operacao.equals("-")) {
			resultado = n1 - n2;
		} else if (operacao.equals("*")) {
			resultado = n1 * n2;
		} else if (operacao.equals("/")) {
			resultado = n1 / n2;
		} else if (operacao.equals("%")) {
			resultado = n1 % n2;
		}
		
		System.out.println(resultado);
		
		sc.close();
	}
}
