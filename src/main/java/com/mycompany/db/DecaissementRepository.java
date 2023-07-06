package com.mycompany.db;

import com.mycompany.model.Decaissement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DecaissementRepository extends JpaRepository<Decaissement, Long> {
}
