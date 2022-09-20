package intro;

public class Demo1 {
	public static void main(String[] args) 
	{
	int number1 = 100;
	int number2 = 25;
	int number3 = 2 ;
	
	int greatest = number1;
	
	if(greatest < number2)
	{
	greatest = number2;
	System.out.println("Greatest number is number2");
	}
	if(greatest < number3)
	{
		greatest = number3;
	System.out.println("Greatest number is number3");
	}
	
	System.out.println("Greatest number is:  " + greatest );
	
	}
}
