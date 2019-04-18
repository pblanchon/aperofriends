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

import pco.aperofriends.model.Seller;
import pco.aperofriends.repository.SellerRepository;

@RestController
@CrossOrigin("http://localhost:4200")
public class SellerController {

	@Autowired
	SellerRepository sellerRepository;

	/**
	 * Methode qui renvois l'ensemble des éléments de la table user
	 * 
	 * @param model
	 * @return seller
	 */
	@GetMapping("/seller")
	public ResponseEntity<?> sellers() {
		List<Seller> sellers = sellerRepository.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(sellers);// retourne la page seller
	}
	
	/**
	 * Methode qui permet d'ajouter un seller dans la table seller
	 * @param request
	 * @return createSeller
	 */
	@PostMapping("/createSeller")
	// @PreAuthorize("hasRole('ADMIN') OR hasRole('GESTIONNAIRE')")
	public ResponseEntity<?> createSeller(@RequestBody Seller newSeller) {
		Seller createSeller = sellerRepository.save(newSeller);
		return ResponseEntity.status(HttpStatus.CREATED).body(createSeller);
	}
	
	/**
	 * Methode qui renvois l'ensemble des éléments de la table seller
	 * @param request
	 * @param model
	 * @return updateSeller
	 */
	@PutMapping("/updateSeller")
	// @PreAuthorize("hasRole('ADMIN') OR hasRole('GESTIONNAIRE')")
	public ResponseEntity<?> updateSeller(@RequestBody Seller seller) {

		Seller updateSeller = sellerRepository.save(seller);
		return ResponseEntity.status(HttpStatus.CREATED).body(updateSeller);
	}

	@DeleteMapping("/deleteSeller/{id}")
	// @PreAuthorize("hasRole('ADMIN') OR hasRole('GESTIONNAIRE')")
	public ResponseEntity<?> deleteSeller(@PathVariable Integer idSeller) {
		sellerRepository.deleteById(idSeller);
		return ResponseEntity.status(HttpStatus.OK).body(null);
	}

	public ResponseEntity<?> seller(@PathVariable Integer idSeller) {
		Optional<Seller> sellers = sellerRepository.findById(idSeller);
		return ResponseEntity.status(HttpStatus.OK).body(sellers);
	}

}
