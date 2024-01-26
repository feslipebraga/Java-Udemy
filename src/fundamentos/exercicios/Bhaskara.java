package fundamentos.exercicios;

public class Bhaskara {
	public static void main(String[] args) {
		// Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta.
		
		int a = 1;
		int b = 12;
		int c = -13;
		
		double delta = Math.pow(b, 2) - (4 * a * c);
		
		double x1 = (- b + Math.sqrt(delta)) / (2 * a);
		
		double x2 = (- b - Math.sqrt(delta)) / (2 * a);
		
		System.out.println(x1);
		System.out.println(x2);
	}
}
