package pco.aperofriends.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pco.aperofriends.model.Address;
import pco.aperofriends.repository.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService {

	private AddressRepository addressRepository;
	
	public AddressServiceImpl(AddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}
	
	@Override
	public List<Address> findAllAddress(){
		return addressRepository.findAll();
	}
	
	@Override
	public Optional<Address> findAddressByIdAddress(Integer idAddress) {
		return addressRepository.findById(idAddress);
	}
	
	@Override
	public Address createAddress(Address newAddress) {
		return addressRepository.save(newAddress);
	}
	
	@Override
	public Address saveAddress(Address address) {
		return addressRepository.save(address);
	}
}
