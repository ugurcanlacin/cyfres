package model;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cyfres.model.Genre;

public class GenreTest {
	
	@Test
	public void testGenreName() {
		Genre genre = new Genre();
		genre.setName("Sci-Fi");
		assertEquals("Sci-Fi", genre.getName());
	}
	
	@Test
	public void testGenreId() {
		Genre genre = new Genre();
		genre.setId(1);
		assertEquals(1, genre.getId());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGenreIdNegativeNumber() {
		Genre genre = new Genre();
		genre.setId(-51);
	}
	
}
