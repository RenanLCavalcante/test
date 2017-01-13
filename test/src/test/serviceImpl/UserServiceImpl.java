package test.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.model.User;
import test.repository.UserRepository;
import test.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository ur;
	
	@Override
	public boolean create(User user) {
		ur.create(user);
		return true;
	}

}
