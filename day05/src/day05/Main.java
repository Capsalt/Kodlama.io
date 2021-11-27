package day05;

import java.util.Scanner;

import day05.business.concretes.PersonelUserManager;
import day05.business.concretes.UserManager;
import day05.core.abstracts.Verify;
import day05.core.concretes.EmailVerify;
import day05.core.concretes.GoogleSignUpAdapter;
import day05.dataAccess.concretes.HibernateUserDao;
import day05.entities.concretes.PersonelUser;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Adýnýzý Giriniz : ");
		String ad = scan.nextLine();
		
		System.out.println("Soyadýnýzý Giriniz : ");
		String soyAd = scan.nextLine();
		
		System.out.println("Mail adresinizi Giriniz : ");
		String mail = scan.nextLine();
		
		System.out.println("Bir þifre belirleyiniz : ");
		String sifre = scan.nextLine();
		
		
		PersonelUser u1 = new PersonelUser();
		u1.setId(1);
		u1.setMail(mail);
		u1.setPassword(sifre);
		u1.setName(ad);
		u1.setSurname(soyAd);
		
		
		
		PersonelUserManager personalUserManager = new PersonelUserManager(new HibernateUserDao(),new Verify[] {new EmailVerify()});
		personalUserManager.add(u1);
		personalUserManager.add(u1, new GoogleSignUpAdapter());
		
		UserManager userManager = new UserManager();
		userManager.login(u1);
		
		scan.close();

	}

}
