package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün Hava Çok Güzel.";
		System.out.println(mesaj);

		System.out.println("Eleman sayýsý : " + mesaj.length());
		System.out.println("5.eleman : " + mesaj.charAt(4)); // 4.index'deki elemaný bul.

		String ekleMesaj = mesaj.concat(" Yaþasýn!");
		System.out.println(ekleMesaj);
		System.out.println(mesaj);

		System.out.println(mesaj.startsWith("B"));// B ile baþlýyor mu ?
		System.out.println(mesaj.endsWith("l"));// l ile bitiyor mu ?

		char[] characters = new char[5];
		mesaj.getChars(0, 5, characters, 0);// Karakterleri karaktere ata ve karakterleri 0.indexinden itibaren aktar.
		System.out.println(characters);

		System.out.println(mesaj.indexOf('a'));// baþtan baþlar ve bulur.
		System.out.println(mesaj.lastIndexOf('e'));// sondan baþlar ve bulur.

		String yeniMesaj = mesaj.replace(' ', '-'); // YOÐUN KULLANILIR.
		System.out.println(yeniMesaj);

		System.out.println(mesaj.substring(2, 4));// 4 dahil deðil.

		for (String word : mesaj.split(" ")) { // kelimeleri ayýrmak için.
			System.out.println(word);
		}

		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.toLowerCase());
		// System.out.println(mesaj.trim()); //Metinin baþýndaki ve sonundaki boþluk
		// karakterlerini alýr.
	}

}
