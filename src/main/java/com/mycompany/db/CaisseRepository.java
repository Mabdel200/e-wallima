package com.mycompany.db;

import com.mycompany.model.Caisse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CaisseRepository extends JpaRepository<Caisse, Long> {
}
