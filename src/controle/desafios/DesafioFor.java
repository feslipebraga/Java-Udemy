package controle.desafios;

public class DesafioFor {
	public static void main(String[] args) {
		
//		String hashtag = "#";
//		for (int i = 0; i < 5; i++) {
//			System.out.println(hashtag);
//			hashtag += "#";
//		}
		
		for (String hashtag = "#"; !hashtag.equals("######"); hashtag += "#") {
			System.out.println(hashtag);
		}
	}
}
