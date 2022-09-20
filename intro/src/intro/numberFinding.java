package intro;

public class numberFinding {
	public static void main(String[] args) {
		int[] numbers = new int[] {1,2,5,7,9,0};
		int toBeFound = 9;
		boolean found = false;
		
		for(int i = 0; i<numbers.length; i++) {
			if(numbers[i] == toBeFound) {
		System.out.println("Found It!");
				found = true;
			}
		}
		if(found == true)
		{
		}	
		else
		System.out.println("Couldn't Find It! Please try another number!");

}
}