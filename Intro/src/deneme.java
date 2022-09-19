import java.util.Scanner;

public class deneme {

	public static void main(String[] args) {
		int sayi;
		Scanner scanner = new Scanner(System.in);
		System.out.println("BÖLÜNECEK SAYIYI GİRİNİZ :");
		sayi = scanner.nextInt();

		int bolen;
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("BÖLEN SAYIYI GİRİNİZ :");
		bolen = scanner1.nextInt();

		double sonuc = sayi / bolen;
		System.out.println("SONUÇ : " + sonuc);

		int kalan = sayi % bolen;
		if (kalan == 0) {
			System.out.println("SAYI TAM BOLUNDU !" + "  kalan =  " + kalan);
		} else {
			System.out.println("SAYI KALANLI BÖLÜNDÜ !" + "  kalan =  " + kalan);
		}

	}

}
