package perfectNumbers;

public class Main {

	public static void main(String[] args) {
		// Kendinden ba�ka pozitif t�m tam b�lenlerinin say�s�n�n toplam� kendine e�it
		// olan say�lar.
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
			System.out.println("Girdi�iniz " + number + " say�s� m�kemmel say�d�r.");
		} else {
			System.out.println("Girdi�iniz " + number + " say�s� m�kemmel say� de�ildir.");
		}
	}

}
