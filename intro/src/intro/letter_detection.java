package intro;
public class letter_detection 
{
public static void main(String[] args) 
{
	char harf = 'A';
	
	switch (harf)
	{
		case 'A':
		case 'I':
		case 'O':
		case 'U':
		 System.out.println("Kalın Sesli Harf");
		 break;
		 
	default:
		 System.out.println("İnce Sesli Harf");
	}
}
}
/*
public class letter_detection 
{
	public static void main(String[] args) 
	{
		char sesliHarf = 'a';
		char[] kalinSesli = {'a','ı','o','u' };
		char[] inceSesli  = {'e','i','ö','ü' };
		
		for(int i = 0; i<kalinSesli.length; i++) 
		{
			if(sesliHarf == kalinSesli[i])
			{
				System.out.println("Kalın Sesli Harf");
			}
			else {
				System.out.println("Ince Sesli Harf");
			}
		}
	}
}
*/