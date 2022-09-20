package intro;

public class loops {
	public static void main(String[] args) {
		//For Loop Examples
		for(int i = 1; i<=10; i++)
		{
		System.out.println("i = " + i);
		}
		
		for(int j = 0; j<=10; j+=2)
		{
		System.out.println("j = " + j);
		}
		
		//While Loop Examples
		int i = 1;
		while(i<10) {
			System.out.println("i = " + i);
			i++;
		}
		System.out.println("While loop has ended");
		
		
		//Do-While Loop Examples
		int j=100;
		do {
			System.out.println(j);
			j+=2;
		   }
		while(j<10);
		System.out.println("Do-While loop has ended");
	}
}
