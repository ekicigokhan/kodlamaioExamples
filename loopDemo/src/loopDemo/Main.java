package loopDemo;

public class Main {

	public static void main(String[] args) {
		//FOR DÖNGÜSÜ
		for(int i=1;i <=10; i++) {
			System.out.println(i);
		}
		System.out.println("FOR DONGUSU BİTTİ !!!!!!!!!!!!!!!!");
		//WHİLE DÖNGÜSÜ
		int i =1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		System.out.println("WHİLE DONGUSU BİTTİ !!!!!!!!!!!!!!");
		//DO WHİLE DÖNGÜSÜ
		int j =100;//DONGU ÇALIŞMASA BİLE OPERASYON 1 KERE ÇALIŞIR. 
		do{
			System.out.println(j);
			j++;
			
		}while(j<=10);
			
	}

}
