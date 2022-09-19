import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
			System.out.println("Bir harf giriniz.");
			char letter = scan.next().charAt(0);
			switch (letter) {
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Kalýn ünlü");
				break;
			case 'E':
			case 'Ý':
			case 'Ü':
			case 'Ö':
				System.out.println("Ýnce Ünlü");
				break;
			default:
				System.out.println("Kalýn Harf Girdiniz.");
			}
		}

	}


