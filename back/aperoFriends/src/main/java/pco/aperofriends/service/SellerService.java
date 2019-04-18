package pco.aperofriends.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pco.aperofriends.model.Seller;

@Service
public interface SellerService {

	List<Seller> findAllSellers();
	
	Optional<Seller> findSellerByIdSeller(Integer idSeller);
	
	Seller createSeller(Seller seller);
	
	Seller saveSeller(Seller seller);
	
}
