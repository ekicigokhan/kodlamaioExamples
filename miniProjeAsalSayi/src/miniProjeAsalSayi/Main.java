package miniProjeAsalSayi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Asal say� testi i�in bir say� giriniz.");
		int number ;
		number = scanner.nextInt();
		int remainder = number % 2; //kalan operat�r� mod alma
		boolean isPrime = true;
		
		if(number < 2){
			System.out.println("Ge�ersiz say� girdiniz !");
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
			System.out.println("SAYI ASAL DE��LD�R. :" + number);
		}
	}

}
