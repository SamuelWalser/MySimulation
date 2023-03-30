package model;

import controller.Simulation;
import processing.core.PApplet;


public abstract class ObjectInField  {
	
	float xPosition;
	float yPosition;
	
	Shape shape;
	
	PApplet window;
	
	/**
	 * Constructor of the Objects in the Playfield
	 * @param xPosition
	 * @param yPosition
	 * @param color
	 */
	public ObjectInField(PApplet window, float xPos, float yPos, Shape shape) {
		this.window = window;
		xPosition = xPos;
		yPosition = yPos;
		
		this.shape = shape;
		
	}
	

	/**
	 * @return the window
	 */
	public PApplet getWindow() {
		return window;
	}


	/**
	 * @return the xPosition
	 */
	public float getxPosition() {
		return xPosition;
	}


	/**
	 * @return the yPosition
	 */
	public float getyPosition() {
		return yPosition;
	}


	
	
	/**
	 * @return the shape
	 */
	public Shape getShape() {
		return shape;
	}


	public void drawWood(){
	
	}
	public void drawStone() {
		
	}
	
	
	
		

}
