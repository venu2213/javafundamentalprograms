package com.keywords;

public class Rectangle {
	
	void calculateArea() {
		int length=10;
		int width=20;
		int Area;
		Area=length*width;
		System.out.println("Area of rectangle:" +Area);
	}

	public static void main(String[] args) {
		
		System.out.println("Main method started!.....");
		
		Rectangle rec=new Rectangle();
		
		rec.calculateArea();
		
		System.out.println("Main method Ended!......");
		 

	}

}
