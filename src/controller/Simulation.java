package controller;

import processing.core.PApplet;
import processing.core.PImage;

import java.util.ArrayList;

import model.*;

/**
 * the main Class and controller of everything
 * @author samuw
 *
 */
public class Simulation extends PApplet {
	
	public King k;
	
	ArrayList<Resource> wood;
	ArrayList<Resource> stone;
	
	private int woodAmount = 0;
	private int stoneAmount = 0;

	public static void main(String[] args) {
		
		PApplet.main("controller.Simulation");
	}
	
	public void setup() {
		frameRate(5);
	}
	
	public void settings() {
		size(800, 600);
		initGame();
	}
	
	public void draw() {
		background(0XFFFFFFFF);
		drawRessources();
		k.drawKing();
		drawCounters();
		gathering();
	}
	/**
	 * calculates the distance between the king and a resource
	 * @param k
	 * @param r
	 * @return
	 */
	public double getDistanceKingResource(King k, Resource r) {
		double d = 0;
		double a = k.getxPosition() - r.getxPosition();
		double b = k.getyPosition() - r.getyPosition();

		d = sqrt((float) ((a * a) + (b * b)));
		return d;
	}
	
	
	public void initGame() {
		
		k = new King(this, 100, 100, "King", 0, 0);
		wood = new ArrayList<>();
		stone = new ArrayList<>();
		
		
		// add wood tiles 
		for (int i = 0; i < 3; i++) {
			wood.add(new Resource(this, random(200, 500), random(200, 500), "Wood", 60));
		}
		// add stone tiles
		for (int i = 0; i < 3; i++) {
			stone.add(new Resource(this, random(200, 500), random(200, 500), "Stone", 60));
		}
	}
	
	
	/**
	 * draws the counters for how many resources the player has
	 */
	public void drawCounters() {
		text("Wood: " + woodAmount, 20, 30);
		text("Stone: " + stoneAmount, 200, 30);
	}

	/**
	 * draws the resources
	 */
	public void drawRessources() {
		for (int i = 0; i < wood.size(); i++) {
			Resource w = wood.get(i);
			w.drawWood();
		}
		for (int i = 0; i < stone.size(); i++) {
			Resource s = stone.get(i);
			s.drawStone();
		}
		
	}
	
	/**
	 * removes points from resources and 
	 * adds points to the counter
	 * if the king touches a resource-tile
	 */
	public void gathering() {
		int i = 0;
		int a = 0;
		int time = millis();
//		if(wood.size() > 0) {
		while(i < wood.size()) {
			Resource w = wood.get(i);
			if (getDistanceKingResource(k, w) < 30) {
				if (millis() < time + 1000) {
					if(w.getAmount() > 0) {
						k.addScoreWood(k.getScoreWood()); // Ressourcencount von King erhöhen
						woodAmount = k.getScoreWood(); // Anzahl Ressourcen = Ressourcencount von King
					}
					
					System.out.println(w.getAmount());
					if(w.getAmount() <= 0) {
						wood.remove(i);
					} else {
						w.cutAmount(); // Anzahl von dem Ressourcenfeld abziehen
					}
					time = millis();
				}
			}
			i++;
		}
//		if(stone.size() > 0) {
		while(a < stone.size()) {
			Resource s = stone.get(a);
			if (getDistanceKingResource(k, s) < 30) {
				if (millis() < time + 1000) {
					if(s.getAmount() > 0) {
						k.addScoreStone(k.getScoreStone()); // Ressourcencount von King erhöhen
						stoneAmount = k.getScoreStone(); // Anzahl Ressourcen = Ressourcencount von King
					}
					
					System.out.println(s.getAmount());
					if(s.getAmount() <= 0) {
						stone.remove(a);
					} else {
						s.cutAmount(); // Anzahl von dem Ressourcenfeld abziehen
					}
					time = millis();
				}
			}
			a++;
		}
		
	}
	
	
	/**
	 * movement of the king
	 */
	public void keyPressed() {
		
		switch (key) {
		case 'w':
			k.moveUp();
			break;
		case 'a':
			k.moveLeft();
			break;
		case 's':
			k.moveDown();
			break;
		case 'd':
			k.moveRight();
			break;
			
		}
	}

}




