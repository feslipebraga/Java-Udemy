package classe.desafios;

public class Comida {
	private String nome;
	private double peso;
	
	public Comida(String nome, double peso) {
		super();
		this.nome = nome;
		this.peso = peso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return "Comida [nome=" + nome + ", peso=" + peso + "]";
	}
	
}
