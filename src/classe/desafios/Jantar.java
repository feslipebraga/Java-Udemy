package classe.desafios;

public class Jantar {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Felipe", 70.2);
		
		System.out.println(p1);
		
		Comida c1 = new Comida("Strogonoff", 0.387);
		
		p1.comer(c1);
		
		System.out.println(p1);
	}
}
