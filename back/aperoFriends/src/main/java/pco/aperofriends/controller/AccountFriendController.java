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
import org.springframework.web.bind.annotation.RestController;

import pco.aperofriends.model.AccountFriend;
import pco.aperofriends.repository.AccountFriendRepository;

@RestController
//@CrossOrigin("http://localhost:4200")
public class AccountFriendController {
	
	@Autowired
	AccountFriendRepository accountFriendRepository;

	/**
	 * Methode qui renvois l'ensemble des éléments de la table friend
	 * 
	 * @param model
	 * @return friend
	 */
	@GetMapping("/accountFriend")
	public ResponseEntity<?> AccountFriends() {
		List<AccountFriend> accountFriends = accountFriendRepository.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(accountFriends);// retourne la page friends
	}
	
	/**
	 * Methode qui permet d'ajouter un friend dans la table friend
	 * @param request
	 * @return createfriend
	 */
	@PostMapping("/createAccountFriend")
	// @PreAuthorize("hasRole('ADMIN') OR hasRole('GESTIONNAIRE')")
	public ResponseEntity<?> createAccountFriend(@RequestBody AccountFriend newAccountFriend) {
		AccountFriend createAccountFriend = accountFriendRepository.save(newAccountFriend);
		return ResponseEntity.status(HttpStatus.CREATED).body(createAccountFriend);
	}
	
	/**
	 * Methode qui renvois l'ensemble des éléments de la table friend
	 * @param request
	 * @param model
	 * @return updateFriend
	 */
	@PutMapping("/updateAccountFriend")
	// @PreAuthorize("hasRole('ADMIN') OR hasRole('GESTIONNAIRE')")
	public ResponseEntity<?> updateAccountFriend(@RequestBody AccountFriend accountFriend) {

		AccountFriend updateAccountFriend = accountFriendRepository.save(accountFriend);
		return ResponseEntity.status(HttpStatus.CREATED).body(updateAccountFriend);
	}

/*	@DeleteMapping("/deleteFriend/{id}")
	// @PreAuthorize("hasRole('ADMIN') OR hasRole('GESTIONNAIRE')")
	public ResponseEntity<?> deleteAccountFriend(@PathVariable Integer idAccountFriend) {
		accountFriendRepository.deleteById(idAccountFriend);
		return ResponseEntity.status(HttpStatus.OK).body(null);
	}

	public ResponseEntity<?> accountFriend(@PathVariable Integer idAccountFriend) {
		Optional<AccountFriend> accountFriends = accountFriendRepository.findById(idAccountFriend);
		return ResponseEntity.status(HttpStatus.OK).body(accountFriends);
	}
*/

}
