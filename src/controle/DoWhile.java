package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String text;
		
		do {
			System.out.print("Digite algo: ");
			text = sc.nextLine();
		} while (!text.equalsIgnoreCase("sair"));
		
		System.out.println("Obrigado por me utilizar.");
		
		sc.close();
	}
}	
