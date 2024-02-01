package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto("Notebook", 4000);
		
		var p2 = new Produto("Caneta Preta", 10);

		System.out.println(p1.toString());
		System.out.println(p1.precoFinal());
		
		System.out.println(p2.toString());
		System.out.println(p2.precoFinal());
	}
}
