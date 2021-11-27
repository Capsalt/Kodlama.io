package day05.business.concretes;

import java.util.List;
import day05.business.abstracts.UserService;
import day05.entities.concretes.Users;

public class UserManager implements UserService {

	@Override
	public void add(Users user) {
		

	}
	
	@Override
	public void update(Users user) {
	
		
	}

	@Override
	public void delete(Users user) {
	
		
	}

	@Override
	public List<Users> getAll() {
	
		return null;
	}

	@Override
	public void login(Users user) {
		System.out.println("Giriþ yapýldý.");
		
	}

}
