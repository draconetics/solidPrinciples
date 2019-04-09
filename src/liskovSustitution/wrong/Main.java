package liskovSustitution.wrong;

public class Main {
	
	public static void main(String[] args) {
		Rectangle rectangle = new Square(0, 20, 20);
		rectangle.setHeight(10);
		rectangle.setWidth(20);
		//square extends of rectangle.
		//square just add new functions to rectangle parent, 
		//dont deny that a square is still a rectangle
		
		//result should be 20*10=200 but
		//It is 20*20=400;
		System.out.println(rectangle.area());
	}
}
