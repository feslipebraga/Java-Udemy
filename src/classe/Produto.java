package classe;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.8;
	
	public Produto(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	
	public double precoFinal() {
		double valor = this.preco * (1 - desconto);
		return valor;
	}
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", desconto=" + desconto + "]";
	}
}
