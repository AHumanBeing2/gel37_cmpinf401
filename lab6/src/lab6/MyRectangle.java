package lab6;

public class MyRectangle {
	
	private int width;
	private int height;
	
//startx and starty are the positions of the top left corner of the rectangle
//right for positive x, down for positive y
	
	private int startX;
	private int startY;
		
	
	public MyRectangle() {
		this.width = 0;
		this.height = 0;
		this.startX = 0;
		this.startY = 0;
	}
		
	public MyRectangle(int width, int height, int startX, int startY) {
		this.width = width;
		this.height = height;
		this.startX = startX;
		this.startY = startY;
	}

//return the area of the given MyRectangle	
	
	public int area() {
		int area;
		area = width * height;
		return area;
	}
	
//return the MyRectangle's information in the form of a String.
	
	public String toString() {
		StringBuilder S = new StringBuilder();
		S.append("Width: " + width);
		S.append(" height: " + height);
		S.append(" X: " + startX);
		S.append(" Y: " + startY);
		return S.toString();
	}

//Return true if point X, Y is inside the MyRectangle, and false otherwise
	
	public boolean isInside(int x, int y) {
		if(startX + width < x || startX > x) {
			return false;
		}
		else if(startY - height > y || startY < y){
			return false;
		}
		else{
			return true;
		}
			
	}
	public void setSize(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}
	
}
