package pco.aperofriends.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pco.aperofriends.model.AccountFriend;

@Repository
public interface AccountFriendRepository extends JpaRepository<AccountFriend, Integer> {

}
