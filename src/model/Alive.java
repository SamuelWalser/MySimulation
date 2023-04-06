package model;

import processing.core.PApplet;

public class Alive extends ObjectInField {
	
	private String name;
	private float score;

	public Alive(PApplet window, float xPos, float yPos, String name, float score) {
		super(window, xPos, yPos);
		this.name = name;
		this.score = score;
		
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @return the score
	 */
	public float getScore() {
		  return score;
	}
	  
	/**
	 * increase the amount of score 0.1
	 */
	public float addScore(float score) {
		return this.score+=0.1f;
	}


	
	
	

}
