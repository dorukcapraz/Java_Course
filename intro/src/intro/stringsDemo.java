package intro;

public class stringsDemo {
	public static void main(String[] args) {
		String message  = "Weather is nice!";
		String message1 = "    Weather is nice!    ";
		System.out.println(message );

		System.out.println("Chracter Number: " + message.length() );
		System.out.println("5th Chracter: " + message.charAt(5));

		System.out.println(message.concat(" Let's go Outside!!"));
		System.out.println(message.startsWith("W"));
		System.out.println(message.startsWith("D"));
		System.out.println(message.endsWith("!"));
		System.out.println(message.endsWith("M"));
		
		char[] chracters = new char[5];
		message.getChars(0, 4, chracters, 0);
		System.out.println(chracters);
		System.out.println(message.indexOf("e"));
		System.out.println(message.indexOf("i"));
		System.out.println(message.lastIndexOf("i"));

		System.out.println(message.replace(" ", "-"));
		System.out.println(message.substring(2));
		System.out.println(message.substring(2,5));
		
		for(String word: message.split(" "))
		{
			System.out.println(word);
		}
		
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		
		System.out.println(message1);
		System.out.println(message1.trim());
		
		
	}
}
 