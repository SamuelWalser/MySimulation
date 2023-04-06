package model.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.King;
import model.ObjectInField;

public class testObjectInField {
	
	ObjectInField sut;
	
	@Before
	public void setup() {
		sut = new King(null, 300.4f, 200.4f, "King", 5);
	}
	
	@Test
	public void testGetxPosition() {
		assertEquals(300.4f, sut.getxPosition(), 0.0);
		
	}
	
	@Test
	public void testGetyPosition() {
		assertEquals(200.4f, sut.getyPosition(), 0.0);
		
	}

}
