package pco.aperofriends.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pco.aperofriends.model.TypeItem;

@Repository
public interface TypeItemRepository extends JpaRepository<TypeItem, Integer> {

}
