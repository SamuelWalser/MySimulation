package model;

import processing.core.PApplet;

public class King extends Alive implements Moveable {

	public King(PApplet window, float xPos, float yPos,  String name, float score) {
		super(window, xPos, yPos, name, score);
		
	}
	
	// abilities	
	
		public void moveDown(){
			yPosition += 5;
		}

		public void moveUp(){
			yPosition -= 5;
		}

		public void moveLeft(){
			xPosition -= 5;
		}

		public void moveRight(){
			xPosition += 5;
		}

		public void drawKing() {
			window.rectMode(window.CENTER);
			window.noStroke();
			window.fill(153,102,204);
			window.rect(xPosition, yPosition, 50, 40, 7);
			
		}

}
