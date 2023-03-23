package model;

import model.*;
import controller.*;
import processing.core.PApplet;
import processing.core.PImage;

public class Shape extends PApplet{
	
	
	
	double length;
	double width;
	int color;
	
	
	public Shape(double length, double width, int color) {
		this.length = length;
		this.width = width;
		this.color = color;
		
		
		
	}




	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}


	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}


	/**
	 * @return the color
	 */
	public int getColor() {
		return color;
	}


	
	

	
	
	

}
