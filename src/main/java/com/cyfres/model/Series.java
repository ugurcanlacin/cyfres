package com.cyfres.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "series", catalog = "cyfres")
public class Series implements java.io.Serializable {

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

	public Series() {
	}


	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "rating", length = 64)
	public String getRating() {
		return this.rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	@Column(name = "ratingCount", length = 64)
	public String getRatingCount() {
		return this.ratingCount;
	}

	public void setRatingCount(String ratingCount) {
		this.ratingCount = ratingCount;
	}

	@Column(name = "image")
	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Column(name = "critic")
	public String getCritic() {
		return this.critic;
	}

	public void setCritic(String critic) {
		this.critic = critic;
	}

	@Column(name = "review")
	public String getReview() {
		return this.review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	@Column(name = "lastUpdate")
	public String getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Column(name = "lastEpisode")
	public String getLastEpisode() {
		return this.lastEpisode;
	}

	public void setLastEpisode(String lastEpisode) {
		this.lastEpisode = lastEpisode;
	}

	@Column(name = "latestEpisode")
	public String getLatestEpisode() {
		return this.latestEpisode;
	}

	public void setLatestEpisode(String latestEpisode) {
		this.latestEpisode = latestEpisode;
	}

	@Column(name = "url")
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
