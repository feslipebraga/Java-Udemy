package controle.desafios;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o dia da semana: ");
		String diaSemana = sc.next();
		
		String[] diasDaSemana = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
		boolean diaEncontrado = false;
		
		for (int i = 0; i < diasDaSemana.length; i++) {
			if (diasDaSemana[i].equalsIgnoreCase(diaSemana)) {
				System.out.println(diasDaSemana[i] + " é o " + (i + 1) + "º dia da semana.");
				diaEncontrado = true;
				break;
			}
		}
		
		if (!diaEncontrado){
			System.out.println("Dia inválido.");
		}
		
		sc.close();
	}
}