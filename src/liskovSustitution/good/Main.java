package liskovSustitution.good;

public class Main {
	
	public static void main(String[] args) {
		Square square = new Square();
		square.setSideLength(20);
		
		//the response should be 400
		System.out.println(square.area());
	}
}
