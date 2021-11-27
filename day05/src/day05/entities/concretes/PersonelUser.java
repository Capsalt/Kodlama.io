package day05.entities.concretes;

public class PersonelUser extends Users {

	private String name;
	private String surname;
	public PersonelUser() {
		super();
	}

	public PersonelUser(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
}
