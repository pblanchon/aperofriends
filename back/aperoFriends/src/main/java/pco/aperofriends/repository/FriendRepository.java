package pco.aperofriends.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pco.aperofriends.model.Friend;

@Repository
public interface FriendRepository extends JpaRepository<Friend, Integer>{

}
