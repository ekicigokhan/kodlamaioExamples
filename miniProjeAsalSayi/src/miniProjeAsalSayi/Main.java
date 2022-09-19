package miniProjeAsalSayi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Asal sayý testi için bir sayý giriniz.");
		int number ;
		number = scanner.nextInt();
		int remainder = number % 2; //kalan operatörü mod alma
		boolean isPrime = true;
		
		if(number < 2){
			System.out.println("Geçersiz sayý girdiniz !");
			return;
		}
		
		for (int i = 2; i < number; i++) {
			if(number % i == 0){
				isPrime = false; 
			}
		}
		if(isPrime ) {
			System.out.println("SAYI ASALDIR. :" + number);
		}else {
			System.out.println("SAYI ASAL DEÐÝLDÝR. :" + number);
		}
	}

}
