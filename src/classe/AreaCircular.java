package classe;

public class AreaCircular {
	private double raio;
	static final double pi = 3.1415;
	
	public AreaCircular(double raio) {
		this.raio = raio;
	}
	
	public double area() {
		return pi * Math.pow(raio, 2);
	}
}
