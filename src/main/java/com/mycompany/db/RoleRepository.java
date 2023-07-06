package com.mycompany.db;

import com.mycompany.model.ERole;
import com.mycompany.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import javax.management.relation.Role;
//import javax.management.relation.Role;
import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
   //Optional<Role> findByName(ERole name);
}
