package pco.aperofriends.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pco.aperofriends.model.Address;

@Service
public interface AddressService {
	
	List<Address> findAllAddress();
	
	Optional<Address> findAddressByIdAddress(Integer idAddress);
	
	Address createAddress(Address newAddress);
	
	Address saveAddress(Address address);
	
}
