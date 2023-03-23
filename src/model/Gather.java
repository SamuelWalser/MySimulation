package model;

import processing.core.PApplet;
import java.util.*;

public class Gather extends Alive implements Count {

	public Gather(PApplet window, int xPos, int yPos, Shape shape, String name, double speed) {
		super(window, xPos, yPos, shape, name, speed);

	}

	/**
	 * Wenn König oder Minion Wood berühren zieht es ab
	 */
	@Override
	public void getWood() {

		int time = millis();
		double res = w1.getAmount();
		if (w1.getAmount() > 0) {
			if (getDistanceKingWood(k, w1) > 30) {
				while (res > 0) {
					if (millis() > time + 1000) {
						res--;
						time = millis();
					}
				}
			}
		}

	}

	/**
	 * fügt Ressourcen die vom König gesammelt werden zu einem counter hinzu
	 */

	public double countWood() {
		double counter = 0;
		int time = millis();
		if (getDistanceKingWood(k, w1) > 30) {
			if (millis() > time + 1000) {
				counter++;
				time = millis();
			}
		}
		return counter;
	}

}
