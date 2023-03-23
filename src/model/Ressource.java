package model;

import java.util.ArrayList;

import processing.core.PApplet;


public class Ressource extends ObjectInField{
	String type;
	double amount;
	
	public Ressource(PApplet window, int xPos, int yPos, Shape shape, String type, double amount) {
		super(window, xPos, yPos, shape);
		this.type = type;
		this.amount = amount;
		
		
	}
	
	@Override
	public void drawWood() {
		// window.text(type, getxPosition(), getyPosition());
		
		window.fill(wooden.getColor());
		
		window.rect(getxPosition(), getyPosition(), 50, 50);
	}
	public void drawStone() {
		window.fill(stoned.getColor());
		
		window.rect(getxPosition(), getyPosition(), 50, 50);
		
	}


	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}


	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}
	
	

}
