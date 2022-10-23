package nLayeredECommerce.core.concretes;

import nLayeredECommerce.JGoogle.JGoogleManager;
import nLayeredECommerce.core.abstracts.GoogleService;
import nLayeredECommerce.entities.concretes.User;

public class GoogleManagerAdapter implements GoogleService{

	@Override
	public void withGoogle(User user) {
		JGoogleManager manager = new JGoogleManager();
		manager.registerWithGoogle(user);
	}

}
