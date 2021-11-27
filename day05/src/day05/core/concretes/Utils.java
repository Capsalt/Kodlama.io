package day05.core.concretes;

import day05.core.abstracts.Verify;
import day05.entities.concretes.Users;

public class Utils {
	
	public static void runVerify(Verify[] verifies, Users user) {
		for (Verify verify : verifies) {
			verify.verify(user);
		}
	}
}
