package com.mycompany.db;


import com.mycompany.model.Plats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatsRepository extends JpaRepository<Plats, Long> {
}
