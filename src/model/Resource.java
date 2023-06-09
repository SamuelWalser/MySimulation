package model;

import java.util.ArrayList;

import processing.core.PApplet;
import controller.*;


public class Resource extends ObjectInField {
	String type;
	int amount;
	
	public Resource(PApplet window, float xPos, float yPos, String type, int amount) {
		super(window, xPos, yPos);
		this.type = type;
		this.amount = amount;
				
	}
	
	public void drawWood() {
		
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
	public int getAmount() {
		return amount;
	}
	
	/**
	 * removes 1 of the resource
	 */
	public void cutAmount() {
		this.amount-=1;
	}

	
	

}
