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
				System.out.println("Kal�n �nl�");
				break;
			case 'E':
			case '�':
			case '�':
			case '�':
				System.out.println("�nce �nl�");
				break;
			default:
				System.out.println("Kal�n Harf Girdiniz.");
			}
		}

	}


