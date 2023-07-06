package com.mycompany.db;

import com.mycompany.model.MenuRestaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRestaurantRepository extends JpaRepository<MenuRestaurant, Long> {
}
