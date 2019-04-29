package pco.aperofriends.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pco.aperofriends.model.User;

@Service
public interface UserService {

	List<User> findAllUsers();
	
	Optional<User> findUserByIdUser(Integer idUser);
	
	User createUser(User newUser);
	
	User updateUser(User user);
		
 }
