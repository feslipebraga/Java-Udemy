package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (F - 32) x 5/9 = C
		double fahrenheit = 150;
		double conversao = (fahrenheit - 32) * 5/9;
		System.out.println(fahrenheit + " ºF equivale a " + conversao + " ºC");
		
		fahrenheit = 68;
		conversao = (fahrenheit - 32) * 5/9;
		System.out.println(fahrenheit + " ºF equivale a " + conversao + " ºC");
	}
}