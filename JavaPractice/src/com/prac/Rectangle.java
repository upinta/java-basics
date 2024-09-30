package com.prac;

public class Rectangle {
	public Point topLeft;
	public int height;
	public int width;
	
	Integer getArea() {
		return this.height * this.width;
	}
	
	Integer getPerimeter() {
		return 2*(this.height+this.width);
	}
	
	Point getBottomRight() {
		Point bottomRight = new Point();
		bottomRight.x = this.topLeft.x+this.width;
		bottomRight.y = this.topLeft.y-this.height;
		return bottomRight;
		
	}
}
