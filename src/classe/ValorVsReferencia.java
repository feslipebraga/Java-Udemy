package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		
		// ATRIBUIÇÃO POR VALOR
		double a = 2;
		double b = a;
		
		a++;
		b--;
		
		System.out.println(a);
		System.out.println(b);
		
		// ATRIBUIÇÃO POR REFERÊNCIA
		Data d1 = new Data(30, 11, 2016);
		Data d2 = d1;
		
		System.out.println(d1);
		System.out.println(d2);
	}
}
