package com.github.knastasov.model;

import java.time.ZonedDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class Users {

	@Id
	private String id;

	private String name;

	private String email;

//	private StringBuilder password;
	private String password;

	private Boolean isAdmin;

	// timestamp
	private ZonedDateTime time;

	public Users() {
		super();
	}

	public Users(String name, String email, String password, Boolean isAdmin, ZonedDateTime time) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.isAdmin = isAdmin;
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public ZonedDateTime getTime() {
		return time;
	}

	public void setTime(ZonedDateTime time) {
		this.time = time;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", isAdmin="
				+ isAdmin + ", time=" + time + "]";
	}

}
