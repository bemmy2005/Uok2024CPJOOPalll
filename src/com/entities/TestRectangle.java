package com.entities;

import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Rectangle r=new Rectangle();
		System.out.println("Enter the value of Length: ");
		//int l=input.nextInt();
		r.setLength(input.nextInt());
		System.out.println("Enter the value of Width: ");
		//int w =input.nextInt();
		r.setWidth(input.nextInt());
		r.setArea();
		r.setPerim();
		System.out.println("The area is "+r.getArea());
		System.out.println("The perim is "+r.getPerim());
		//String allString=r.toString();
		System.out.println(r.toString());


	}

}
