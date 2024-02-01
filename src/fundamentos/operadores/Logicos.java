package fundamentos.operadores;

public class Logicos {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		/* boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && !condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!!condicao1);
		System.out.println(!condicao2); */
	
		System.out.println("TABELA VERDADE E (AND)");
		System.out.printf("V e V: %b %n", true && true);
		System.out.printf("V e F: %b %n", true && false);
		System.out.printf("F e V: %b %n", false && true);
		System.out.printf("F e F: %b %n%n", false && false);
		
		System.out.println("TABELA VERDADE OU (OR)");
		System.out.printf("V e V: %b %n", true || true);
		System.out.printf("V e F: %b %n", true || false);
		System.out.printf("F e V: %b %n", false || true);
		System.out.printf("F e F: %b %n%n", false || false);
		
		System.out.println("TABELA VERDADE OU EXCLUSIVO (XOR)");
		System.out.printf("V e V: %b %n", true ^ true);
		System.out.printf("V e F: %b %n", true ^ false);
		System.out.printf("F e V: %b %n", false ^ true);
		System.out.printf("F e F: %b %n%n", false ^ false);
		
		System.out.println("TABELA VERDADE NOT (!)");
		System.out.printf("!V: %b %n", !true);
		System.out.printf("!F: %b %n", !false);
	}
}