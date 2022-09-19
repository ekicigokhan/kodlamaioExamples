package findNumber;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[]{1,2,5,7,9,0} ;
		int tobesearched = 7;
		boolean isThere = false;
		
		for(int number : numbers) {
			if(number == tobesearched) {
				isThere = true;
				break;
			}
		}
		
		if(isThere) {
			System.out.println("SAYI MEVCUT " + tobesearched);
		}else
			System.out.println("SAYI MEVCUT DEÐÝL " + tobesearched);
	}

}
