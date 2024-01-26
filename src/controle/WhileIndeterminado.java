package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean loop = true;
		while (loop) {
			System.out.print("Digite algo: ");
			String text = sc.nextLine();
			if (text.equalsIgnoreCase("sair")) {
				loop = false;
				System.out.println("Saindo... :D");
			}
		}
		
		sc.close();
	}
}
