package dependencyInversion.wrong;


/**
 * 
 *
 * @author draconetics
 *
 */

public class Rectangle implements IGeometricShape{

	private double side;
	private double height;
	private double width;
	
	
	public Rectangle(double height, double width) {

		this.side = 4;
		this.height = height;
		this.width = width;
	}



	public double getSide() {
		return side;
	}



	public void setSide(double side) {
		this.side = side;
	}



	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}



	public double getWidth() {
		return width;
	}

	
	public void setWidth(double width) {
		this.width = width;
	}




	@Override
	public double area() {
		double area = 0;
		area = height * width;
		return area;
	}



	@Override
	public double perimeter() {
		double area = 0;
		area = (height * 2) + (width * 2);
		return area;
	}
	

}
