package day05.core.concretes;

import day05.core.abstracts.Verify;
import day05.entities.concretes.Users;

public class EmailVerify implements Verify {
	
	public void verify(Users user) {
		System.out.println(user.getMail() + " kontrol ediliyor...");
		
	}

	public void isEmailVerify(Users user) {
		System.out.println(user.getMail() + " Doðrulandý.");
		
	}

}
