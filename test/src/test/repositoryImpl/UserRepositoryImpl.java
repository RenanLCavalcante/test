package test.repositoryImpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import test.model.User;
import test.repository.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository{
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	@Override
	public boolean create(User user) {
		em.persist(user);
		return true;
	}
	
}
