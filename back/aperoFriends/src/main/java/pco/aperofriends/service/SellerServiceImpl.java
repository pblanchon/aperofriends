package pco.aperofriends.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pco.aperofriends.model.Seller;
import pco.aperofriends.repository.SellerRepository;

@Service
public class SellerServiceImpl implements SellerService {
	
	private SellerRepository sellerRepository;
	
	public SellerServiceImpl(SellerRepository sellerRepository) {
		this.sellerRepository = sellerRepository;
	}
	
	@Override
	public List<Seller> findAllSellers(){
		return sellerRepository.findAll();
	}
	
	@Override
	public Optional<Seller> findSellerByIdSeller(Integer idSeller) {
		return sellerRepository.findById(idSeller);
	}
	
	@Override
    public Seller createSeller(Seller newSeller) {
        return sellerRepository.save(newSeller);
    }
	
	@Override
    public Seller saveSeller(Seller seller) {
        return sellerRepository.save(seller);
    }
	

}
