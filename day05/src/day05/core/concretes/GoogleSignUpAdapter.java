package day05.core.concretes;

import day05.core.abstracts.SignUpService;
import day05.googleLogin.Login;

public class GoogleSignUpAdapter implements SignUpService{

	@Override
	public void signUp(String message) {
		
		Login login = new Login();
		login.login(message);
		
	}
	
	
	

}
