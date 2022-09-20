package intro;

public class arrays {
	public static void main(String[] args) {
		String [] students = new String[3];
		students[0] = "Doruk";
		students[1] = "George";
		students[2] = "Mike";
		
		for(int i = 0; i<students.length; i++) {
			System.out.println(students[i]);
		}
		for(String student:students)
		{
			System.out.println(student);
		}
		
		
	}
} 
