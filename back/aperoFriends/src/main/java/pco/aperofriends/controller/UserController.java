package pco.aperofriends.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pco.aperofriends.model.User;
import pco.aperofriends.repository.UserRepository;

@RestController
@CrossOrigin("http://localhost:4200")
public class UserController {

	@Autowired
	UserRepository userRepository;

	/**
	 * Methode qui renvois l'ensemble des éléments de la table user
	 * @param model
	 * @return user
	 */
	@GetMapping("/users")
	public ResponseEntity<?> users() {
		List<User> users = userRepository.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(users);// retourne la page users
	}
	
	/**
	 * Methode qui permet d'ajouter un user dans la table user
	 * @param request
	 * @return createUser
	 */
	@PostMapping("/createUser")
	// @PreAuthorize("hasRole('ADMIN') OR hasRole('GESTIONNAIRE')")
	public ResponseEntity<?> createUser(@RequestBody User newUser) {
		User createUser = userRepository.save(newUser);
		return ResponseEntity.status(HttpStatus.CREATED).body(createUser);
	}
	
	/**
	 * Methode qui renvois l'ensemble des éléments de la table user
	 * @param request
	 * @param model
	 * @return updateUser
	 */
	@PutMapping("/updateUser")
	// @PreAuthorize("hasRole('ADMIN') OR hasRole('GESTIONNAIRE')")
	public ResponseEntity<?> updateUser(@RequestBody User user) {
		User updateUser = userRepository.save(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(updateUser);
	}

/*	@DeleteMapping("/deleteUser/{id}")
	// @PreAuthorize("hasRole('ADMIN') OR hasRole('GESTIONNAIRE')")
	public ResponseEntity<?> deleteUser(@PathVariable Integer idUser) {
		userRepository.deleteById(idUser);
		return ResponseEntity.status(HttpStatus.OK).body(null);
	}

	public ResponseEntity<?> user(@PathVariable Integer idUser) {
		Optional<User> users = userRepository.findById(idUser);
		return ResponseEntity.status(HttpStatus.OK).body(users);
	}
	*/
}
    

