package multiDimesionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		String[][] cities = new String [3][3];
		
		cities[0][0] = "�STANBUL";
		cities[0][1] = "KOCAEL�";
		cities[0][2] = "�ANAKKALE";
		
		cities[1][0] = "�ZM�R";
		cities[1][1] = "MU�LA";
		cities[1][2] = "AYDIN";
		
		cities[2][0] = "HAKKAR�";
		cities[2][1] = "HATAY";
		cities[2][2] = "MARD�N";
		
		for(int i=0;i<cities.length;i++) {
			
			System.out.println("-------------------"); 
	
			for(int j=0;j<cities.length;j++) {
				
				System.out.println(cities[i][j]);
				
			}
		}
		

	}

}
