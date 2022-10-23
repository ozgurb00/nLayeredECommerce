package nLayeredECommerce.dataAccess.concretes;

import nLayeredECommerce.dataAccess.abstracts.UserDao;
import nLayeredECommerce.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Added with hibernate : "+user.getName() + " " + user.getSurname());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Updated with hibernate : "+user.getName() + " " + user.getSurname());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Deleted with hibernate : "+user.getName() + " " + user.getSurname());
		
	}

}
