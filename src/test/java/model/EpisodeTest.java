package model;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import com.cyfres.model.Episode;

public class EpisodeTest {
	
	@Test
	public void testDate() {
		Episode episode = new Episode();
		Date date = new Date();
		episode.setDate(date);
		assertEquals(date, episode.getDate());
	}
	
	@Test
	public void testName() {
		Episode episode = new Episode();
		episode.setName("name");
		assertEquals("name", episode.getName());
	}
	
	@Test
	public void testSeason() {
		Episode episode = new Episode();
		episode.setSeason(1);
		assertEquals(1, episode.getSeason());
	}
	
	@Test
	public void testNumber() {
		Episode episode = new Episode();
		episode.setNumber("4x12");
		assertEquals("4x12", episode.getNumber());
	}
	

}