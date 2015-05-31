package model;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cyfres.model.Seriesmeta;

public class SeriesmetaTest {
	
	@Test
	public void testGenres(){
		Seriesmeta smeta = new Seriesmeta();
		smeta.setGenres(1);
		assertEquals(1, smeta.getGenres());
	}

	@Test
	public void testCasts(){
		Seriesmeta smeta = new Seriesmeta();
		smeta.setCasts(2);
		assertEquals(2, smeta.getCasts());
	}
}
