package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'C'; // NOT

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel ! GEÇTİNİZ.");
			break;// PROGRAMI BİTİRMEK
		case 'B':
		case 'C':
			System.out.println("İyi! : GEÇTİNİZ.");
			break;
		case 'D':
			System.out.println("Fena Değil! : GEÇTİNİZ.");
			break;
		case 'F':
			System.out.println("Malesef Kaldınız...");
			break;
		default:// BUNLARIN DIŞINDA GİRİŞ OLURSA
			System.out.println("GEÇERSİZ NOT");
			break;
		}
	}

}
