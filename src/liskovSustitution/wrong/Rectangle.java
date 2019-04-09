package liskovSustitution.wrong;

import java.util.ArrayList;
import java.util.List;

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
	
	
	public Rectangle() {
		
	}
	
	public Rectangle(double side, double height, double width) {
		super();
		this.side = side;
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
		area += (height * width);
		return area;
	}



	@Override
	public double perimeter() {
		double area = 0;
		area += (height * 2) + (width * 2);
		return area;
	}
	


	public static void main(String[] args) {
		List<Double> listAreas = new ArrayList<Double>();
		listAreas.add(new Rectangle(0, 10, 20).area());
		listAreas.add(new Rectangle(0, 10, 20).area());
		listAreas.add(new Rectangle(0, 20, 30).area());
		
		double sumArea = 0;
		for (Double area : listAreas) {
			sumArea += area;
		}
		
		//10*20 + 10*20 + 20*30 = 1000
		System.out.println(sumArea);
	}
}
