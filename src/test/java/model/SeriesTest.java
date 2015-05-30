package model;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cyfres.model.Series;

public class SeriesTest {

	private Integer id;
	private String name;
	private String rating;
	private String ratingCount;
	private String image;
	private String critic;
	private String review;
	private String lastUpdate;
	private String lastEpisode;
	private String latestEpisode;
	private String url;
	
	@Test
	public void testName(){
		Series series = new Series();
		series.setName("name");
		assertEquals("name", series.getName());
	}
	@Test
	public void testRating(){
		Series series = new Series();
		series.setRating("rating");
		assertEquals("rating", series.getRating());
	}
	@Test
	public void testRatingCount(){
		Series series = new Series();
		series.setRatingCount("123");
		assertEquals("123", series.getRatingCount());
	}
	@Test
	public void testImage(){
		Series series = new Series();
		series.setImage("/path/path");
		assertEquals("/path/path", series.getImage());
	}
	@Test
	public void testCritic(){
		Series series = new Series();
		series.setCritic("critic");
		assertEquals("critic", series.getCritic());
	}
	@Test
	public void testReview(){
		Series series = new Series();
		series.setReview("Review");
		assertEquals("Review", series.getReview());
	}
	@Test
	public void testLastUpdate(){
		Series series = new Series();
		series.setLastUpdate("update");
		assertEquals("update", series.getLastUpdate());
	}
	@Test
	public void testLastEpisode(){
		Series series = new Series();
		series.setLastEpisode("test");
		assertEquals("test", series.getLastEpisode());
	}
	@Test
	public void testLatestEpisode(){
		Series series = new Series();
		series.setLatestEpisode("test");
		assertEquals("test", series.getLatestEpisode());
	}
	@Test
	public void testUrl(){
		Series series = new Series();
		series.setUrl("blabla.com");
		assertEquals("blabla.com", series.getUrl());
	}

}
