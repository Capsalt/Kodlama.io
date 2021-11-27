package day05.business.abstracts;

import java.util.List;

import day05.entities.concretes.Users;

public interface UserService {

	void add(Users user);
	void update(Users user);
	void delete(Users user);
	
	List<Users> getAll();
	void login(Users user);
}
