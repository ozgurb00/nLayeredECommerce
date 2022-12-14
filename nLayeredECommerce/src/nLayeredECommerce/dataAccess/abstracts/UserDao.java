package nLayeredECommerce.dataAccess.abstracts;

import nLayeredECommerce.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
}
