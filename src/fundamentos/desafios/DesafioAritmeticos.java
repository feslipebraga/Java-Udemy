package fundamentos.desafios;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
		int superiorA = (int) Math.pow(6 * (3+2), 2);
		int inferiorA = 3 * 2;
		int A = superiorA / inferiorA;		
		
		int superiorB = (1-5)*(2-7);
		int inferiorB = 2;
		int B = (int) Math.pow(superiorB / inferiorB, 2);		
		
		int superior = (int) Math.pow(A - B, 3);
		
		int inferior = (int) Math.pow(10, 3);
		
		int resultado = superior / inferior;
		
		System.out.printf("O resultado é %d", resultado);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
