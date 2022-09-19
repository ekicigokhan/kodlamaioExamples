package recapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList = { 1.0, 7.0, 3.0, 4.0, 5.0 };
		double total = 0;
		double max = myList[0];
		for (double number : myList) {
			if (max < number) {
				max = number;
			}

			total = total + number;
			System.out.println(number);
		}
		System.out.println("TOPLAM = " + total);
		System.out.println("EN BÜYÜK SAYI = " + max);

		System.out.println("-------BENÝM PROJEM-------");
		
		int[] numbers = { 2, 4, 6, 8, 10 };
		int maxx = numbers[0];
		for (int travelnumbers : numbers) {
			if (maxx < travelnumbers) {
				maxx = travelnumbers;
			}
		}
		System.out.println("EN BUYUKSAYI : " + max);
	}

}
