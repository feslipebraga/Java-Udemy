package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá, mundo!".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!!!");
		System.out.println(s.startsWith("B"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		System.out.println(s.length());
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.printf("%s %s tem %d anos e ganha R$ %.2f por mês.",
				nome, sobrenome, idade, salario);
		
		String frase = String.format("\n%s %s tem %d anos e ganha R$ %.2f por mês.",
				nome, sobrenome, idade, salario);
		
		System.out.println(frase);
	}
}
