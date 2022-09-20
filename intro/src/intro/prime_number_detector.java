package intro;

public class prime_number_detector {
	public static void main(String[] args) {
		int number = 1;
		int remainder = number % 2;
		
		//System.out.println(remainder);
		boolean isPrime = true;
		
		if(number <2)
		{
		System.out.println("Wrong number entered!"); 
		return;
		}
		
		for(int i=2; i<number; i++)
		{
		 if(number% i == 0)
		 {
			 isPrime = false;
		 }
		}
		
		 if(isPrime == true)
		 {
		 System.out.println("Prime Number!"); 
		 }
		 else
		 System.out.println("Number isn't Prime!"); 
		
	}

}
