package intro;

public class Switch_Case {
	public static void main(String[] args) {
		char grade =  'E';
		
		switch (grade) {
		case 'A':
			System.out.println("Mükemmel Geçtiniz");
			break;
		case 'B':
			System.out.println("Basarili Geçtiniz");
			break;
		case 'C':
			System.out.println("Orta Geçtiniz");
			break;
		case 'D':
			System.out.println("Koşullu Geçtiniz");
			break;
		case 'F':
			System.out.println("Başarısız Kaldınız");
			break;
		default:
			System.out.println("Geçersiz Not Girdiniz!");
		}
	}
}
