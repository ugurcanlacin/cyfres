package com.cyfres.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "seriesmeta", catalog = "cyfres")
public class Seriesmeta implements java.io.Serializable {

	private Integer id;
	private int casts;
	private int genres;

	public Seriesmeta() {
	}

	public Seriesmeta(int casts, int genres) {
		this.casts = casts;
		this.genres = genres;
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

	@Column(name = "casts", nullable = false)
	public int getCasts() {
		return this.casts;
	}

	public void setCasts(int casts) {
		this.casts = casts;
	}

	@Column(name = "genres", nullable = false)
	public int getGenres() {
		return this.genres;
	}

	public void setGenres(int genres) {
		this.genres = genres;
	}

}
