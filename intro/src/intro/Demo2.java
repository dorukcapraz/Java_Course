package intro;

public class Demo2 {
	public static void main(String[] args) {
		double[] myList = {1.2,1.3,4.4,5.5};
		double total = 0;
		double max = myList[0];
		for(double number:myList) {
			if(max<number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}
		System.out.println("Summary = " + total);
		System.out.println("Max Value = " + max);
	}
}
