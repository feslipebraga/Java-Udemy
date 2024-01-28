package controle;

public class ContinueRotulado {
	public static void main(String[] args) {
		
		// rotular os laços for para conseguir dizer ao programar o que exatamente parar
		
		extern: for (int i = 0; i < 3; i++) {
			/* intern: */ for (int j = 0; j < 3; j++) {
				if (i == 1) {
					continue extern;
				}
				System.out.printf("[%d %d] ", i, j);
			}
			System.out.println();
		}
	}
}
