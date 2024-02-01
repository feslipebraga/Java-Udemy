package classe;

public class EqualsEHashcode {
	public static void main(String[] args) {
		Usuario u1 = new Usuario("Pedro Silva", "pedro.silva@ezemail.com.br");
		Usuario u2 = new Usuario("Pedro Silva", "pedro.silva@ezemail.com.br");
		
		System.out.println(u1.hashCode());
		System.out.println(u2.hashCode());
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
	}
}
