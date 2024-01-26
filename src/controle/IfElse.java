package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Número: ");
		
		int valorNumerico = Integer.parseInt(valor);
		
		if (valorNumerico % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
	}
}