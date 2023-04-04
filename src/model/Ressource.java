package model;

import java.util.ArrayList;

import processing.core.PApplet;
import controller.*;


public class Ressource extends ObjectInField{
	String type;
	float amount;
	
	public Ressource(PApplet window, float xPos, float yPos, Shape shape, String type, float amount) {
		super(window, xPos, yPos, shape);
		this.type = type;
		this.amount = amount;
		
		
	}
	
	

	@Override
	public void drawWood() {
		// window.text(type, getxPosition(), getyPosition());
		
		window.fill(0xA0522D00);
		
		window.rect(getxPosition(), getyPosition(), 50, 50);
	}
	public void drawStone() {
		window.fill(0x69696955);
		
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
	public float getAmount() {
		return amount;
	}
	
	/**
	 * zieht von der Grösse der Ressource 0.1 ab
	 */
	public void cutAmount() {
		this.amount-=0.1f;
	}

	
	

}
