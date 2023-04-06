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
		sut = new King(null, 300.4f, 200.4f, "King", 5, 5);
	}
	
	@Test
	public void testGetName() {
		assertEquals("King", sut.getName());
	}
	
	@Test
	public void testGetScoreWood() {
		assertEquals(5, sut.getScoreWood(), 0);
	}
	
	@Test
	public void testAddScoreWood() {
		sut.addScoreWood(5);
		assertEquals(6, sut.getScoreWood(), 0);

	}
	
	@Test
	public void testGetScoreStone() {
		assertEquals(5, sut.getScoreStone(), 0);
	}
	
	@Test
	public void testAddScoreStone() {
		sut.addScoreStone(5);
		assertEquals(6, sut.getScoreStone(), 0);

	}

}
