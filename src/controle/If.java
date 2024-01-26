package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a média: ");
		double media = sc.nextDouble();
		
		String status = "";
		
		if (media >= 7) {
			status = "Aprovado";
		} else {
			status = "Recuperação";
		}
		
		System.out.printf("Média: %.1f. Situação: %s", media, status);
		
		sc.close();
	}
}
