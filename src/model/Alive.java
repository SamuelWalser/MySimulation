package model;

import processing.core.PApplet;

public class Alive extends ObjectInField {
	
	private String name;
	private int scoreWood;
	private int scoreStone;

	public Alive(PApplet window, float xPos, float yPos, String name, int scoreWood, int scoreStone) {
		super(window, xPos, yPos);
		this.name = name;
		this.scoreWood = scoreWood;
		this.scoreStone = scoreStone;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @return the scoreWood
	 */
	public int getScoreWood() {
		  return scoreWood;
	}
	
	/**
	 * 
	 * @return the scoreStone
	 */
	public int getScoreStone() {
		  return scoreStone;
	}
	  
	/**
	 * increase the amount of scoreWood with 1
	 */
	public int addScoreWood(int scoreWood) {
		return this.scoreWood+=1;
	}

	/**
	 * increase the amount of scoreWood with 1
	 */
	public int addScoreStone(int scoreStone) {
		return this.scoreStone+=1;
	}
	
	
	

}
