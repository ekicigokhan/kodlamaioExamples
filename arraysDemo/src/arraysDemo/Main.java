package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String[] students = new String[5];
		students[0] = "GÖKHAN";
		students[1] = "MİRAÇ";
		students[2] = "SUHEYL";
		students[3] = "OSMAN";
		students[4] = "YUSUF";
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i]);
		}
		
		for(String student:students) {//student adında rastgele isim oluştu ve students gezildi.
			System.out.println(student);
		}
		
		
		
	}

}
