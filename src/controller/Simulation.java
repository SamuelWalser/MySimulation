package controller;

import processing.core.PApplet;
import processing.core.PImage;

import java.util.ArrayList;

import model.King;
import model.ObjectInField;
import model.Ressource;
import model.Shape;

public class Simulation extends PApplet {
	
	public King k;
	public Ressource w1;
	public Ressource s1;
	ArrayList<Ressource> wood;
	ArrayList<Ressource> stone;
	public Shape wooden = new Shape(30, 30, 0xA0522D00);
	public Shape stoned = new Shape(30, 30, 0x69696955);
	public Shape king = new Shape(50, 40, 0x7F00FF00);

	public static void main(String[] args) {
		
		PApplet.main("controller.Simulation");
	}
	
	
	
	public void initGame() {
		w1 = new Ressource(this, 500, 200, wooden, "Wood", 8.8);
		s1 = new Ressource(this, 300, 200, stoned, "Stone", 8.8);
		k = new King(k, 100, 100, king, "King", 5);
	}
	
	public void settings() {
		size(800, 600);
		initGame();
	}
	
	public void draw() {
		background(0XFFFFFFFF);
		drawRessources();
	}
	
	void drawRessources() {
		w1.drawWood();
		s1.drawStone();
	}

}




