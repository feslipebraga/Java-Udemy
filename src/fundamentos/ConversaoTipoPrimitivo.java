package fundamentos;

public class ConversaoTipoPrimitivo {

	public static void main(String[] args) {
		
		double a = 1;
		System.out.println(a);
		
		// float b = 1.0f;
		float b = (float) 1.12345;
		System.out.println(b);
		
		int c = 130;
		System.out.println(c);
		
		byte d = (byte) c;
		System.out.println(d);
	}
}
