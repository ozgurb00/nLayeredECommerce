package nLayeredECommerce.business.abstracts;

import nLayeredECommerce.entities.concretes.User;

public interface UserService {
	void register(User user);
	void login(User user, String inputMail, String inputPassword);
}
