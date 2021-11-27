package day05.dataAccess.abstracts;

import day05.entities.concretes.Users;

public interface UserDao {

	void add(Users user);
	void update(Users user);
	void delete(Users user);
	
}
