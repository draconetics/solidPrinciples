package dependencyInversion.good;

public class Square implements IGeometricShape{

	private double sides;
	private double sideLength;
	
	public Square() {
		sides = 4;
	}
	
	public Square(double sideLength){ 
		sides = 4;
		this.sideLength = sideLength;
	}

	public double getSides() {
		return sides;
	}


	public double getSideLength() {
		return sideLength;
	}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}

	
	@Override
	public double area() {
		double area = 0;
		area = sideLength * sideLength;
		return area;
	}



	@Override
	public double perimeter() {
		double area = 0;
		area = sideLength * 4;
		return area;
	}
}
