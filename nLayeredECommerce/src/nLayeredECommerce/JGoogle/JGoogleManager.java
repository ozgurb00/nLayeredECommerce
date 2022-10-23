package nLayeredECommerce.JGoogle;

import nLayeredECommerce.entities.concretes.User;

public class JGoogleManager {
	public void registerWithGoogle(User user){
        System.out.println("Registered with google : "+user.getName());
    }
}
