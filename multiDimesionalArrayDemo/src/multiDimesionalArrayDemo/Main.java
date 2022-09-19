package multiDimesionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		String[][] cities = new String [3][3];
		
		cities[0][0] = "ÝSTANBUL";
		cities[0][1] = "KOCAELÝ";
		cities[0][2] = "ÇANAKKALE";
		
		cities[1][0] = "ÝZMÝR";
		cities[1][1] = "MUÐLA";
		cities[1][2] = "AYDIN";
		
		cities[2][0] = "HAKKARÝ";
		cities[2][1] = "HATAY";
		cities[2][2] = "MARDÝN";
		
		for(int i=0;i<cities.length;i++) {
			
			System.out.println("-------------------"); 
	
			for(int j=0;j<cities.length;j++) {
				
				System.out.println(cities[i][j]);
				
			}
		}
		

	}

}
