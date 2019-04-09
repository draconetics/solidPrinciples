package interfaceSegregation.good;


public class EquilateralTriangle implements IGeometricShape{
	
	private double sides;
	private double sideLength;
	
	public EquilateralTriangle (double sideLenth) {

		this.sideLength = sideLenth;
		this.sides = 3;
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
		area =  (Math.sqrt(3)/4) * Math.pow(sideLength, 2);
		return area;
	}

	@Override
	public double perimeter() {
		return sideLength * 3;
	}
	
	
}
