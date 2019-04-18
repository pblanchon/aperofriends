package pco.aperofriends.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pco.aperofriends.model.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{

}
