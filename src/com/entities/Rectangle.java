package com.entities;

public class Rectangle {
	private int length;
	private int width;
	private int area;
	private int perim;

	public Rectangle() {}

	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}

	public Rectangle(int length, int width, int area, int perim) {
		super();
		this.length = length;
		this.width = width;
		this.area = area;
		this.perim = perim;
	}

	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getArea() {
		return area;
	}
	public void setArea() {
		this.area = this.length*this.width;
	}
	public int getPerim() {
		return perim;
	}
	public void setPerim() {
		this.perim = (this.length+this.width)*2;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", area=" + area + ", perim=" + perim + "]";
	}
	public static void displayRectangle(Rectangle r) {
		System.out.println("Rectangle [length=" + r.getLength() + ", width=" + r.getWidth() + ", area=" + r.getArea() + ", perim=" + r.getPerim() + "]");
	}
	public static Rectangle getRectangle() {
		return new Rectangle(2,6);

	}
}
