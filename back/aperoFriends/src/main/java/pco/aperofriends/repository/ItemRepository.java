package pco.aperofriends.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pco.aperofriends.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer>{

}
