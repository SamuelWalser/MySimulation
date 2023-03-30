package model;

import processing.core.PApplet;

public class Alive extends ObjectInField {
	
	private String name;
	private float speed;
	private float score;

	public Alive(PApplet window, float xPos, float yPos, Shape shape, String name, float speed, float score) {
		super(window, xPos, yPos, shape);
		this.name = name;
		this.speed = speed;
		this.score = score;
		
	}
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the speed
	 */
	public float getSpeed() {
		return speed;
	}

	/**
	 * Wenn König oder Minion Wood berühren zieht es ab
	 */
	public void getWood() {
		// TODO Auto-generated method stub
		
	}

	
	
	public float getScore() {
		  return score;
	}
	  
	/**
	 * erhöht die gesammelte Ressourcenzahl um 0.1
	 */
	public float addScore(float score) {
		return this.score+=0.1;
	}


	
	
	

}
