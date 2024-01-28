package controle.exercicios;

import java.time.Year;

public class AnoBissexto {

	public static void main(String[] args) {
		// Criar um programa informa se o ano atual é um ano bissexto;
		
		String situacaoAno = null;
		
		Year ano = Year.now();

		if (ano.isLeap()){
			situacaoAno = "ano comum";
		} else {
			situacaoAno = "ano bissexto";
		}
		
		System.out.println((ano));
		
		System.out.printf("O ano %d é um %s", ano.getValue(), situacaoAno);
	}
}