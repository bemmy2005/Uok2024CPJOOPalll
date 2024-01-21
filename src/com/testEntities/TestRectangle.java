package com.testEntities;

import java.util.Scanner;

import com.entities.Rectangle;

public class TestRectangle {

	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	Rectangle r=new Rectangle(2,5);
	Rectangle rec=Rectangle.getRectangle();
	rec.setArea();
	rec.setPerim();
	r.setArea();
	r.setPerim();
	Rectangle rect=rec;
	Rectangle.displayRectangle(r);
	System.out.println(rec.toString());
	System.out.println(rect.toString());
	if(r==rec) {
		System.out.println("Rectngle 1 is equal to Rectngle 2");
	}else {
		System.out.println("They are not equal");
	}
}
}
