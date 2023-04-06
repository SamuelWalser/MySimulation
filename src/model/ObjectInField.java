package model;

import controller.Simulation;
import processing.core.PApplet;


public abstract class ObjectInField  {
	
	float xPosition;
	float yPosition;
	
	PApplet window;
	
	/**
	 * Constructor of the Objects in the Playfield
	 * @param xPosition
	 * @param yPosition
	 * @param color
	 */
	public ObjectInField(PApplet window, float xPos, float yPos) {
		this.window = window;
		xPosition = xPos;
		yPosition = yPos;
		
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
	
	

}
