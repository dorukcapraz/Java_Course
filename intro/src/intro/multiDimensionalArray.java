package intro;

public class multiDimensionalArray {
	public static void main(String[] args) {
		String[][] cities = new String[3][3];
		
		cities[0][0] = "Eindhoven";
		cities[0][1] = "Maastrich";
		cities[0][2] = "'sHertongenBosch";
		cities[1][0] = "Tilburg";
		cities[1][1] = "Limburg";
		cities[1][2] = "Utrecht";
		cities[2][0] = "Groningen";
		cities[2][1] = "Amsterdam";
		cities[2][2] = "Rotterdam ";
		
		for(int i=0; i<=2; i++) {
			System.out.println("--------------");
			for(int j=0; j<=2; j++) {
				System.out.println(cities[i][j]);
			}
		}
	}
}
  