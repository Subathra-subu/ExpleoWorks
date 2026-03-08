package handsOn_6__3;

public abstract class Shape {
	
	protected String color = "red";
	protected boolean isFilled = true;
	
	public Shape() {
	}

	public Shape(String color, boolean isFilled) {
		this.color = color;
		this.isFilled = isFilled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();

	@Override
	public String toString() {
		return "Shape [color=" + getColor() + ", isFilled()=" + isFilled + "]";
	}
	
	
	
}
