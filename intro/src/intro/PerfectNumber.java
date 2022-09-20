package intro;

public class PerfectNumber {
	public static void main(String[] args) {
		//6  --> 1,2,3
		//28 --> 1,2,4,7,14
		int number = 28;
		int sum    = 0;
		boolean isPerfect = true;
		
		for(int i=1; i<number; i++)
		{
			if(number% i == 0)
			 {
				 sum=sum+i;
			 }
			System.out.println(sum); 	
		}
		 if(sum == number)
		 {
		 System.out.println("It's a Perfect Number!"); 
		 }
		 else
		 System.out.println("It's not a perfect Number"); 
	}
}

