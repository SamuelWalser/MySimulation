package model.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Alive;
import model.King;

public class testAlive {
	
	Alive sut;
	
	@Before
	public void setup() {
		sut = new King(null, 300.4f, 200.4f, "King", 5);
	}
	
	@Test
	public void testGetName() {
		assertEquals("King", sut.getName());
	}
	
	@Test
	public void testGetScore() {
		assertEquals(5, sut.getScore(), 0.0);
	}
	
	@Test
	public void testAddScore() {
		sut.addScore(5);
		assertEquals(5.1f, sut.getScore(), 0.0);

	}

}
