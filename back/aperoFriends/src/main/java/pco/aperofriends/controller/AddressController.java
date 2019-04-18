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

import pco.aperofriends.model.Address;
import pco.aperofriends.repository.AddressRepository;

@RestController
@CrossOrigin("http://localhost:4200")
public class AddressController {

	@Autowired
	AddressRepository addressRepository;

	/**
	 * Methode qui renvois l'ensemble des éléments de la table address
	 * 
	 * @param model
	 * @return address
	 */
	@GetMapping("/address")
	public ResponseEntity<?> address() {
		List<Address> address = addressRepository.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(address);// retourne la page address
	}
	
	/**
	 * Methode qui permet d'ajouter une address dans la table address
	 * @param request
	 * @return createAddress
	 */
	@PostMapping("/createAddress")
	// @PreAuthorize("hasRole('ADMIN') OR hasRole('GESTIONNAIRE')")
	public ResponseEntity<?> createAddress(@RequestBody Address newAddress) {
		Address createAddress = addressRepository.save(newAddress);
		return ResponseEntity.status(HttpStatus.CREATED).body(createAddress);
	}
	
	/**
	 * Methode qui renvois l'ensemble des éléments de la table address
	 * @param request
	 * @param model
	 * @return updateAddress
	 */
	@PutMapping("/updateAddress")
	// @PreAuthorize("hasRole('ADMIN') OR hasRole('GESTIONNAIRE')")
	public ResponseEntity<?> updateAddress(@RequestBody Address address) {

		Address updateAddress = addressRepository.save(address);
		return ResponseEntity.status(HttpStatus.CREATED).body(updateAddress);
	}

	@DeleteMapping("/deleteAddress/{id}")
	// @PreAuthorize("hasRole('ADMIN') OR hasRole('GESTIONNAIRE')")
	public ResponseEntity<?> deleteAddress(@PathVariable Integer idAddress) {
		addressRepository.deleteById(idAddress);
		return ResponseEntity.status(HttpStatus.OK).body(null);
	}

	public ResponseEntity<?> address(@PathVariable Integer idAddress) {
		Optional<Address> address = addressRepository.findById(idAddress);
		return ResponseEntity.status(HttpStatus.OK).body(address);
	}
	
}
