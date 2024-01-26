package fundamentos;

import javax.swing.JOptionPane; // serve para mostrar o pop-up

public class ConversaoStringNumero {

	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro numero");
		
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo valor");

		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		
		System.out.printf("A soma dos valores é: %.2f%n", soma);
	}
}