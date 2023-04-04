package controller;

import processing.core.PApplet;
import processing.core.PImage;

import java.util.ArrayList;

import model.*;


public class Simulation extends PApplet {
	
	public King k;
	public Ressource w1;
	public Ressource s1;
	
	ArrayList<Ressource> wood;
	ArrayList<Ressource> stone;
	public Shape wooden = new Shape(30, 30, 0xA0522D00);
	public Shape stoned = new Shape(30, 30, 0x69696955);
	public Shape king = new Shape(50, 40, 0x7F00FF00);
	float woodAmount = 0;
	float stoneAmount = 0;

	public static void main(String[] args) {
		
		PApplet.main("controller.Simulation");
	}
	
//	public void setup() {
//		frameRate(5);
//	}
	
	public void settings() {
		size(800, 600);
		initGame();
	}
	
	public void draw() {
		background(0XFFFFFFFF);
		drawRessources();
		k.drawKing();
		drawcounters();
		gathering();
	}
	
	public double getDistanceKingWood(King k, Ressource w1) {
		double d = 0;
		double a = k.getxPosition() - w1.getxPosition();
		double b = k.getyPosition() - w1.getyPosition();

		d = sqrt((float) ((a * a) + (b * b)));
		return d;
	}
	
	public void initGame() {
		w1 = new Ressource(this, 500, 200, wooden, "Wood", (float) 8.8);
		s1 = new Ressource(this, 300, 200, stoned, "Stone", (float) 8.8);
		
		k = new King(this, 100, 100, king, "King", 5, 0);
		wood = new ArrayList<>();
		//wood.add(w1);
		
		for (int i = 0; i < 3; i++) {
			wood.add(new Ressource(this, random(200, 500), random(200, 500), wooden, "Wood", (float) 8.8));
		}
	}
	
	
	
	/**
	 * Zeichnet die Anzeige für die gesammelten Ressourcen der ObjectInField
	 */
	public void drawcounters() {
		text("Wood: " + woodAmount, 20, 30);
		text("Stone: " + stoneAmount, 200, 30);
	}



	public void drawRessources() {
		for (int i = 0; i < wood.size(); i++) {
			Ressource w = wood.get(i);
			w.drawWood();
		}
		s1.drawStone();
	}
	
	public void gathering() {
		int i = 0;
		int time = millis();
		while (i < wood.size()) {
			Ressource w = wood.get(i);
			if (getDistanceKingWood(k, w) < 30) {
				if (millis() > time + 1000) {
					k.addScore(k.getScore()); // Ressourcencount von King erhöhen
					woodAmount = k.getScore(); // Anzahl Ressourcen = Ressourcencount von King
				
				
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
	}
	
	
	
	
	/**
	 * Methode für die Bewegungen vom King
	 */
	public void keyPressed() {
		// während des eigentlichen Spiels
		
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
	
	
	
//	int time = millis();
//	double res = w1.getAmount();
//	if (w1.getAmount() > 0) {
//		if (getDistanceKingWood(k, w1) < 30) {
//			while (res > 0) {
//				if (millis() > time + 1000) {
//					res-=0.1;
//					time = millis();
//				}
//			}
//		}
//	}
//	
//	int time = millis();
//	if (getDistanceKingWood(k, w1) < 30) {
//		if (millis() > time + 1000) {
//			counter+=0.1;
//			time = millis();
//		}
//	}

}




