package day05.entities.concretes;

import day05.entities.abstracts.Entity;

public class Users implements Entity {
	
	private int id;
	private String mail;
	private String password;
	
	public Users() {
	
	}

	public Users(int id, String email, String password) {
		super();
		this.id = id;
		this.mail = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
