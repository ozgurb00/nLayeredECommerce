package nLayeredECommerce.business.concretes;

import nLayeredECommerce.business.abstracts.UserService;
import nLayeredECommerce.core.abstracts.GoogleService;
import nLayeredECommerce.dataAccess.abstracts.UserDao;
import nLayeredECommerce.entities.concretes.User;

public class UserManager implements UserService{
	private UserDao userDao;
	private GoogleService googleService;
	

	public UserManager(UserDao userDao, GoogleService googleService) {
		this.userDao = userDao;
		this.googleService = googleService;
	}

	@Override
	public void register(User user) {
		if (
				Validator.emailVerification(user.getEmail()) &&
				Validator.passwordVerification(user.getPassword()) &&
				Validator.nameVerification(user.getName(), user.getSurname()) 
			) {
			System.out.println("Verification code sent to " + user.getEmail() + " email address");
			System.out.println("Registration is completed");
		} else {
			System.out.println("Invalid email, password or name-surname");
            return;
		}
		userDao.add(user);
		googleService.withGoogle(user);
	}

	@Override
	public void login(User user, String inputMail, String inputPassword) {
		 if(     Validator.emailVerification(user.getEmail()) &&
	                Validator.passwordVerification(user.getPassword()) &&
	                user.getEmail().equals(inputMail) && user.getPassword().equals(inputPassword)
	        ){
	            System.out.println("Successfully logged in");
	        }else{
	            System.out.println("Incorrect email or pass");
	        }
		
	}
	
}
