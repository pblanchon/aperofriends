package pco.aperofriends.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pco.aperofriends.model.Command;

public interface CommandRepository extends JpaRepository<Command, Integer>{

}
