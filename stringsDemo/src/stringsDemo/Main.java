package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bug�n Hava �ok G�zel.";
		System.out.println(mesaj);

		System.out.println("Eleman say�s� : " + mesaj.length());
		System.out.println("5.eleman : " + mesaj.charAt(4)); // 4.index'deki eleman� bul.

		String ekleMesaj = mesaj.concat(" Ya�as�n!");
		System.out.println(ekleMesaj);
		System.out.println(mesaj);

		System.out.println(mesaj.startsWith("B"));// B ile ba�l�yor mu ?
		System.out.println(mesaj.endsWith("l"));// l ile bitiyor mu ?

		char[] characters = new char[5];
		mesaj.getChars(0, 5, characters, 0);// Karakterleri karaktere ata ve karakterleri 0.indexinden itibaren aktar.
		System.out.println(characters);

		System.out.println(mesaj.indexOf('a'));// ba�tan ba�lar ve bulur.
		System.out.println(mesaj.lastIndexOf('e'));// sondan ba�lar ve bulur.

		String yeniMesaj = mesaj.replace(' ', '-'); // YO�UN KULLANILIR.
		System.out.println(yeniMesaj);

		System.out.println(mesaj.substring(2, 4));// 4 dahil de�il.

		for (String word : mesaj.split(" ")) { // kelimeleri ay�rmak i�in.
			System.out.println(word);
		}

		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.toLowerCase());
		// System.out.println(mesaj.trim()); //Metinin ba��ndaki ve sonundaki bo�luk
		// karakterlerini al�r.
	}

}
