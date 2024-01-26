package fundamentos.exercicios;

public class IMC2 {

	public static void main(String[] args) {

		double altura = 1.71;
		
		double objetivoIMC = 24.9;
		
		double calculoIMC = objetivoIMC * (altura * altura);
		
		System.out.printf("PESO LIMITE: %f", calculoIMC);
	}
}