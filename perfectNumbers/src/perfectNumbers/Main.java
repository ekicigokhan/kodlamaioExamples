package perfectNumbers;

public class Main {

	public static void main(String[] args) {
		// Kendinden baþka pozitif tüm tam bölenlerinin sayýsýnýn toplamý kendine eþit
		// olan sayýlar.
		// 6--->1+2+3 =6
		// 28--->1+2+4+7+14 =28
		int number = 28;
		int total = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total += i;
			}

		}
		if (total == number) {
			System.out.println("Girdiðiniz " + number + " sayýsý mükemmel sayýdýr.");
		} else {
			System.out.println("Girdiðiniz " + number + " sayýsý mükemmel sayý deðildir.");
		}
	}

}
