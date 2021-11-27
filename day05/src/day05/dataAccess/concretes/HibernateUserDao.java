package day05.dataAccess.concretes;

import day05.dataAccess.abstracts.UserDao;
import day05.entities.concretes.Users;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(Users user) {
		System.out.println(user.getId() + " id no'lu kullanýcý hibernate ile eklendi.");
		
	}

	@Override
	public void update(Users user) {
		System.out.println(user.getId() + " id no'lu kullanýcý hibernate ile güncellendi.");
		
	}

	@Override
	public void delete(Users user) {
		System.out.println(user.getId() + " id no'lu kullanýcý hibernate ile silindi.");
	}


}
