package fundamentos.desafios;

import java.util.Scanner;

public class DesafioLogicos {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("DIGITE S ou N");
		System.out.print("O trabalho de TERÇA foi feito? ");
		String aux1 = sc.nextLine().toUpperCase();
		
		System.out.print("O trabalho de QUINTA foi feito? ");
		String aux2 = sc.nextLine().toUpperCase();
		
		boolean trabalhoTERCA = false;
		boolean trabalhoQUINTA = false;
		
		if (aux1.equals("S")) {
			trabalhoTERCA = true;
		}
		if (aux2.equals("S")) {
			trabalhoQUINTA = true;
		}

		boolean TV50Comprada = false;
		boolean TV32Comprada = false;
		boolean tomarSorvete = false;
		
		if (trabalhoTERCA && trabalhoQUINTA) {
			System.out.println("DOIS TRABALHOS FEITOS.");
			TV50Comprada = true;
			tomarSorvete = true;
		} else if (trabalhoTERCA || trabalhoQUINTA) {
			System.out.println("UM TRABALHO FEITO.");
			TV32Comprada = true;
			tomarSorvete = true;
		} else {
			System.out.println("NENHUM TRABALHO FEITO.");
		}
		
		System.out.println("RECOMPESAS:");
		System.out.printf("TV 32 comprada: %b%nTV 50 comprada: %b%nTomar sorvete: %b%n", TV32Comprada, TV50Comprada, tomarSorvete);
		
		sc.close(); 
	}
}