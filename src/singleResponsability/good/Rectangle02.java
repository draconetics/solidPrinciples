package singleResponsability.good;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *
 * @author draconetics
 *
 */

public class Rectangle02 {

	private double side;
	private double height;
	private double width;
	
	
	public Rectangle02(double side, double height, double width) {
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


	public static void main(String[] args) {
		List<Rectangle02> listRectangles = new ArrayList<Rectangle02>();
		listRectangles.add(new Rectangle02(0, 10, 20));
		listRectangles.add(new Rectangle02(0, 10, 20));
		listRectangles.add(new Rectangle02(0, 20, 30));
		
		AreaOperations areaOperations = new AreaOperations();
		
		//10*20 + 10*20 + 20*30 = 1000
		double resp = areaOperations.sumAreas(listRectangles);
		System.out.println(resp);
	}
}
