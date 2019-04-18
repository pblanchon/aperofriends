package pco.aperofriends.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pco.aperofriends.model.User;
import pco.aperofriends.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public List<User> findAllUsers(){
		return userRepository.findAll();
	}
	
	@Override
	public Optional<User> findUserByIdUser(Integer idUser) {
		return userRepository.findById(idUser);
	}
	
	@Override
    public User createUser(User newUser) {
        return userRepository.save(newUser);
    }
	
	@Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
	
}
