package fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {

		// Tudo em java são objetos, exceto os 8 tipos primitivos.
		String texto = "texto"; // String é uma classe, s é objeto.
		// String text = new String("Texto");
		String textoUPPER = texto.toUpperCase();

		System.out.println(textoUPPER);

		// Wrappers são a versão objetos dos tipos primitivos.

		// Não é possível manipular os tipos primitivos a menos que use wrappers.
		int a = 123;
		System.out.println(a);

		// System.out.println(a.lenght); ERRO.
	}
}
