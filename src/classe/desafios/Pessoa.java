package classe.desafios;

public class Pessoa {
	
	private String nome;
	private double peso;
	
	public Pessoa(String nome, double peso) {
		super();
		this.nome = nome;
		this.peso = peso;
	}

	public void comer(Comida comida) {
		this.peso = peso += comida.getPeso();
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
		return "Pessoa [nome=" + nome + ", peso=" + peso + "]";
	}		
}