package com.mycompany.db;

import com.mycompany.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    //  Long getUserById(long id_users);


//    @Query(" select * from User u " +
//            " where u.email = ? and u.password= ?")
//    Optional<User> findUserWithEmailPassword(String username, String password);
}
