package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		
		// Sempre que comparar strings use equals e não ==
		
		String s = new String("oi");
		System.out.println("oi" == s); // false
		System.out.println("oi".equals(s)); // true
		
		// Exemplo prático
		
		String str1 = "welcome".toUpperCase();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		
		String str2 = sc.nextLine().toUpperCase().trim();
		
		boolean resultado = str1.equals(str2);
		// O next tira os espaços em branco, o nextLine não.
		
		System.out.printf("%s é igual %s? %b%n", str1, str2, resultado);
		
		sc.close();
	}
}
