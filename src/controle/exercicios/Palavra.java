package controle.exercicios;

import java.util.Scanner;

public class Palavra {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma palavra: ");
		String palavra = sc.nextLine();
		
		for (int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}
		
		sc.close();
	}
}
