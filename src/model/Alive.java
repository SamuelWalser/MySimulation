package model;

import processing.core.PApplet;

public class Alive extends ObjectInField {
	
	private String name;
	private double speed;

	public Alive(PApplet window, int xPos, int yPos, Shape shape, String name, double speed) {
		super(window, xPos, yPos, shape);
		this.name = name;
		this.speed = speed;
		
	}
	
	public double getDistanceKingWood(King k, Ressource w1) {
		double d = 0;
		double a = abs(k.getxPosition() - w1.getxPosition());
		double b = abs(k.getyPosition() - w1.getyPosition());

		d = Math.sqrt(a * a + b * b);
		return d;
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
	public double getSpeed() {
		return speed;
	}

	/**
	 * Wenn König oder Minion Wood berühren zieht es ab
	 */
	public void getWood() {
		// TODO Auto-generated method stub
		
	}
	
	

}
