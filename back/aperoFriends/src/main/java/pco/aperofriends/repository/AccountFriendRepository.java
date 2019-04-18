package pco.aperofriends.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pco.aperofriends.model.AccountFriend;

public interface AccountFriendRepository extends JpaRepository<AccountFriend, Integer> {

}
