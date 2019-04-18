package pco.aperofriends.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pco.aperofriends.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
