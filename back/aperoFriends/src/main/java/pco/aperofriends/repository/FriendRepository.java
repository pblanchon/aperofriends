package pco.aperofriends.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pco.aperofriends.model.Friend;

public interface FriendRepository extends JpaRepository<Friend, Integer>{

}
