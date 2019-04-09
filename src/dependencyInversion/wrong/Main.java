package dependencyInversion.wrong;


public class Main {
	
	public static void main(String[] args) {

		GreatCalculator calculator = new GreatCalculator();
		calculator.calculate();
		System.out.println("Total Area: " + calculator.getTotalAreas());
		System.out.println("Total Perimeter: " + calculator.getTotalPerimeters());
	}
}
