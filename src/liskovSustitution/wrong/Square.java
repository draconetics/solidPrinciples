package liskovSustitution.wrong;

public class Square extends Rectangle{

	public Square(double side, double height, double width) {
		super(side, height, width);
	}
	
	@Override
	public void setHeight(double height) {
        super.setHeight(height);
        super.setWidth(height);
	}
	
	@Override 
	public void setWidth(double width) {
        super.setHeight(width);
        super.setWidth(width);
	}

}
