package model;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cyfres.model.Cast;

public class CastTest {

	@Test
	public void testName(){
		Cast cast = new Cast();
		cast.setName("name");
		assertEquals("name", cast.getName());
	}
	
	@Test
	public void testImage(){
		Cast cast = new Cast();
		cast.setImage("path/path");
		assertEquals("path/path", cast.getImage());
	}
}