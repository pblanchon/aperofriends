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

import pco.aperofriends.model.Friend;
import pco.aperofriends.repository.FriendRepository;

@RestController
@CrossOrigin("http://localhost:4200")
public class FriendController {

	@Autowired
	FriendRepository friendRepository;

	/**
	 * Methode qui renvois l'ensemble des éléments de la table friend
	 * @param model
	 * @return friends
	 */
	@GetMapping("/friends")
	public ResponseEntity<?> friends() {
		List<Friend> friends = friendRepository.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(friends);// retourne la page friends
	}
	
	/**
	 * Methode qui permet d'ajouter un friend dans la table friend
	 * @param request
	 * @return createfriend
	 */
	@PostMapping("/createFriend")
	// @PreAuthorize("hasRole('ADMIN') OR hasRole('GESTIONNAIRE')")
	public ResponseEntity<?> createFriend(@RequestBody Friend newFriend) {
		Friend createFriend = friendRepository.save(newFriend);
		return ResponseEntity.status(HttpStatus.CREATED).body(createFriend);
	}
	
	/**
	 * Methode qui renvois l'ensemble des éléments de la table friend
	 * @param request
	 * @param model
	 * @return updateFriend
	 */
	@PutMapping("/updateFriend")
	// @PreAuthorize("hasRole('ADMIN') OR hasRole('GESTIONNAIRE')")
	public ResponseEntity<?> updateFriend(@RequestBody Friend friend) {
		Friend updateFriend = friendRepository.save(friend);
		return ResponseEntity.status(HttpStatus.CREATED).body(updateFriend);
	}

	@DeleteMapping("/deleteFriend/{id}")
	// @PreAuthorize("hasRole('ADMIN') OR hasRole('GESTIONNAIRE')")
	public ResponseEntity<?> deleteFriend(@PathVariable Integer idFriend) {
		friendRepository.deleteById(idFriend);
		return ResponseEntity.status(HttpStatus.OK).body(null);
	}

	// @PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/friend/{id}")
	public ResponseEntity<?> friend(@PathVariable Integer idFriend) {
		Optional<Friend> friendId = friendRepository.findById(idFriend);
		return ResponseEntity.status(HttpStatus.OK).body(friendId);
	}
}
