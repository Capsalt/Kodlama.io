package day05.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import day05.core.abstracts.SignUpService;
import day05.core.abstracts.Verify;
import day05.core.concretes.Utils;
import day05.dataAccess.abstracts.UserDao;
import day05.entities.concretes.PersonelUser;

public class PersonelUserManager extends UserManager {
	
	private UserDao userDao;
	private Verify[] verifies;
	
	public PersonelUserManager(UserDao userDao, Verify[] verifies) {
		super();
		this.userDao = userDao;
		this.verifies = verifies;
	}
	
	String regex = "^(.+)@(.+)\\.(.+)$"; 
	Pattern pattern = Pattern.compile(regex);
	
	List<String> checkListEmails = new ArrayList<String>();
	
	public void add(PersonelUser personelUser) {
		
		if(personelUser.getPassword().length() < 6) {
			System.out.println("Paralanýz 6 karakterden az olamaz.");
			return;
		}else if(pattern.matcher(personelUser.getMail()).matches() == false) {
			System.out.println("Geçerli bir e-posta adresi yazýnýz");
			return;
		}else if(checkListEmails.contains(personelUser.getMail())) {
			System.out.println("Bu e-posta daha önce kullanýlmýþtýr.");
			return;
		}else if(personelUser.getName().length() < 2) {
			System.out.println("Ýsminiz 2 karakterden az olamaz!");
			return;
		}else if(personelUser.getSurname().length() < 2) {
			System.out.println("Soyadýnýz 2 karakterden az olamaz!");
			return;
		}
		checkListEmails.add(personelUser.getMail());
		userDao.add(personelUser);
		Utils.runVerify(verifies, personelUser);
	}
	
	public void add(PersonelUser personelUser, SignUpService signUpService) {
		signUpService.signUp("Google ile gelen " + personelUser.getName() + " isimli ");
		userDao.add(personelUser);
	}
	
	public void update(PersonelUser personelUser) {
		
	}
}
