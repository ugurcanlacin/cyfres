package com.cyfres.model;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * @author Uðurcan Laçin
 */
@Entity
@Table(name = "user", catalog = "cyfres", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User implements java.io.Serializable {

	private Integer id;
	private String name;
	private String nick;
	private String password;
	private String email;
	private Integer level;
	private Date creationTimestamp;
	private String activation;
	private boolean actived;
	private boolean forgot;

	public User() {
	}

	public User(String name, String nick, String password) {
		this.name = name;
		this.nick = nick;
		this.password = password;
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

	@Column(name = "name", length = 64)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "nick", nullable = false, length = 64)
	public String getNick() {
		return this.nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	@Column(name = "password", nullable = false)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "email", unique = true, nullable = false, length = 64)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "level")
	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "creation_timestamp", nullable = false, length = 10)
	public Date getCreationTimestamp() {
		return this.creationTimestamp;
	}

	public void setCreationTimestamp(Date creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	@Column(name = "activation")
	public String getActivation() {
		return this.activation;
	}

	public void setActivation(String activation) {
		this.activation = activation;
	}

	@Column(name = "actived", nullable = false)
	public boolean isActived() {
		return this.actived;
	}

	public void setActived(boolean actived) {
		this.actived = actived;
	}

	@Column(name = "forgot", nullable = false)
	public boolean isForgot() {
		return this.forgot;
	}

	public void setForgot(boolean forgot) {
		this.forgot = forgot;
	}

}
